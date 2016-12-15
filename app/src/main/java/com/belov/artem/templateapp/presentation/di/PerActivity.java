package com.belov.artem.templateapp.presentation.di;

import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by artem on 15.12.16.
 */
@Scope
@Retention(RUNTIME)
public @interface PerActivity {
}
