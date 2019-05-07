package com.projetfilm.appfilm.outils;

import com.projetfilm.appfilm.model.Film;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public interface GetData {
    @GET("Films")
    Call<List<Film>> getFilms();
}
