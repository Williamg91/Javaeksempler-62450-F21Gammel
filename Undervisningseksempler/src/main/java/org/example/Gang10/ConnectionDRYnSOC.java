package org.example.Gang10;

import java.sql.*;

public class ConnectionDRYnSOC {

    Connection connection =null;
private String SQLITEDriver ="";
private String MYSQLDriver = "jdbc:mysql://"+"localhost:3306/";

    Connection getSQLITEConnection(String URL){

        return connection;
    }

    Connection getMYSQLConnection(String URL,String username, String password,String Schema){


        return connection;
    }
}
