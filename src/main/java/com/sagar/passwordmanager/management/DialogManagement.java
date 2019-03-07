package com.sagar.passwordmanager.management;

import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;

public class DialogManagement {

    public static Dialog createMasterPasswordDialog() {
        Dialog dialog = new Dialog();

        dialog.setTitle("Set Password");

        dialog.getDialogPane().getButtonTypes().addAll(ButtonType.CLOSE, ButtonType.OK);

        StackPane container = new StackPane();

        Label text = new Label("Type password");
        TextField password = new TextField();
        Label confirmText = new Label("Confirm password");
        TextField confirmPassword = new TextField();

        container.setPrefSize(300,170);

        container.getChildren().addAll(text, password, confirmText, confirmPassword);
        container.getChildren().get(0).setTranslateY(-60);
        container.getChildren().get(1).setTranslateY(-30);
        container.getChildren().get(2).setTranslateY(20);
        container.getChildren().get(3).setTranslateY(50);

        dialog.getDialogPane().setContent(container);


        return dialog;
    }

}
