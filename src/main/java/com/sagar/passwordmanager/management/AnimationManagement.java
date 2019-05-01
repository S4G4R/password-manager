package com.sagar.passwordmanager.management;

import javafx.animation.TranslateTransition;
import javafx.scene.control.SplitPane;
import javafx.util.Duration;

/**
 * This class controls the sliding animations for dialogs.
 * */

public class AnimationManagement {

    private final int SLIDEINSPEED = 250;
    private final int SLIDEOUTSPEED = 250;

    private TranslateTransition transIn;
    private TranslateTransition transOut;
    private SplitPane dialog;

    public AnimationManagement(SplitPane dialog) {
        this.dialog = dialog;

        setUpAnimation();
    }

    private void setUpAnimation() {
        this.transIn = new TranslateTransition(Duration.millis(SLIDEINSPEED), this.dialog);
        transIn.setToY(0);
        this.transOut = new TranslateTransition(Duration.millis(SLIDEOUTSPEED), this.dialog);

        // Moving dialog up and away from main scene
        this.dialog.translateYProperty().setValue(-(dialog.getPrefHeight()));
    }

    public void animate() {
        if (this.dialog.getTranslateY() != 0) {
            transIn.play();
        } else {
            transOut.setToY(-(this.dialog.getPrefHeight()));
            transOut.play();
        }
    }

}
