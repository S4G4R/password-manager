package com.sagar.passwordmanager.controllers;

import javafx.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class SplashController implements Initializable {

    @FXML
    private Button SetMaster;

    @FXML
    private Button StartButton;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        // Toggle below according to some condition
        // SetMaster.disableProperty().setValue(true);
        // StartButton.disableProperty().setValue(true);
    }

    @FXML
    private void showUI(ActionEvent event) {
        System.out.println("Main UI will be shown");
    }

    @FXML
    private void setMasterPassword(ActionEvent event) {
        System.out.println("Set password UI will be shown");
    }

}