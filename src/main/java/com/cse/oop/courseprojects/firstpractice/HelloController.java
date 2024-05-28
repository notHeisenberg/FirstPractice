package com.cse.oop.courseprojects.firstpractice;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {

    @FXML
    private Label welcomeText;
    @FXML
    private Label welcomeText2;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    public void handleJava(ActionEvent actionEvent) {
        welcomeText2.setText("Lets go");
    }

    @FXML
    public void handleGoooooo(ActionEvent actionEvent) {
    }
}