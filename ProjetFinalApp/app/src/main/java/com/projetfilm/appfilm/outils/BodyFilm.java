package com.projetfilm.appfilm.outils;

public class BodyFilm {
    private int id;
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

    public BodyFilm(int id, String titre, String dateSortie, double prixVisionnement, String lienImage, String description) {
        this.id = id;
        this.titre = titre;
        this.dateSortie = dateSortie;
        this.prixVisionnement = prixVisionnement;
        this.lienImage = lienImage;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDateSortie() {
        return dateSortie;
    }

    public void setDateSortie(String dateSortie) {
        this.dateSortie = dateSortie;
    }

    public double getPrixVisionnement() {
        return prixVisionnement;
    }

    public void setPrixVisionnement(double prixVisionnement) {
        this.prixVisionnement = prixVisionnement;
    }

    public String getLienImage() {
        return lienImage;
    }

    public void setLienImage(String lienImage) {
        this.lienImage = lienImage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
