package com.projetfilm.appfilm.controller;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.projetfilm.appfilm.R;
import com.projetfilm.appfilm.model.Film;
import com.projetfilm.appfilm.outils.FilmCalls;
import com.projetfilm.appfilm.view.FilmViewAdapter;

import java.util.List;

public class ApiActivity extends AppCompatActivity implements FilmCalls.Callbacks{

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<Film> listeFilm;
    private String idCompagnie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_api);

        FilmCalls.fetchFilms(this, getIntent().getStringExtra("id"));

    }

    @Override
    public void onResponse(@Nullable List<Film> films) {

        recyclerView = findViewById(R.id.RecyclerView);
        adapter = new FilmViewAdapter(films);


        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(ApiActivity.this);
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onFailure() {

        Toast.makeText(ApiActivity.this, "Can't connect to the API ", Toast.LENGTH_SHORT).show();
    }
}
