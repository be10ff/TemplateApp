package com.belov.artem.templateapp.data.net;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.inject.Inject;

import okhttp3.Cache;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by artem on 14.12.16.
 */

public class ApiClient {
    @Inject
    Application application;

    public ApiClient() {
    }

    OkHttpClient client = new OkHttpClient();

    // Enable caching for OkHttp
    int cacheSize = 10 * 1024 * 1024; // 10 MiB
//    Cache cache = new Cache(getApplication().getCacheDir(), cacheSize);
//    client.setCache(cache);

    // Used for caching authentication tokens
    SharedPreferences sharedPrefeences = PreferenceManager.getDefaultSharedPreferences(application);

    // Instantiate Gson
    Gson gson = new GsonBuilder().create();
    GsonConverterFactory converterFactory = GsonConverterFactory.create(gson);

    // Build Retrofit
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.github.com")
            .addConverterFactory(converterFactory)
            .client(client)  // custom client
            .build();
}

