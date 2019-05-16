package com.clientui.clientui.proxies;

import com.clientui.clientui.beans.FilmBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@FeignClient(name="apiMarvel", url = "localhost:9191")
public interface MarvelProxy {
    @GetMapping(value = "Films")
    List<FilmBean> listeFilms();

    @GetMapping(value = "Film/{id}")
    FilmBean afficherUnFilm(@PathVariable("id") int id);

    @PostMapping(value = "/Film")
    ResponseEntity<Void> ajouterFilm(@Valid @RequestBody FilmBean film);

    @DeleteMapping(value = "/Film/{id}")
    ResponseEntity<Void> supprimerFilm(@PathVariable("id") int id);
}
