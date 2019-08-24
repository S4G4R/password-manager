package com.sagar.passwordmanager;

import com.sagar.passwordmanager.configuration.DatabaseConfiguration;
import com.sagar.passwordmanager.configuration.ScreenConfiguration;
import com.sagar.passwordmanager.controllers.SceneSwitcher;
import com.sagar.passwordmanager.management.SceneManagement;

import com.sagar.passwordmanager.persistent.User;
import org.apache.cayenne.ObjectContext;
import org.apache.cayenne.configuration.server.ServerRuntime;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class PasswordManager extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        new DatabaseConfiguration();

        Parent root = FXMLLoader.load(getClass().getResource("/views/mainscreen.fxml"));

        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("/styles.css").toExternalForm());

        new ScreenConfiguration(stage, scene);
    }


    public static void main(String[] args) {
        launch(args);
    }

}
