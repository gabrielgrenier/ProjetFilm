package com.clientui.clientui.controller;

import com.clientui.clientui.beans.FilmBean;
import com.clientui.clientui.proxies.CenturyFoxProxy;
import com.clientui.clientui.proxies.MarvelProxy;
import com.clientui.clientui.proxies.ParamountProxy;
import com.clientui.clientui.proxies.SonyProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class ClientController {
    @Autowired
    MarvelProxy marvelProxy;
    @Autowired
    CenturyFoxProxy centuryFoxProxy;
    @Autowired
    ParamountProxy paramountProxy;
    @Autowired
    SonyProxy sonyProxy;

    @RequestMapping("/")
    public String accueil(Model model){
        //Films marvel
        List<FilmBean> listeMarvel = marvelProxy.listeFilms();
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
    //Ajout de film
    @RequestMapping(value = "/ajouterFilm")
    public RedirectView ajouterFilm(Model model, @RequestParam("titre") String titre, @RequestParam("producteur") String producteur,
                                                @RequestParam("date") String date, @RequestParam("description") String description,
                                                @RequestParam("prix") Double prix, @RequestParam("lien") String lienImage){
        try {
            //Converti la date
            Date dateTemp =new SimpleDateFormat("yyyy-MM-dd").parse(date);

            //Crée l'objet
            FilmBean filmTemp = new FilmBean();
            filmTemp.setDateSortie(dateTemp);
            filmTemp.setDescription(description);
            filmTemp.setLienImage(lienImage);
            filmTemp.setPrixVisionnement(prix);
            filmTemp.setTitre(titre);

            //Choisit d'envoyer l'objet au bon API
            switch (producteur){
                case "Century Fox":
                    centuryFoxProxy.ajouterFilm(filmTemp);
                    break;
                case "Marvel":
                    marvelProxy.ajouterFilm(filmTemp);
                    break;
                case "Paramount Picture":
                    paramountProxy.ajouterFilm(filmTemp);
                    break;
                case "Sony":
                    sonyProxy.ajouterFilm(filmTemp);
                    break;
            }

            //Envoie l'objet à l'api
            centuryFoxProxy.ajouterFilm(filmTemp);
            return new RedirectView("/");

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new RedirectView("/");
    }

    //Affichage details films
    @GetMapping(value = "/detail-filmCenturyFox/{id}")
    public String afficherFilmCentryFox(Model model,@PathVariable(value = "id")  int filmId){
        // Aller chercher le film
        FilmBean film = centuryFoxProxy.afficherUnFilm(filmId);
        // Ajouter le film
        model.addAttribute("film",film);
        model.addAttribute("producer","Century Fox");

        //Ramene la page d'accueil
        return "AffichageFilm";
    }
    @GetMapping(value = "/detail-filmMarvel/{id}")
    public String afficherFilmMarvel(Model model,@PathVariable(value = "id")  int filmId){
        // Aller chercher le film
        FilmBean film = marvelProxy.afficherUnFilm(filmId);
        // Ajouter le film
        model.addAttribute("film",film);
        model.addAttribute("producer","Marvel");

        //Ramene la page d'accueil
        return "AffichageFilm";
    }
    @GetMapping(value = "/detail-filmParamount/{id}")
    public String afficherFilmParamount(Model model,@PathVariable(value = "id")  int filmId){
        // Aller chercher le film
        FilmBean film = paramountProxy.afficherUnFilm(filmId);
        // Ajouter le film
        model.addAttribute("film",film);
        model.addAttribute("producer","Paramount Pictures");

        //Ramene la page d'accueil
        return "AffichageFilm";
    }
    @GetMapping(value = "/detail-filmSony/{id}")
    public String afficherFilmSony(Model model,@PathVariable(value = "id")  int filmId){
        // Aller chercher le film
        FilmBean film = sonyProxy.afficherUnFilm(filmId);
        // Ajouter le film
        model.addAttribute("film",film);
        model.addAttribute("producer","Sony");

        //Ramene la page d'accueil
        return "AffichageFilm";
    }
}
