package com.sagar.passwordmanager.controllers;

import com.sagar.passwordmanager.management.SceneManagement;

public class SceneSwitcher {

    private static SceneManagement instance;

    public SceneSwitcher(SceneManagement instance) {
        this.instance = instance;
    }

    public static SceneManagement getInstance() {
        return instance;
    }

    public static void goToMain() throws Exception {
        getInstance().changeScene("/views/mainscreen.fxml");
    }

}
