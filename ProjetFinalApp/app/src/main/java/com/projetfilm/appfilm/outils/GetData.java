package com.projetfilm.appfilm.outils;

import com.projetfilm.appfilm.model.Film;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Url;

public interface GetData {
    @GET
    Call<List<Film>> getFilms(@Url String url);
    @GET
    Call<Film> getFilm(@Url String url);
    @PUT
    Call<Film> modifierFilm(@Body Film film, @Url String url);
    @POST
    Call<Film> ajouterFilm(@Body BodyFilm bodyFilm,@Url String url);
    @DELETE
    Call<Film> deleteFilm(@Url String url);
}
