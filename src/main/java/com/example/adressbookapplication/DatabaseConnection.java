package com.example.adressbookapplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    Connection connection = DriverManager.getConnection("jdbc:sqlite:identifier.sqlite");

    public DatabaseConnection() throws SQLException {
    }
}
