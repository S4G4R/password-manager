package com.sagar.passwordmanager.management;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;

public class SceneManagement {

    private Stage main;

    public SceneManagement(Stage main) {
        this.main = main;
    }

    protected void changeScene(String fxml) throws Exception {
        Parent pane = FXMLLoader.load(getClass().getResource(fxml));
        this.main.getScene().setRoot(pane);
    }

}
