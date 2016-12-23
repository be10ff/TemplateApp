package com.belov.artem.templateapp.presentation.presenter;

import android.util.Log;

import com.belov.artem.templateapp.data.net.responce.ApiResponse;
import com.belov.artem.templateapp.domain.About;
import com.belov.artem.templateapp.domain.interactor.AboutCase;
import com.belov.artem.templateapp.domain.interactor.DefaultSubscriber;
import com.belov.artem.templateapp.presentation.mapper.AboutModelDataMapper;
import com.belov.artem.templateapp.presentation.view.AboutView;

import javax.inject.Inject;

public class AboutPresenter implements Presenter {

    private final AboutCase aboutCase;
    private final AboutModelDataMapper dataMapper;
    private AboutView view;

    @Inject
    public AboutPresenter(AboutCase aboutCase, AboutModelDataMapper dataMapper) {
        this.aboutCase = aboutCase;
        this.dataMapper = dataMapper;
    }

    @Override
    public void resume() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void destroy() {
        aboutCase.unsubscribe();
    }

    public void setView(AboutView view){
        this.view = view;
    }

    public void about(){
        aboutCase.execute(new AboutSubscriber());
    }

    private class AboutSubscriber extends DefaultSubscriber<ApiResponse<About>> {

        @Override
        public void onError(Throwable e) {
            Log.e("AppLog", Log.getStackTraceString(e));
        }

        @Override
        public void onNext(ApiResponse<About> aboutModelApiResponse) {
            view.onAbout(dataMapper.transform(aboutModelApiResponse.getResult()));
        }
    }
}
