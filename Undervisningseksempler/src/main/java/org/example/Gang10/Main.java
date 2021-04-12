package org.example.Gang10;

import java.sql.Connection;

public class Main {


    public static void main(String[] args) {

        ConnectionSingleTon singleTon= new ConnectionSingleTon();

        //singleTon.connectToSQLITE("sqlitefilnavn");


        ConnectionDRYnSOC refined = new ConnectionDRYnSOC();
       refined.getSQLITEConnection("sqlitefilnavn");

        //Connection c1 = singleTon.connectToSQLITE("sqlitefilnavn");

    }

}
