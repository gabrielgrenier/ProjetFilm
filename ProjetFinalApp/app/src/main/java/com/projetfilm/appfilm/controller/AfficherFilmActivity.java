package com.projetfilm.appfilm.controller;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.projetfilm.appfilm.R;
import com.projetfilm.appfilm.model.Film;
import com.projetfilm.appfilm.outils.FilmCalls;
import com.squareup.picasso.Picasso;

import java.util.List;

public class AfficherFilmActivity extends AppCompatActivity implements FilmCalls.Callbacks{

    private Film film;
    private TextView titreFilm;
    private ImageView posterFilm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afficher_film);

        FilmCalls.fetchFilm(this, getIntent().getStringExtra("id"));

        titreFilm = (TextView) findViewById(R.id.titreFilm);
        posterFilm = (ImageView) findViewById(R.id.posterFilm);

        //titreFilm.setText(getIntent().getStringExtra("id"));
        Picasso.get().load(getIntent().getStringExtra("imageUrl")).fit().into(posterFilm);
    }

    @Override
    public void onResponse(@Nullable List<Film> films) {

    }

    @Override
    public void onFailure() {
        Toast.makeText(AfficherFilmActivity.this, "Can't connect to the API ", Toast.LENGTH_SHORT).show();
    }
}
