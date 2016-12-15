package com.belov.artem.templateapp.presentation.di.module;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.belov.artem.templateapp.presentation.di.PerActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by artem on 15.12.16.
 */

@Module
public class UserModule {
//    @Provides
//    @PerActivity GetUserListUseCase provideGetUserListUseCase(GetUserListUseCaseImpl getUserListUseCase) {
//        return getUserListUseCase;
//    }
//
//    @Provides @PerActivity
//    GetUserDetailsUseCase provideGetUserDetailsUseCase(GetUserDetailsUseCaseImpl getUserDetailsUseCase) {
//        return getUserDetailsUseCase;
//    }

    @Provides
    @PerActivity
    SharedPreferences providesSharedPreferences(Application application) {
        return PreferenceManager.getDefaultSharedPreferences(application);
    }
}
