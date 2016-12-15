package com.belov.artem.templateapp.presentation.di.component;

import com.belov.artem.templateapp.presentation.di.PerActivity;
import com.belov.artem.templateapp.presentation.di.module.ActivityModule;
import com.belov.artem.templateapp.presentation.view.activity.BaseActivity;
import com.belov.artem.templateapp.presentation.view.activity.MainActivity;
import com.belov.artem.templateapp.presentation.di.module.NetModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by artem on 14.12.16.
 */

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules={ActivityModule.class, NetModule.class})
public interface NetComponent extends  ActivityComponent{
//    void inject(MainActivity activity);
     void inject(BaseActivity fragment);
    // void inject(MyService service);
}
