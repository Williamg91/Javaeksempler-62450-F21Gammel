package org.example.Gang10;

import java.sql.*;

public class ConnectionDRYnSOC {

    private Connection connection = null;
    private String SQLITEDriver = "jdbc:sqlite:";

    private String MYSQLDriver = "jdbc:mysql://" + "localhost:3306/";
    private String url;


    public ConnectionDRYnSOC() {


    }

    public Connection getSQLITEConnection(String Filename) {
        url = SQLITEDriver + Filename;
        try {
            connection = DriverManager.getConnection(url);
            if (connection != null) {
                System.out.println("Connected to: " + Filename);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return connection;
    }


    Connection getMYSQLConnection(String username, String password, String Schema) {
        url = MYSQLDriver + Schema + "?serverTimezone=Europe/Amsterdam&amp";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);

            if (connection != null) {
                System.out.println("Connected to");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        return connection;
    }
}
