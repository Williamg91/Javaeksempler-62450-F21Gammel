package org.example.Gang10;

import java.sql.Connection;

public class Main {


    public static void main(String[] args) {

        ConnectionSingleTon singleTon = new ConnectionSingleTon();
       Connection c1 = singleTon.connectToSQLITE("filnavn");

    }

}
