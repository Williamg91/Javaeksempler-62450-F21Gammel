package org.example.Gang11;

import java.sql.Connection;

public class Main {


    public static void main(String[] args) {

       // ConnectionSingleTon singleTon= new ConnectionSingleTon();

        //singleTon.connectToSQLITE("sqlitefilnavn");


        ConnectionDRYnSOC refined = new ConnectionDRYnSOC();
       //refined.getSQLITEConnection("hestestalden");

       Connection mysql = refined.getMYSQLConnection("guest","hestehest","sundhedsteknologidb");
      //Connection sqlite = refined.getSQLITEConnection("sqlitefilnavn");

       UseDB dbuser = new UseDB(mysql);

/*
      for (int i=0;i<30;i++){

           dbuser.insertMeasurementsIntoTable(3402,((int) (Math.random()*1000)) ) ;
       }//Connection c1 = singleTon.connectToSQLITE("sqlitefilnavn");

        dbuser.findAllMeasurementsFromPatient(0,21);
*/
    }

}
