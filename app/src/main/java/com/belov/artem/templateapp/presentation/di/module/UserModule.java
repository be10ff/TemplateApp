package com.belov.artem.templateapp.presentation.di.module;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.belov.artem.templateapp.domain.interactor.AboutCase;
import com.belov.artem.templateapp.domain.interactor.UseCase;
import com.belov.artem.templateapp.domain.repository.AboutRepository;
import com.belov.artem.templateapp.presentation.di.PerActivity;

import dagger.Module;
import dagger.Provides;


@Module
public class UserModule {

    @Provides
    @PerActivity
    SharedPreferences providesSharedPreferences(Application application) {
        return PreferenceManager.getDefaultSharedPreferences(application);
    }

    @Provides
    @PerActivity
    UseCase provideAboutCase(
            AboutRepository aboutRepository) {
        return new AboutCase(aboutRepository);
    }
}
