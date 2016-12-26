package com.belov.artem.templateapp.presenter.impl

import com.belov.artem.templateapp.data.entity.mapper.DataMapper
import com.belov.artem.templateapp.data.net.ApiClient
import com.belov.artem.templateapp.presentation.model.StringModel
import com.belov.artem.templateapp.presenter.StringPresenter
import com.belov.artem.templateapp.view.StringView
import com.trello.rxlifecycle.LifecycleProvider
import com.trello.rxlifecycle.kotlin.bindToLifecycle
import rx.Subscriber
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers
import java.net.SocketTimeoutException
import java.net.UnknownHostException

/**
 * Created by artem on 26.12.16.
 */

class StringPresenterImpl (private val mapper: DataMapper, private val provider: LifecycleProvider<*>) : StringPresenter {

    private val apiService: ApiClient
    private var view: StringView? = null

    init {
        apiService = ApiClient()
    }

    override fun getString() {
        view?.showProgress()
        apiService.api.getString("en_en")
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnNext { responce ->
                    if(responce.errors != null){
                        throw RuntimeException()
                    }
                }
                .doOnUnsubscribe {  }
                .bindToLifecycle(provider)
                .map { responce -> mapper.transform(responce.result) }
                .subscribe ( object : Subscriber<StringModel>() {
                    override fun onCompleted() {
                    }

                    override fun onError(e: Throwable?) {
                        view?.hideProgress()
                        if (e is UnknownHostException || e is SocketTimeoutException) {
                            view?.onConnectionError()
                        } else {
                            view?.onInnerError()
                        }
                    }

                    override fun onNext(text: StringModel) {
                        view?.hideProgress()
                        view?.onStringResponce(text)
                    }


                }
                )
    }

    override fun setView(view: StringView) {
        this.view = view
    }

}