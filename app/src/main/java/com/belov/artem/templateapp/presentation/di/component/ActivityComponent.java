package com.belov.artem.templateapp.presentation.di.component;

import android.app.Activity;

import com.belov.artem.templateapp.presentation.di.PerActivity;
import com.belov.artem.templateapp.presentation.di.module.ActivityModule;

import dagger.Component;

/**
 * Created by artem on 15.12.16.
 */

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
    //Exposed to sub-graphs.
    Activity activity();
}
