package com.belov.artem.templateapp.presentation.di.component;

import android.app.Activity;

import com.belov.artem.templateapp.presentation.di.PerActivity;
import com.belov.artem.templateapp.presentation.di.module.ActivityModule;
import com.belov.artem.templateapp.presentation.di.module.UserModule;
import com.belov.artem.templateapp.presentation.view.fragment.BaseFragment;
import com.belov.artem.templateapp.presentation.view.fragment.MainFragment;

import dagger.Component;
import dagger.Module;
import dagger.Provides;

/**
 * Created by artem on 15.12.16.
 */

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = {ActivityModule.class, UserModule.class})
public interface UserComponent extends ActivityComponent {
    void inject(MainFragment fragment);
}
