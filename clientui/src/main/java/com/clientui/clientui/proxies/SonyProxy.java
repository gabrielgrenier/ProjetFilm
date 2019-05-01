package com.clientui.clientui.proxies;

import com.clientui.clientui.beans.FilmBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;
@FeignClient(name="apiSony", url = "localhost:9291")
public interface SonyProxy {
    @GetMapping(value = "Films")
    List<FilmBean> listeFilms();

    @GetMapping(value = "Film/{id}")
    FilmBean afficherUnFilm(@PathVariable("id") int id);

    @PostMapping(value = "/Film")
    ResponseEntity<Void> ajouterFilm(@Valid @RequestBody FilmBean film);
}
