package com.belov.artem.templateapp.data.net.repository;

import com.belov.artem.templateapp.data.entity.AboutEntity;
import com.belov.artem.templateapp.data.entity.mapper.AboutEntityDataMapper;
import com.belov.artem.templateapp.data.net.repository.datasource.AboutDataStoreFactory;
import com.belov.artem.templateapp.data.net.responce.ApiResponse;
import com.belov.artem.templateapp.domain.About;
import com.belov.artem.templateapp.domain.repository.AboutRepository;

import javax.inject.Inject;

import rx.Observable;
import rx.functions.Func1;

public class AboutDataRepository implements AboutRepository {

    private final AboutDataStoreFactory dataStoreFactory;
    private final AboutEntityDataMapper aboutEntityDataMapper;

    @Inject
    public AboutDataRepository(AboutDataStoreFactory dataStoreFactory, AboutEntityDataMapper entityDataMapper) {
        this.dataStoreFactory = dataStoreFactory;
        this.aboutEntityDataMapper = entityDataMapper;
    }

    @Override
    public Observable<ApiResponse<About>> about() {
        return  dataStoreFactory.create().about().map(new Func1<ApiResponse<AboutEntity>, ApiResponse<About>>() {
            @Override
            public ApiResponse<About> call(ApiResponse<AboutEntity> aboutEntityApiResponse) {
                return aboutEntityDataMapper.transform(aboutEntityApiResponse);
            }
        });
    }

}
