package com.projetfilm.appfilm.controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.projetfilm.appfilm.R;
import com.projetfilm.appfilm.model.Film;
import com.projetfilm.appfilm.outils.BodyFilm;
import com.projetfilm.appfilm.outils.FilmCalls;
import com.squareup.picasso.Picasso;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static java.lang.Integer.parseInt;

public class ModifierFilmActivity extends AppCompatActivity implements FilmCalls.CallbackFilm{

    private EditText id;
    private EditText titre;
    private EditText dateSortie;
    private EditText prix;
    private EditText lienImage;
    private EditText description;
    private Button bn_modifier;
    private Film film;
    private String date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modifier_film);

        id = (EditText) findViewById(R.id.id);
        id.setFocusable(false);
        titre = (EditText) findViewById(R.id.titre);
        dateSortie = (EditText) findViewById(R.id.dateSortie);
        prix = (EditText) findViewById(R.id.prix);
        lienImage = (EditText) findViewById(R.id.lien);
        description = (EditText) findViewById(R.id.desc);

        bn_modifier = (Button) findViewById(R.id.buttonModifier);

        FilmCalls.fetchFilm(this, getIntent().getIntExtra("idFilm", 0));

        bn_modifier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lienImage.getText().toString().equals("")){
                    film.setLienImage("https://www.classicposters.com/images/nopicture.gif");
                }
                else{
                    film.setLienImage(lienImage.getText().toString());
                }
                film.setTitre(titre.getText().toString());
                film.setDateSortie(stringToJsonStandard(dateSortie.getText().toString()));
                film.setPrixVisionnement(Double.parseDouble(prix.getText().toString()));
                film.setDescription(description.getText().toString());
                Toast.makeText(ModifierFilmActivity.this, stringToJsonStandard(dateSortie.getText().toString()).toString(), Toast.LENGTH_SHORT).show();


                /*FilmCalls.modifierFilm(film);

                Intent AfficherFilmActivityIntent = new Intent(ModifierFilmActivity.this, AfficherFilmActivity.class);
                AfficherFilmActivityIntent.putExtra("id",film.getId());
                startActivity(AfficherFilmActivityIntent);*/
            }
        });

    }

    //----- Réponse de la tâche FetchFilm

    @Override
    public void onResponse(@Nullable Film film) {
        this.film = film;
        id.setText(Integer.toString(film.getId()));
        titre.setText(film.getTitre());
        dateSortie.setText(dateToSring(film.getDateSortie()));
        prix.setText(Double.toString(film.getPrixVisionnement()));
        lienImage.setText(film.getLienImage());
        description.setText(film.getDescription());
    }

    @Override
    public void onFailure() {
        Toast.makeText(ModifierFilmActivity.this, "Can't connect to the API ", Toast.LENGTH_SHORT).show();
    }


    //----- Conversion pour les dates

    public String dateToSring(Date date){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String strDate= formatter.format(date);
        return strDate;
    }
    public Date stringToJsonStandard(String dateString){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        try {
            date = formatter.parse(dateString);

        }
        catch (ParseException e) {
            e.printStackTrace();
        }

        return date;

    }

}
