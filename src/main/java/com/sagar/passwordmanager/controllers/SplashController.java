package com.sagar.passwordmanager.controllers;

import com.sagar.passwordmanager.management.AnimationManagement;
import javafx.scene.control.Button;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.SplitPane;

import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;

/**
 * This class controls the elements/events from the splash screen.
 * */

public class SplashController implements Initializable {

    // Pane dialogs
    @FXML private SplitPane SetPasswordDialog;
    @FXML private SplitPane EnterPasswordDialog;

    // Buttons of each dialog
    @FXML private Button SetMasterPassword;
    @FXML private Button EnterMasterPassword;

    // Mapping that stores a pane with its corresponding animation settings
    private HashMap<SplitPane, AnimationManagement> animators;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        //SetMasterPassword.setDisable(true);
        //EnterMasterPassword.setDisable(true);

        // Populate mapping
        animators = new HashMap<>();
        animators.put(SetPasswordDialog, new AnimationManagement(SetPasswordDialog));
        animators.put(EnterPasswordDialog, new AnimationManagement(EnterPasswordDialog));
    }

    @FXML
    private void enterMasterPassword() throws Exception {
        minimizeExpandedPanes();
        animators.get(EnterPasswordDialog).animate();

        // TODO: VALIDATION

        //SceneSwitcher.goToMain();
    }

    @FXML
    private void setMasterPassword() {
        minimizeExpandedPanes();
        animators.get(SetPasswordDialog).animate();

        // TODO: VALIDATION
    }

    private void minimizeExpandedPanes() {
        for (AnimationManagement pane : animators.values()) {
            if (!pane.isExpanded()) pane.animate();
        }
    }


}