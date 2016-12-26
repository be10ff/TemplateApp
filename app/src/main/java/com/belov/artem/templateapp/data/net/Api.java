package com.belov.artem.templateapp.data.net;


import com.belov.artem.templateapp.data.entity.StringEntity;
import com.belov.artem.templateapp.data.net.responce.ApiResponse;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by artem on 15.12.16.
 */

public interface Api {


    @GET("/api/rest/v1/{locale}/android/rule")
    Observable<ApiResponse<StringEntity>> getAbout(
            @Path("locale") String locale
    );

    @GET("/api/rest/v1/{locale}/android/rule")
    Observable<ApiResponse<StringEntity>> getString(
            @Path("locale") String locale
    );
}
