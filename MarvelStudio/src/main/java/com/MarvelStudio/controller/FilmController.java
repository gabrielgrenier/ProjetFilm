package com.MarvelStudio.controller;

import com.MarvelStudio.dao.FilmDAO;
import com.MarvelStudio.exception.FilmNotFoundException;
import com.MarvelStudio.model.Film;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@Api(description="Vue des films de Marvel")
@RestController
public class FilmController {
    @Autowired
    private FilmDAO filmDAO;

    //Film = retourne tous les films
    @ApiOperation(value = "Retourne tous les films")
    @GetMapping(value= "Films")
    public List<Film> listeFilms() {
        List<Film> films = filmDAO.findAll();
        if(films.isEmpty()){throw new FilmNotFoundException("Il n'y a pas de films disponible");}
        return films;}

    //Film/{id} = retourne un film selon le id
    @ApiOperation(value="Récupère un film selon son id")
    @GetMapping(value = "Film/{id}")
    public Film afficherUnFilm(@PathVariable int id) throws FilmNotFoundException {
        Film film= filmDAO.findById(id);

        if(film == null) throw new FilmNotFoundException("Le film avec l'id "+id+" n'existe pas");
        return film;
    }

    //Retourne une liste de film en bas du prix maximum
    @ApiOperation(value = "Retourne tous les films en dessous d'un prix max")
    @GetMapping(value = "/Films/max/{prixMax}")
    public List<Film> listeFilmBasPrixMax(@PathVariable double prixMax){
        List<Film> listeFilm = filmDAO.findByPrixVisionnementLessThan(prixMax);
        if(listeFilm == null){throw new FilmNotFoundException("Aucun film en bas du prix : " + prixMax);}
        return listeFilm;
    }

    //Retourne une liste de film en haut du prix min
    @ApiOperation(value = "Retourne tous les films en haut d'un prix min")
    @GetMapping(value = "/Films/min/{prixMin}")
    public List<Film> listeFilmHautPrixMin(@PathVariable double prixMin){
        List<Film> listeFilm = filmDAO.findByPrixVisionnementGreaterThan(prixMin);
        if(listeFilm == null){throw new FilmNotFoundException("Aucun film en bas du prix : " + prixMin);}
        return listeFilm;
    }

    @PostMapping(value = "/Film")
    public ResponseEntity<Void> ajouterFilm(@Valid @RequestBody Film film){
        Film film1 = filmDAO.save(film);
        if(film1==null){return ResponseEntity.noContent().build();}
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(film1.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }
    @PostMapping(value = "/Film/{id}")
    public ResponseEntity<Void> modifierFilm(@Valid @RequestBody Film film){
        Film film1 = filmDAO.save(film);
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
        filmDAO.delete(tempFilm);
    }
}
