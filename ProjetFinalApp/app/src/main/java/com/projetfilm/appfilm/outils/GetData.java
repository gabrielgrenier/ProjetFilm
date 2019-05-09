package com.projetfilm.appfilm.outils;

import com.projetfilm.appfilm.model.Film;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface GetData {
    @GET
    Call<List<Film>> getFilms(@Url String url);
}
