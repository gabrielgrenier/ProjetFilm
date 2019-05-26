package com.projetfilm.appfilm.controller;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.projetfilm.appfilm.R;
import com.projetfilm.appfilm.model.Film;
import com.projetfilm.appfilm.outils.BodyFilm;
import com.projetfilm.appfilm.outils.FilmCalls;

public class AjouterFilmActivity extends AppCompatActivity{

    private EditText id;
    private EditText titre;
    private EditText dateSortie;
    private EditText prix;
    private EditText lienImage;
    private EditText description;
    private Button bn_ajouter;
    private BodyFilm bodyFilm;
    private String chemin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajouter_film);

        titre = (EditText) findViewById(R.id.titre);
        dateSortie = (EditText) findViewById(R.id.dateSortie);
        prix = (EditText) findViewById(R.id.prix);
        lienImage = (EditText) findViewById(R.id.lien);
        description = (EditText) findViewById(R.id.desc);

        bn_ajouter = (Button) findViewById(R.id.buttonAjouter);



        bn_ajouter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*try {
                    date = new SimpleDateFormat("yyyy-MM-dd").parse(dateSortie.getText().toString());
                } catch (ParseException e) {
                    e.printStackTrace();
                }*/
                if(lienImage.getText().toString().equals("")){
                    chemin = "https://www.classicposters.com/images/nopicture.gif";
                }
                else{
                    chemin = lienImage.getText().toString();
                }
                bodyFilm = new BodyFilm(
                            titre.getText().toString(),
                            dateSortie.getText().toString(),
                            Double.valueOf(prix.getText().toString()),
                            chemin,
                            description.getText().toString());

                FilmCalls.ajouterFilm(bodyFilm);
                finish();
            }
        });

    }
}
