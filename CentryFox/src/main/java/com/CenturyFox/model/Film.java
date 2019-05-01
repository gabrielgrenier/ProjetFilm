package com.CenturyFox.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name ="filmCenturyFox")
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"},
        allowGetters = true)
public class Film implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Length(min=1, max=50,message = "Le titre du Film doit être entre 1 et 50 lettres.")
    private String titre;
    @Column(nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateSortie;
    private double prixVisionnement;
    private String lienImage;
    private String description;

    //Constructeurs
    public Film() {
    }
    public Film(int id, @Length(min = 1, max = 50, message = "Le titre du Film doit être entre 1 et 50 lettres.") String titre, Date dateSortie, double prixVisionnement, String lienImage, String description) {
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
        this.prixVisionnement = prixVisionnement;
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
