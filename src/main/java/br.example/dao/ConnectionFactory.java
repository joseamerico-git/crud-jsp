package br.example.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionFactory {


    static Connection cnn = null;
    static Connection cnn1 = null;
    static public Statement stm = null;
    static String cep = "19800011";


    public static Connection getConnection() {
        try {

            cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp", "root", "root");
            stm = cnn.createStatement();
            // System.out.println("conectado");

        } catch (Exception e) {

        }
        return cnn;
    }


}
