package com.sagar.passwordmanager.management;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

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
