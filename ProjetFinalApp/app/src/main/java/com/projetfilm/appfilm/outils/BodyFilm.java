package com.projetfilm.appfilm.outils;

public class BodyFilm {
    private String titre;
    private String dateSortie;
    private double prixVisionnement;
    private String lienImage;
    private String description;

    public BodyFilm(String titre, String dateSortie, double prixVisionnement, String lienImage, String description) {
        this.titre = titre;
        this.dateSortie = dateSortie;
        this.prixVisionnement = prixVisionnement;
        this.lienImage = lienImage;
        this.description = description;
    }
}
