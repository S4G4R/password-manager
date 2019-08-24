package com.sagar.passwordmanager.configuration;

import com.sagar.passwordmanager.controllers.SceneSwitcher;
import com.sagar.passwordmanager.management.SceneManagement;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ScreenConfiguration {

    public ScreenConfiguration(Stage stage, Scene scene) {
        setProperties(stage, scene);
        setUpScreenSwitching(stage);
        stage.show();
    }

    private void setProperties(Stage stage, Scene scene) {
        stage.setScene(scene);
        stage.setTitle("Password Manager");
        stage.resizableProperty().setValue(false);
    }

    private void setUpScreenSwitching(Stage stage) {
        new SceneSwitcher(new SceneManagement(stage));
    }

}
