package com.sagar.passwordmanager.controllers;

import com.sagar.passwordmanager.management.SceneManagement;

/**
 * This class fetches the main stage and handles scene transitions.
 * */

public class SceneSwitcher {

    private static SceneManagement instance;

    public SceneSwitcher(SceneManagement instance) {
        this.instance = instance;
    }

    private static SceneManagement getInstance() {
        return instance;
    }

    public static void goToMain() throws Exception {
        getInstance().changeScene("/views/mainscreen.fxml");
    }

}
