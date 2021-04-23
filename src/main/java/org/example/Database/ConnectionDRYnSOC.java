package org.example.Database;

import java.sql.*;


public class ConnectionDRYnSOC {

    private static Connection connection = null;
    private static String SQLITEDriver = "jdbc:sqlite:";
    private static String MYSQLDriver = "jdbc:mysql://" + "localhost:3306/";
    private static String url;
// a rising tide lifts all boats.
    //AALLL BOOATS
    public ConnectionDRYnSOC() {


    }

    //Using singleton
    public  Connection getSQLITEConnection(String Filename) {
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
                System.out.println("Connected to MYSQL Schema:"+Schema);
            }

            String createTable1 = "CREATE TABLE if not exists `Patients` (\n" +
                    "  `id` int NOT NULL AUTO_INCREMENT,\n" +
                    "  `name` text,\n" +
                    "  `alder` int DEFAULT NULL,\n" +
                    "  `ptID` varchar(11) NOT NULL,\n" +
                    "  `CPR` varchar(11) DEFAULT NULL,\n" +
                    "  PRIMARY KEY (`id`),\n" +
                    "  UNIQUE KEY `ptID_UNIQUE` (`ptID`)\n" +
                    ") ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;";
            String createTable2 = "CREATE TABLE if not exists `Measurements` (\n" +
                    "  `id` int NOT NULL AUTO_INCREMENT,\n" +
                    "  `appid` int DEFAULT NULL,\n" +
                    "  `value1` double DEFAULT NULL,\n" +
                    "  `value2` double DEFAULT NULL,\n" +
                    "  `value3` double DEFAULT NULL,\n" +
                    "  `time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,\n" +
                    "  `ptID` varchar(11) NOT NULL,\n" +
                    "  PRIMARY KEY (`id`),\n" +
                    "  UNIQUE KEY `ptID_UNIQUE` (`ptID`)\n" +
                    ") ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;";
            String createTable3 = "CREATE TABLE if not exists `Appointments` (\n" +
                    "  `id` int NOT NULL AUTO_INCREMENT,\n" +
                    "  `dato` datetime DEFAULT CURRENT_TIMESTAMP,\n" +
                    "  `ptID` varchar(11) DEFAULT NULL,\n" +
                    "  PRIMARY KEY (`id`),\n" +
                    "  UNIQUE KEY `ptID_UNIQUE` (`ptID`),\n" +
                    "  CONSTRAINT `personID` FOREIGN KEY (`ptID`) REFERENCES `Patients` (`ptID`)\n" +
                    ") ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;";
            Statement statement= connection.createStatement();
            statement.executeQuery(createTable1);
            statement.executeQuery(createTable2);
            statement.executeQuery(createTable3);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }


}
