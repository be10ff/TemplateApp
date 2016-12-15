package com.belov.artem.templateapp.presentation.di.module;

import android.app.Activity;

import com.belov.artem.templateapp.presentation.di.PerActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by artem on 15.12.16.
 */

@Module
public class ActivityModule {
    private final Activity activity;

    public ActivityModule(Activity activity) {
        this.activity = activity;
    }

    @Provides
    @PerActivity
    Activity activity() {
        return this.activity;
    }
}
