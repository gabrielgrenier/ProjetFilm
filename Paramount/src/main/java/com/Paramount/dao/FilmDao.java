package com.Paramount.dao;

import com.Paramount.model.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FilmDao extends JpaRepository<Film, Integer> {
    // Find by id
    Film findById(int id);
    // Find film en haut du prix min
    List<Film> findByPrixVisionnementGreaterThan(double prixMin);
    // Find film en bas du prix max
    List<Film> findByPrixVisionnementLessThan(double prixMax);

}
