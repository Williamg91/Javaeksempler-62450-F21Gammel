package org.example.Gang10;

import java.sql.Connection;

public class Main {


    public static void main(String[] args) {

       // ConnectionSingleTon singleTon= new ConnectionSingleTon();

        //singleTon.connectToSQLITE("sqlitefilnavn");


        ConnectionDRYnSOC refined = new ConnectionDRYnSOC();
      // refined.getSQLITEConnection("sqlitefilnavn");

       Connection mysql = refined.getMYSQLConnection("client","hestehest","SundhedsteknologiDB");
       UseDB dbuser = new UseDB(mysql);
       for (int i=0;i<30;i++){

           dbuser.insertMeasurementsIntoTable(21,((int) (Math.random()*1000)) ) ;
       }//Connection c1 = singleTon.connectToSQLITE("sqlitefilnavn");

        dbuser.findAllMeasurementsFromPatient(0,21);

    }

}
