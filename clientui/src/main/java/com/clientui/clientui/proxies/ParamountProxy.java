package com.clientui.clientui.proxies;

import com.clientui.clientui.beans.FilmBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@FeignClient(name="apiParamount", url = "localhost:9292")
public interface ParamountProxy {
    @GetMapping(value = "films")
    List<FilmBean> listeFilms();

    @GetMapping(value = "film/{id}")
    FilmBean afficherUnFilm(@PathVariable("id") int id);

    @PostMapping(value = "/film")
    ResponseEntity<Void> ajouterFilm(@Valid @RequestBody FilmBean film);

    @DeleteMapping(value = "/film/{id}")
    ResponseEntity<Void> supprimerFilm(@PathVariable("id") int id);
}
