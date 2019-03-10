package com.sagar.passwordmanager.controllers;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.SplitPane;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class SplashController implements Initializable {

    @FXML private SplitPane SetPasswordDialog;

    @FXML private Button SetMasterPassword;
    @FXML private Button EnterMasterPassword;

    private TranslateTransition transIn;
    private TranslateTransition transOut;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        //SetMasterPassword.setDisable(true);
        EnterMasterPassword.setDisable(true);

        // Set up sliding animation
        setUpAnimation();
    }

    private void setUpAnimation() {
        this.transIn = new TranslateTransition(Duration.millis(250), SetPasswordDialog);
        transIn.setToY(0);
        this.transOut = new TranslateTransition(Duration.millis(250), SetPasswordDialog);

        // Moving dialog up and away from main scene
        SetPasswordDialog.translateYProperty().setValue(-(SetPasswordDialog.getPrefHeight()));
    }

    @FXML
    private void enterMasterPassword() throws Exception {
        // TODO: VALIDATION

        SceneSwitcher.goToMain();
    }

    @FXML
    private void setMasterPassword() {

        if (SetPasswordDialog.getTranslateY() != 0) {
            transIn.play();
        } else {
            transOut.setToY(-(SetPasswordDialog.getPrefHeight()));
            transOut.play();
        }

        // TODO: VALIDATION

    }


}