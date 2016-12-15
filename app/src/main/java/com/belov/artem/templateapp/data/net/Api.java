package com.belov.artem.templateapp.data.net;

import com.belov.artem.templateapp.presentation.model.Post;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by artem on 15.12.16.
 */

public interface Api {
    @GET("/posts")
    Call<List<Post>> getPosts();
}
