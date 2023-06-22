package com.gestion.intervention_projet.repository;

import com.gestion.intervention_projet.entity.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Repository
public interface CompteRepository extends JpaRepository<Compte, String> {
//    private static Connection connection = null;
//
//    public static Connection getConnection() throws SQLException    {
//        if (connection != null) {
//            return connection;
//        }
//        else {
//            String driver = "com.mysql.cj.jdbc.Driver";
//            String url = "jdbc:mysql://localhost:3307/isj";
//            String user= "root";
//            String password= "Jesus/77*7";
//
//            try {
//                Class.forName(driver);
//                connection = DriverManager.getConnection(url, user, password);
//
//            } catch (ClassNotFoundException e)  {
//                e.printStackTrace();
//            }
//        }
//
//        return connection;
//    }
}
