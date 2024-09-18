package com.evergent.corejava.finalproject;

import java.sql.Connection;
import java.sql.DriverManager;

public class BloodDBConnection {
    public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/evergentdb",
                "root",
                "admin");
    }
}
