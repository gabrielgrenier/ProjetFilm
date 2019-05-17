package com.MarvelSoap.DAO;

import com.MarvelSoap.Model.Film;

import java.util.List;

public interface FilmDAO {
    List<Film> findAll();
    Film findById(int id);
    boolean delete(int id);
    boolean add(String titre, String date, String description, double prix, String lienImage);
    boolean edit(int id, String titre, String date, String description, double prix, String lienImage);
}
