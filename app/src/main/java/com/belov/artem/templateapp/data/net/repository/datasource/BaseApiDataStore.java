package com.belov.artem.templateapp.data.net.repository.datasource;


public class BaseApiDataStore {

    private final String locale;

    public BaseApiDataStore() {

            locale = "en_us";

    }

    public String getLocale() {
        return locale;
    }
}
