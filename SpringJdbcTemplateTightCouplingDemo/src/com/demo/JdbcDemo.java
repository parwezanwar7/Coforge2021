package com.demo;
 
import java.sql.Connection;
import java.sql.DriverManager;
 
public class JdbcDemo {
 
    static final String DB_URL = "jdbc:mysql://localhost/";
    static final String USER = "root";
    static final String PASS = "root";
    static Connection connection = null;
 
    public static void main(String ar[]) {
 
        try {
            System.out.println("connecting..");
 
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(DB_URL, USER, PASS); // DriverManager is a class
            System.out.println("connected...");
 
        } catch (Exception e) {
 
        }
 
    }
 
}