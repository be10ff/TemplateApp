package com.belov.artem.templateapp.presentation.di.component;

import android.content.Context;

import com.belov.artem.templateapp.presentation.di.module.ApplicationModule;
import com.belov.artem.templateapp.presentation.view.activity.BaseActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by artem on 15.12.16.
 */

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    void inject(BaseActivity baseActivity);

    Context context();
}
