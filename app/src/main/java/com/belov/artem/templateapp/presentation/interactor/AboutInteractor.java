package com.belov.artem.templateapp.presentation.interactor;

import android.util.Log;

import com.belov.artem.templateapp.data.entity.AboutEntity;
import com.belov.artem.templateapp.data.net.ApiClient;
import com.belov.artem.templateapp.data.net.responce.ApiResponse;
import com.belov.artem.templateapp.domain.About;
import com.belov.artem.templateapp.domain.interactor.AboutCase;
import com.belov.artem.templateapp.domain.interactor.DefaultSubscriber;
import com.belov.artem.templateapp.presentation.mapper.AboutModelDataMapper;
import com.belov.artem.templateapp.presentation.presenter.Presenter;
import com.belov.artem.templateapp.presentation.view.AboutView;
import com.belov.artem.templateapp.presentation.view.AboutViewInt;

import javax.inject.Inject;

import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.subscriptions.Subscriptions;

public class AboutInteractor {

    private Subscription subscription = Subscriptions.empty();

    private AboutViewInt view;

    public AboutInteractor(AboutViewInt view) {
        this.view = view;
    }

    public void destroy() {
        subscription.unsubscribe();
    }

    public void about() {
        new ApiClient().getApi().getAbout("en_en")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new AboutSubscriber());
    }

    private class AboutSubscriber extends DefaultSubscriber<ApiResponse<AboutEntity>> {

        @Override
        public void onError(Throwable e) {
            Log.e("AppLog", Log.getStackTraceString(e));
        }

        @Override
        public void onNext(ApiResponse<AboutEntity> aboutModelApiResponse) {
            view.onAbout(aboutModelApiResponse.getResult());
        }
    }
}
