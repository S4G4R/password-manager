package com.sagar.passwordmanager;

import com.sagar.passwordmanager.management.SceneManagement;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PasswordManager extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/views/splashscreen.fxml"));

        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("/styles.css").toExternalForm());

        setProperties(stage, scene);

        SceneManagement sm = new SceneManagement(stage);
        stage.show();
    }

    public void setProperties(Stage stage, Scene scene) {
        stage.setScene(scene);
        stage.setTitle("Password Manager");
        stage.resizableProperty().setValue(false);
    }

    public static void main(String[] args) {
        launch(args);
    }

}
