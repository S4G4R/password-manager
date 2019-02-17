package com.sagar.passwordmanager.controllers;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.fxml.FXML;

public class SplashController {

    @FXML
    private Button SetMaster;
    @FXML
    private Button StartButton;

    public SplashController() {

    }

    @FXML
    private void showUI(ActionEvent event) throws Exception {
        SceneSwitcher.getInstance().changeScene("/views/mainscreen.fxml");
    }

    @FXML
    private void setMasterPassword(ActionEvent event) {
        System.out.println("Set password UI will be shown");
    }

}