package com.belov.artem.templateapp.presentation;

import android.app.Application;

import com.belov.artem.templateapp.presentation.di.component.ApplicationComponent;
import com.belov.artem.templateapp.presentation.di.component.DaggerApplicationComponent;
import com.belov.artem.templateapp.presentation.di.module.ApplicationModule;

/**
 * Created by artem on 14.12.16.
 */

public class App extends Application {

//    private NetComponent mNetComponent;
private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        // Dagger%COMPONENT_NAME%
//        mNetComponent = DaggerNetComponent.builder()
//                // list of modules that are part of this component need to be created here too
//                .appModule(new ApplicationModule(this)) // This also corresponds to the name of your module: %component_name%Module
//                .netModule(new NetModule("http://www.jsonplaceholder.typicode.com/"))
//                .build();

        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

//    public NetComponent getNetComponent() {
//        return mNetComponent;
//    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }
}
