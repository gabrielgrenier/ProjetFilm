package com.MarvelSoap.Model;

import java.io.Serializable;
import java.util.Date;

public class Film implements Serializable {
    private int id;

    private String titre;

    private Date dateSortie;
    private double prixVisionnement;
    private String lienImage;
    private String description;

    //Constructeurs
    public Film() {
    }
    public Film(int id, String titre, Date dateSortie, double prixVisionnement, String lienImage, String description) {
        this.id = id;
        this.titre = titre;
        this.dateSortie = dateSortie;
        this.prixVisionnement = prixVisionnement;
        this.lienImage = lienImage;
        this.description = description;
    }

    //Getter
    public int getId() {
        return id;
    }
    public String getTitre() {
        return titre;
    }
    public Date getDateSortie() {
        return dateSortie;
    }
    public double getPrixVisionnement() {
        return prixVisionnement;
    }
    public String getLienImage() {
        return lienImage;
    }
    public String getDescription() {
        return description;
    }

    //Setter
    public void setId(int id) {
        this.id = id;
    }
    public void setTitre(String titre) {
        this.titre = titre;
    }
    public void setDateSortie(Date dateSortie) {
        this.dateSortie = dateSortie;
    }
    public void setPrixVisionnement(double prixVisionnement) {
        prixVisionnement = prixVisionnement;
    }
    public void setLienImage(String lienImage) {
        this.lienImage = lienImage;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Film{" +
                "id='" + id + '\'' +
                ", titre='" + titre + '\'' +
                ", dateSortie=" + dateSortie +
                ", PrixVisionnement=" + prixVisionnement +
                ", lienImage='" + lienImage + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
