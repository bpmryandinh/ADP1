package edu.okcu.javafxsimplecalc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML private TextField inputTextField;
    @FXML private Label resultsLabel;

    public void onSquareButtonClick(ActionEvent actionEvent) {
        String data = inputTextField.getText();
        int number = Integer.parseInt(data);
        double result = Math.pow(number, 2);
        resultsLabel.setText(String.valueOf(result));
    }

    public void onCubeButtonClick(ActionEvent actionEvent) {
        String data = inputTextField.getText();
        int number = Integer.parseInt(data);
        double result = Math.pow(number, 3);
        resultsLabel.setText(String.valueOf(result));
    }
}