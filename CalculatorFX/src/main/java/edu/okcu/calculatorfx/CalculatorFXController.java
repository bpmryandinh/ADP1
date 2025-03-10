package edu.okcu.calculatorfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CalculatorFXController {
    @FXML Label display;
    @FXML Label calculation;

    int number1, number2;
    String displayNumber;
    String operator;
    Calculator calc;

    public void initialize() {
        displayNumber = "";
        number1 = 0;
        number2 = 0;
        operator = "";
        calc = new Calculator();
    }

    public void buttonEqualsPressed(ActionEvent actionEvent) {
        number2 = Integer.parseInt(displayNumber);
        calculation.setText(calculation.getText() + number2 + "=");

        switch (operator) {
            case "+":
                number1 = calc.add(number1, number2);
                break;
            default:
                break;
        }

        calculation.setText(calculation.getText() + number1);
        display.setText(String.valueOf(number1));
        displayNumber = String.valueOf(number1);
    }

    public void buttonOnePressed(ActionEvent actionEvent) {
        displayNumber += "1";
        display.setText(displayNumber);

       //display.setText(number+ "");
    }

    public void buttonTwoPressed(ActionEvent actionEvent) {
        displayNumber += "2";
        display.setText(displayNumber);
    }

    public void buttonPlusPressed(ActionEvent actionEvent) {
        operator = "+";

        number1 = Integer.parseInt(displayNumber);

        displayNumber = "";

        display.setText("");

        calculation.setText(number1 + operator);
    }
}