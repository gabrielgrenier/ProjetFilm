package com.SonySoap.Service;

import com.SonySoap.DAO.ConnexionDB;
import com.SonySoap.DAO.FilmDAOImp;
import com.SonySoap.Model.Film;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService(serviceName = "SonySoap")
public class SonyService {

    private FilmDAOImp filmDao = new FilmDAOImp(ConnexionDB.getInstance());


    @WebMethod
    public Film getFilm(int id){
        return filmDao.findById(id);
    }

    @WebMethod
    public List<Film> getFilms(){
        return filmDao.findAll();
    }

    @WebMethod
    public boolean delete(int id){
        return filmDao.delete(id);
    }

    @WebMethod
    public boolean add(String titre, String date, String description, double prix, String lienImage){
        return filmDao.add(titre, date, description, prix, lienImage);
    }

    @WebMethod
    public boolean edit(int id, String titre, String date, String description, double prix, String lienImage){
        return filmDao.edit(id, titre, date, description, prix, lienImage);
    }
}
















