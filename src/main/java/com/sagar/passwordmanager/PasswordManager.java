package com.sagar.passwordmanager;

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
        Parent root = FXMLLoader.load(getClass().getResource("/views/splashscreen.fxml"));

        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("/styles.css").toExternalForm());

        setProperties(stage, scene);
        setUpScreenSwitching(stage);

        setUpDatabase();

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

    private void setUpDatabase() {
        ServerRuntime cayenneRuntime = ServerRuntime.builder()
                .addConfig("cayenne-project.xml")
                .build();
        ObjectContext context = cayenneRuntime.newContext();

        context.commitChanges();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
