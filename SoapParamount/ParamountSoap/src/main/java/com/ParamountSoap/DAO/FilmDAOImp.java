package com.ParamountSoap.DAO;

import com.ParamountSoap.Model.Film;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FilmDAOImp implements FilmDAO {
    private Connection connect = null;
    public FilmDAOImp(Connection conn) {
        this.connect = conn;
    }

    public List<Film> findAll() {
        List<Film> films = new ArrayList<Film>();
        try {
            ResultSet result = this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM filmparamount");
            //int id, String titre, Date dateSortie, double prixVisionnement, String lienImage, String description
            while(result.next()) {
                films.add(new Film(result.getInt("id"),
                        result.getString("titre"),
                        result.getDate("date_sortie"),
                        result.getDouble("prix_visionnement"),
                        result.getString("lien_image"),
                        result.getString("description")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return films;
    }

    public Film findById(int id) {
        Film filmTemp = new Film();
        try {
            ResultSet result = this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM filmparamount WHERE id = " + id);
            if(result.first()){
                filmTemp = new Film(result.getInt("id"),
                        result.getString("titre"),
                        result.getDate("date_sortie"),
                        result.getDouble("prix_visionnement"),
                        result.getString("lien_image"),
                        result.getString("description"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return filmTemp;
    }

    public boolean delete(int id) {
        try {
            Statement stat = connect.createStatement();
            stat.executeUpdate("delete from filmparamount where id=" + id);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean add(String titre, String date, String description, double prix, String lienImage) {
        try{
            //Juste pour tester le format et faire erreur si pas bon format
            Date dateTemp =new SimpleDateFormat("yyyy-MM-dd").parse(date);

            Statement stat = connect.createStatement();
            stat.executeUpdate("insert into filmparamount(titre, date_sortie, prix_visionnement, lien_image, description)" +
                    "values ('"+titre+"','"+date+"', "+prix+",'"+lienImage+"','"+description+"')");
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean edit(int id, String titre, String date, String description, double prix, String lienImage) {
        try{
            //Juste pour tester le format et faire erreur si pas bon format
            Date dateTemp =new SimpleDateFormat("yyyy-MM-dd").parse(date);
            String sql = "UPDATE `filmparamount` SET " +
                    "date_sortie='"+date+"',description='"+description+"'," +
                    "lien_image='"+lienImage+"',prix_visionnement="+prix+"," +
                    "titre='"+titre+"' WHERE `id`="+id+"";
            Statement stat = connect.createStatement();
            stat.executeUpdate(sql);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
