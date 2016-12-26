package com.belov.artem.templateapp.data.net;


import com.belov.artem.templateapp.data.entity.AboutEntity;
import com.belov.artem.templateapp.data.net.responce.ApiResponse;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;


public interface Api {


    @GET("/api/rest/v1/{locale}/android/rule")
    Observable<ApiResponse<AboutEntity>> getAbout(
            @Path("locale") String locale
    );
}
