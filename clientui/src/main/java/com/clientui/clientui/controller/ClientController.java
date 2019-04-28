package com.clientui.clientui.controller;

import com.clientui.clientui.beans.FilmBean;
import com.clientui.clientui.proxies.FilmProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ClientController {
    @Autowired
    FilmProxy filmProxy;

    @RequestMapping("/")
    public String accueil(Model model){
        List<FilmBean> listeFilms = filmProxy.listeFilms();
        model.addAttribute("listeFilms", listeFilms);

        return "Accueil";
    }
}
