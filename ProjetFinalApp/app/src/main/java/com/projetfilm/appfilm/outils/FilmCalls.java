package com.projetfilm.appfilm.outils;

import android.support.annotation.Nullable;
import android.widget.Switch;

import com.projetfilm.appfilm.model.Film;

import java.lang.ref.WeakReference;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class FilmCalls {
    public interface Callbacks{
        void onResponse(@Nullable List<Film> films);
        void onFailure();
    }

    public static void fetchFilms(final Callbacks callbacks, String api){
        int port = 0;
        String getAllMovie = "Films";
        final WeakReference<Callbacks> callbacksWeakReference = new WeakReference<Callbacks>(callbacks);

        switch(api){
            case "Marvel" :
                port=9191;
                break;
            case "Century" :
                port=6969;
                break;
            case "Paramount" :
                port=9292;
                getAllMovie = "films";
                break;
            case "Sony" :
                port=9291;
                break;
        }

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://10.0.2.2:"+port+"/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        GetData filmServices = retrofit.create(GetData.class);

        Call<List<Film>> call = filmServices.getFilms(getAllMovie);

        call.enqueue(new Callback<List<Film>>() {
            @Override
            public void onResponse(Call<List<Film>> call, Response<List<Film>> response) {
                if(callbacksWeakReference.get()!=null) callbacksWeakReference.get().onResponse(response.body());
            }

            @Override
            public void onFailure(Call<List<Film>> call, Throwable t) {
                System.out.println(t.toString());
                if(callbacksWeakReference.get()!=null) callbacksWeakReference.get().onFailure();
            }
        });
    }
}
