package com.belov.artem.templateapp.presentation.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import com.belov.artem.templateapp.R
import com.belov.artem.templateapp.data.entity.mapper.DataMapper
import com.belov.artem.templateapp.presentation.model.StringModel
import com.belov.artem.templateapp.presenter.StringPresenter
import com.belov.artem.templateapp.presenter.impl.StringPresenterImpl
import com.belov.artem.templateapp.view.StringView

import javax.inject.Inject

import butterknife.BindView
import butterknife.ButterKnife
import kotlinx.android.synthetic.main.fragment_main.*

/**
 * Created by artem on 22.12.16.
 */

class FirstFragment : BaseFragment(), StringView {

    override val layoutResource: Int
        get() = R.layout.fragment_main

    private var presenter: StringPresenter? = null

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater!!.inflate(R.layout.fragment_main, container, false)
        ButterKnife.bind(this, view)
        return view
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter = StringPresenterImpl(DataMapper(), this)
        presenter?.setView(this)
        presenter?.getString()
    }


    override fun onConnectionError() {

    }

    override fun onStringResponce(text: StringModel) {
        tvResponce.text = text.text
    }

    override fun onServerError() {

    }

    override fun onInnerError() {

    }

    override fun showProgress() {

    }

    override fun hideProgress() {

    }

    override fun onBackPressed() {

    }
}
