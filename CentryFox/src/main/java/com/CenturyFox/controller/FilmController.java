package com.CenturyFox.controller;

import com.CenturyFox.dao.FilmDao;
import com.CenturyFox.exceptions.FilmIntrouvableException;
import com.CenturyFox.model.Film;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@Api(description = "Gestion des Films de CenturyFox")
@RestController
public class FilmController {
    @Autowired
    private FilmDao filmDao;

    //Retourne tous les films de century fox
    @ApiOperation(value = "Retourne tous les films")
    @GetMapping(value = "/Films")
    public List<Film> listeFilms(){
        List<Film> films = filmDao.findAll();
        if(films.isEmpty()){throw new FilmIntrouvableException("Il n'y a pas de films disponible");}
        return films;
    }

    //Retourne un film
    @ApiOperation(value = "Retourne un film selon l'id")
    @GetMapping(value = "/Film/{id}")
    public Film afficherFilm(@PathVariable int id){
        Film film = filmDao.findById(id);
        if(film == null){throw new FilmIntrouvableException("Film introuvable avec l'id : " + id);}
        return film;
    }

    //Retourne une liste de film en bas du prix maximum
    @ApiOperation(value = "Retourne tous les films en dessous d'un prix max")
    @GetMapping(value = "/Films/max/{prixMax}")
    public List<Film> listeFilmBasPrixMax(@PathVariable double prixMax){
        List<Film> listeFilm = filmDao.findByPrixVisionnementLessThan(prixMax);
        if(listeFilm == null){throw new FilmIntrouvableException("Aucun film en bas du prix : " + prixMax);}
        return listeFilm;
    }

    //Retourne une liste de film en haut du prix min
    @ApiOperation(value = "Retourne tous les films en haut d'un prix min")
    @GetMapping(value = "/Films/min/{prixMin}")
    public List<Film> listeFilmHautPrixMin(@PathVariable double prixMin){
        List<Film> listeFilm = filmDao.findByPrixVisionnementGreaterThan(prixMin);
        if(listeFilm == null){throw new FilmIntrouvableException("Aucun film en bas du prix : " + prixMin);}
        return listeFilm;
    }

    //Ajouter un film dans la base de données
    @PostMapping(value = "/Film")
    public ResponseEntity<Void> ajouterFilm(@Valid @RequestBody Film film){
        Film film1 = filmDao.save(film);
        if(film1==null){return ResponseEntity.noContent().build();}
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(film1.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }
    @PutMapping(value = "/Film/{id}")
    public ResponseEntity<Void> modifierFilm(@Valid @RequestBody Film film){
        Film film1 = filmDao.save(film);
        if(film1!=null){return ResponseEntity.noContent().build();}
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(film1.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }
    // Supprimer un film de la BD
    @DeleteMapping (value = "/Film/{id}")
    public void supprimerFilm(@PathVariable int id) {
        Film tempFilm = new Film();
        tempFilm.setId(id);
        System.out.println(id);
        filmDao.delete(tempFilm);
    }
}
