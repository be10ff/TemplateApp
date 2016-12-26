package com.belov.artem.templateapp.presentation.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.belov.artem.templateapp.R;
import com.belov.artem.templateapp.data.entity.AboutEntity;
import com.belov.artem.templateapp.presentation.interactor.AboutInteractor;
import com.belov.artem.templateapp.presentation.view.AboutViewInt;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by artem on 22.12.16.
 */

public class MainFragment extends BaseFragment implements AboutViewInt {

    @BindView(R.id.tvResponce)
    TextView tvResponce;

    AboutInteractor interactor;


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

    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        interactor.destroy();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        interactor = new AboutInteractor();
        interactor.setView(this);
        interactor.about();
    }

    @Override
    public void onAbout(AboutEntity model) {
        tvResponce.setText(model.text);
    }

    @Override
    public void onError(String  message) {
        message(message);
    }
}
