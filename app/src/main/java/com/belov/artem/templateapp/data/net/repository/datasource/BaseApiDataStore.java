package com.belov.artem.templateapp.data.net.repository.datasource;

import com.belov.artem.templateapp.presentation.App;

public class BaseApiDataStore {

    private final String locale;

    public BaseApiDataStore() {
//        String temp = App.getInstance().getPreference().getLocale();
//        if (temp.contains("en")){
            locale = "en_us";
//        } else {
//            locale = "ru_ru";
//        }
    }

    public String getLocale() {
        return locale;
    }
}
