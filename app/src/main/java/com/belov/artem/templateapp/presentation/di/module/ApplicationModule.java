package com.belov.artem.templateapp.presentation.di.module;

import android.app.Application;
import android.content.Context;

import com.belov.artem.templateapp.presentation.App;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Module;
import dagger.Provides;

/**
 * Created by artem on 14.12.16.
 */

@Module
public class ApplicationModule {

    private final App application;

    public ApplicationModule(App application) {
        this.application = application;
    }

    @Provides
    @Singleton
    Application providesApplication() {
        return application;
    }

    @Provides
    @Singleton
    Context provideApplicationContext() {
        return this.application;
    }

    

}
