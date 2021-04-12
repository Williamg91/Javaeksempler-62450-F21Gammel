package org.example.Gang9;

import java.sql.Connection;
import java.sql.DatabaseMetaData;

public class Main {


    public static void main(String[] args) {

        ConnectionSingleTon singleTon = new ConnectionSingleTon();
       Connection c1 = singleTon.connectToSQLITE("filnavn");

    }

}
