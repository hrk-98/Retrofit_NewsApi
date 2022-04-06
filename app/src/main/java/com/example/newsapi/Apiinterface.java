package com.example.newsapi;

import java.util.List;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

public interface Apiinterface {

    @GET("v1/search")
    Call<Modeldatum> getData(@Query("q")String q,
                             @Query("lang")String lang,
                             @Header("X-RapidAPI-Host")String Host,
                             @Header("X-RapidAPI-Key")String Key);
}
