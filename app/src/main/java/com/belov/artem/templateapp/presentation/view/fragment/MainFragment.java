package com.belov.artem.templateapp.presentation.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.belov.artem.templateapp.R;
import com.belov.artem.templateapp.presentation.di.component.DaggerUserComponent;
import com.belov.artem.templateapp.presentation.di.component.UserComponent;
import com.belov.artem.templateapp.presentation.model.AboutModel;
import com.belov.artem.templateapp.presentation.presenter.AboutPresenter;
import com.belov.artem.templateapp.presentation.view.AboutView;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainFragment extends BaseFragment implements AboutView{

    @BindView(R.id.tvResponce)
    TextView tvResponce;

    @Inject
    AboutPresenter aboutPresenter;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        UserComponent aboutComponent = DaggerUserComponent.builder()
                .applicationComponent(getApplicationComponent())
                .activityModule(getActivityModule())
                .build();

        aboutComponent.inject(this);
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        aboutPresenter.destroy();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        aboutPresenter.setView(this);
        aboutPresenter.about();

    }

    @Override
    public void onAbout(AboutModel model) {
        tvResponce.setText(model.text);
    }

    @Override
    public void onError(String  message) {
        message(message);
    }
}
