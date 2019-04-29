package com.clientui.clientui.proxies;

import com.clientui.clientui.beans.FilmBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="apiParamount", url = "localhost:9292")
public interface ParamountProxy {
    @GetMapping(value = "films")
    List<FilmBean> listeFilms();

    @GetMapping(value = "film/{id}")
    FilmBean afficherUnFilm(@PathVariable("id") int id);
}
