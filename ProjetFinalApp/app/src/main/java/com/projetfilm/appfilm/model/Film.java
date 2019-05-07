package com.projetfilm.appfilm.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class Film {

    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("titre")
    @Expose
    private String titre;
    @SerializedName("dateSortie")
    @Expose
    private Date dateSortie;
    @SerializedName("prixVisionnement")
    @Expose
    private double prixVisionnement;
    @SerializedName("lienImage")
    @Expose
    private String lienImage;
    @SerializedName("description")
    @Expose
    private String description;

    public int getId() { return id;}
    public void setId(int id) {this.id = id;}

    public String getTitre() {return titre;}
    public void setTitre(String titre) {this.titre = titre;}

    public Date getDateSortie() {return dateSortie;}
    public void setDateSortie(Date dateSortie) {this.dateSortie = dateSortie;}

    public double getPrixVisionnement() {return prixVisionnement;}
    public void setPrixVisionnement(double prixVisionnement) {this.prixVisionnement = prixVisionnement;}

    public String getLienImage() {return lienImage;}
    public void setLienImage(String lienImage) {this.lienImage = lienImage;}

    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}
}
