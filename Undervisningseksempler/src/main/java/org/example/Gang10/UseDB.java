package org.example.Gang10;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UseDB {

    private Statement statement;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;
    private Connection connection;
    public UseDB(Connection connection){
        this.connection=connection;
      //  System.out.println("I got the connection named..."+connection.toString());
    }

    int randomheltal = (int) (Math.random() * 1000);

    public void insertMeasurementsIntoTable( int patientID, int Appointmentid){

        double randomdecimal = Math.random() * 1000*1000*1000;
        String SQL ="insert into Measurements(value1,value2,value3,ptID) values(?,?,?,?);";
        try {
            preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setDouble(1,randomdecimal);
            //kan skiftes ud, er bare for syns skyld.
            preparedStatement.setDouble(2,randomdecimal);
            preparedStatement.setDouble(3,randomdecimal);
            preparedStatement.setInt(4,patientID);
            preparedStatement.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }


    public void findAllMeasurementsFromPatient(int appointmentID,int patientID){
        ArrayList liste = new ArrayList();
        //placeholder til værdier, som kan returneres.

        String SQL= "SELECT * FROM SundhedsteknologiDB.Measurements where ptID="+patientID+";";
        try {

           statement=connection.createStatement();
            resultSet = statement.executeQuery(SQL);
            while(resultSet.next()){
                //Hvad skal vi have ud?
                System.out.println(
                        "id:"+resultSet.getInt(1) +"\n"+
                        "value1:"+resultSet.getDouble("value1") +"\n"+
                                "value2:"+resultSet.getDouble("value2") +"\n"+
                                "value3:"+resultSet.getDouble("value3") +"\n"+
                        "patientid:"+resultSet.getInt("ptID") +"\n"
                );

            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


       //return liste;
    }



}
