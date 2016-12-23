package com.belov.artem.templateapp.data.net.repository.datasource;

import com.belov.artem.templateapp.data.entity.AboutEntity;
import com.belov.artem.templateapp.data.net.ApiClient;
import com.belov.artem.templateapp.data.net.responce.ApiResponse;

import rx.Observable;

public class ApiAboutApiDataStore extends BaseApiDataStore implements AboutDataStore {

    private final ApiClient apiClient;

    public ApiAboutApiDataStore() {
        apiClient = new ApiClient();
    }

    @Override
    public Observable<ApiResponse<AboutEntity>> about() {
        return apiClient.getApi().getAbout(getLocale());
    }

}
