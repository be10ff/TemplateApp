package com.belov.artem.templateapp.presentation.view.activity;

import android.app.Application;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.belov.artem.templateapp.presentation.App;
import com.belov.artem.templateapp.presentation.di.component.ApplicationComponent;
import com.belov.artem.templateapp.presentation.di.module.ActivityModule;

/**
 * Created by artem on 15.12.16.
 */

public class BaseActivity  extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getApplicationComponent().inject(this);
    }

    protected ApplicationComponent getApplicationComponent() {
        return ((App)getApplication()).getApplicationComponent();
    }

//    protected ActivityModule getActivityModule() {
//        return new ActivityModule(this);
//    }
}
