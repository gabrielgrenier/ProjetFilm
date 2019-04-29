package com.clientui.clientui.controller;

import com.clientui.clientui.beans.FilmBean;
import com.clientui.clientui.proxies.CenturyFoxProxy;
import com.clientui.clientui.proxies.MarvelProxy;
import com.clientui.clientui.proxies.ParamountProxy;
import com.clientui.clientui.proxies.SonyProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ClientController {
    @Autowired
    MarvelProxy filmProxy;
    @Autowired
    CenturyFoxProxy centuryFoxProxy;
    @Autowired
    ParamountProxy paramountProxy;
    @Autowired
    SonyProxy sonyProxy;

    @RequestMapping("/")
    public String accueil(Model model){
        //Films marvel
        List<FilmBean> listeMarvel = filmProxy.listeFilms();
        //Films centuryFox
        List<FilmBean> listeCenturyFox = centuryFoxProxy.listeFilms();
        //Films paramountFox
        List<FilmBean> listeParamount = paramountProxy.listeFilms();
        //Films paramountFox
        List<FilmBean> listeSony = sonyProxy.listeFilms();

        //Ajout des listes
        model.addAttribute("listeMarvel", listeMarvel);
        model.addAttribute("listeCenturyFox", listeCenturyFox);
        model.addAttribute("listeParamount", listeParamount);
        model.addAttribute("listeSony", listeSony);

        //Ramene la page d'accueil
        return "Accueil";
    }
}
