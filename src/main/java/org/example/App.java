package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException {
        System.out.println( "Hello World!" );
        String url = "jdbc:postgresql://localhost/postgres?user=postgres&password=123";
        Connection conn = DriverManager.getConnection(url);
    }
}
