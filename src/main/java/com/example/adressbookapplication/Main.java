package com.example.adressbookapplication;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main extends Application {
    public Main() throws SQLException {
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("GUI.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1024, 768);
        stage.setTitle("AdressbookApplication");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();

            checkDrivers();    //check for driver errors
        }
        private static boolean checkDrivers() {
            try {
                Class.forName("org.sqlite.JDBC");
                DriverManager.registerDriver(new org.sqlite.JDBC());
                return true;
            } catch (ClassNotFoundException | SQLException classNotFoundException) {
                Logger.getAnonymousLogger().log(Level.SEVERE, LocalDateTime.now() + ": Could not start SQLite Drivers");
                return false;
            }
        }

    }

