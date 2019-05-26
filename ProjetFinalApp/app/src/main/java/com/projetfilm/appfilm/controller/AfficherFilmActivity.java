package com.projetfilm.appfilm.controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.view.Menu;

import com.projetfilm.appfilm.R;
import com.projetfilm.appfilm.model.Film;
import com.projetfilm.appfilm.outils.FilmCalls;
import com.squareup.picasso.Picasso;

import java.util.List;

public class AfficherFilmActivity extends AppCompatActivity implements FilmCalls.CallbackFilm{

    private Film film;
    private TextView titreFilm;
    private ImageView posterFilm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afficher_film);

        FilmCalls.fetchFilm(this, getIntent().getIntExtra("id", 0));
        titreFilm = (TextView) findViewById(R.id.titreFilm);
        posterFilm = (ImageView) findViewById(R.id.posterFilm);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.film_menu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        int  id =  item.getItemId();
        if (id==R.id.supprimer){
            FilmCalls.supprimerFilm(getIntent().getIntExtra("id", 0));
            finish();
        }
        return true;
    }
    @Override
    public void onResponse(@Nullable Film film) {
        titreFilm.setText(film.getTitre());
        Picasso.get().load(film.getLienImage()).fit().into(posterFilm);
    }

    @Override
    public void onFailure() {
        Toast.makeText(AfficherFilmActivity.this, "Can't connect to the API ", Toast.LENGTH_SHORT).show();
    }
}
