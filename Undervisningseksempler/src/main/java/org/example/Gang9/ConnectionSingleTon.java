package org.example.Gang9;

import java.sql.*;
public class ConnectionSingleTon {

private String url,adresse,user,password;


private Connection conn = null;
private ResultSet resultSet;
private Statement statement;

    public ConnectionSingleTon(){
        user = "client";
        password ="hestehest";
        String schema = "SundhedsteknologiDB";
        adresse = "jdbc:mysql://" +
                "localhost:3306/" + schema+"?serverTimezone=Europe/Amsterdam&amp";


        System.out.println("Connection attempt");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //skal skiftes hvis der bruges SQLITE
            conn = DriverManager.getConnection(adresse,user,password);

            //connect to MYSQL from Java.
            if (conn!=null){
                System.out.println("Online");
            }


            statement = conn.createStatement();
            String SQL = "Select * from Persons;";

            resultSet = statement.executeQuery(SQL);
            while (resultSet.next()){
                System.out.println(
                        "ID: "+ resultSet.getInt(+1) +" "+
                         "Name:"+ resultSet.getString(2)
                        + resultSet.get
                );


            }


        String SQLQuery = "select * from SundhedsteknologiDB.Measurements ;";





        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
