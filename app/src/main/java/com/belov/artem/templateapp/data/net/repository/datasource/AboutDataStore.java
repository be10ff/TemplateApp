package com.belov.artem.templateapp.data.net.repository.datasource;

import com.belov.artem.templateapp.data.entity.AboutEntity;
import com.belov.artem.templateapp.data.net.responce.ApiResponse;

import rx.Observable;

public interface AboutDataStore {

    Observable<ApiResponse<AboutEntity>> about();

}
