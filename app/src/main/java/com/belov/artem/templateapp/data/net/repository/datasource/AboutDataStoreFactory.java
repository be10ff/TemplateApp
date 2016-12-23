package com.belov.artem.templateapp.data.net.repository.datasource;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class AboutDataStoreFactory {

    @Inject
    public AboutDataStoreFactory() {
    }

    public ApiAboutApiDataStore create() {
        return new ApiAboutApiDataStore();
    }

}
