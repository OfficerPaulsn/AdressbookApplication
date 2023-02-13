package com.example.adressbookapplication;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onCreateButtonClick() {
    }
    @FXML
    protected void onChangeButtonClick() {
    }
    @FXML
    protected void onDeleteButtonClick() {
    }

    @FXML
    private TableColumn VName;

    @FXML
    private TableColumn LName;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        DatabaseConnection connectnow = new DatabaseConnection;
    }
}