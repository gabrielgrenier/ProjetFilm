package com.CenturySoap.DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnexionDB {

    private static String url = "jdbc:mysql://localhost/cataloguecenturyfox?serverTimezone=EST";
    private static String user = "root";
    private static String passwd = "root";
    private static Connection connect;

    public static Connection getInstance(){
        if(connect == null){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connect = DriverManager.getConnection(url, user, passwd);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return connect;
    }

}
