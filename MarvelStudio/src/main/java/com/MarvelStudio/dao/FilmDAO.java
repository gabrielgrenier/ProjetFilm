package com.MarvelStudio.dao;

import com.MarvelStudio.model.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FilmDAO extends JpaRepository<Film,Integer> {
    Film findById(int id);
    //Find film en haut du prix min
    List<Film> findByPrixVisionnementGreaterThan(double prixMin);
    //Find film en bas du prix max
    List<Film> findByPrixVisionnementLessThan(double prixMax);
}
