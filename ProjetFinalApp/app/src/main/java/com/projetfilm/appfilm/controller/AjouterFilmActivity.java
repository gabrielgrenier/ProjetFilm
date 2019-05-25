package com.projetfilm.appfilm.controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.projetfilm.appfilm.R;

public class AjouterFilmActivity extends AppCompatActivity {

    private EditText id;
    private EditText titre;
    private EditText dateSortie;
    private EditText prix;
    private EditText lienImage;
    private EditText description;
    private Button bn_ajouter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajouter_film);

        id = (EditText) findViewById(R.id.id);
        titre = (EditText) findViewById(R.id.titre);
        dateSortie = (EditText) findViewById(R.id.dateSortie);
        prix = (EditText) findViewById(R.id.prix);
        lienImage = (EditText) findViewById(R.id.lien);
        description = (EditText) findViewById(R.id.desc);

        bn_ajouter = (Button) findViewById(R.id.buttonAjouter);
        bn_ajouter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ApiActivityIntent = new Intent(AjouterFilmActivity.this, ApiActivity.class);
                ApiActivityIntent.putExtra("id","Sony");
                startActivity(ApiActivityIntent);
            }
        });

    }

}
