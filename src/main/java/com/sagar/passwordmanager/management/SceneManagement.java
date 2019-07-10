package com.sagar.passwordmanager.management;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * This class sets the main stage and provides some functionality to manipulate its current scene.
 * */
public class SceneManagement {

    private final Stage main;

    public SceneManagement(Stage main) {
        this.main = main;
    }

    public Scene getCurrentScene() {
        return this.main.getScene();
    }

    public void changeScene(String fxml) throws Exception {
        Parent pane = FXMLLoader.load(getClass().getResource(fxml));
        getCurrentScene().setRoot(pane);
    }

}
