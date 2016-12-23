package com.belov.artem.templateapp.presentation.view.activity;


import android.os.Bundle;

import com.belov.artem.templateapp.R;

import com.belov.artem.templateapp.presentation.view.fragment.MainFragment;

import butterknife.ButterKnife;


public class MainActivity extends BaseActivity/* implements HasComponent*/{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
//        initializeInjector();

        addFragment(R.id.flContent, new MainFragment());
    }

}
