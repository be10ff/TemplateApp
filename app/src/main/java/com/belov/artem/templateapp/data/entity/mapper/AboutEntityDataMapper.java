package com.belov.artem.templateapp.data.entity.mapper;

import com.belov.artem.templateapp.data.entity.AboutEntity;
import com.belov.artem.templateapp.data.entity.mapper.utils.EntityUtils;
import com.belov.artem.templateapp.data.net.responce.ApiResponse;
import com.belov.artem.templateapp.domain.About;

import javax.inject.Inject;

public class AboutEntityDataMapper {

    @Inject
    public AboutEntityDataMapper() {
    }

    public ApiResponse<About> transform(ApiResponse<AboutEntity> aboutEntityApiResponse) {
        ApiResponse<About> apiResponse = new ApiResponse<>();
        apiResponse.setResult(EntityUtils.transform(aboutEntityApiResponse.getResult()));
        apiResponse.setErrors(aboutEntityApiResponse.getErrors());
        return apiResponse;
    }
}
