package com.belov.artem.templateapp.presentation;

import android.app.Application;

import com.belov.artem.templateapp.presentation.di.component.ApplicationComponent;
import com.belov.artem.templateapp.presentation.di.component.DaggerApplicationComponent;
import com.belov.artem.templateapp.presentation.di.module.ApplicationModule;

public class App extends Application {

private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }
}
