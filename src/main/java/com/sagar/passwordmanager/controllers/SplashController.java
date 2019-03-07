package com.sagar.passwordmanager.controllers;

import com.sagar.passwordmanager.management.DialogManagement;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Dialog;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import java.net.URL;
import java.util.ResourceBundle;

public class SplashController implements Initializable {

    @FXML
    private Button SetMasterPassword;
    @FXML
    private Button LoginButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        //SetMasterPassword.setDisable(true);
        LoginButton.setDisable(true);
    }

    @FXML
    private void enterMasterPassword(ActionEvent event) throws Exception {
        // TODO: VALIDATION

        SceneSwitcher.goToMain();
    }

    @FXML
    private void setMasterPassword(ActionEvent event) {
        // TODO: VALIDATION
        Dialog dialog = DialogManagement.createMasterPasswordDialog();

        dialog.showAndWait();

        System.out.println(dialog.getResult());
    }


}