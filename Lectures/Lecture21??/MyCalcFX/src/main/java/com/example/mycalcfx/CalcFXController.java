package com.example.mycalcfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CalcFXController {
    @FXML
    Label display;
    @FXML
    Label calculation;
    int number1;
    int number2;
    String displayNumber;
    String operator;
    Calculator calc;

    public CalcFXController(){
    }

    public void initialize(){
        this.displayNumber = "";
        this.number1 = 0;
        this.number2 = 0;
        this.operator = "";
        this.calc = new Calculator();
    }
    public void buttonEqualsPressed(ActionEvent actionEvent) {
        this.number2 = Integer.parseInt(this.displayNumber);
        Label var10000 = this.calculation;
        String var10001 = this.calculation.getText();
        var10000.setText(var10001 + this.number2 + "=");
        switch (this.operator) {
            case "+":
                this.number1 = this.calc.add(this.number1, this.number2);
            default:
                var10000 = this.calculation;
                var10001 = this.calculation.getText();
                var10000.setText(var10001 + this.number1);
                this.display.setText(String.valueOf(this.number1));
                this.displayNumber = String.valueOf(this.number1);
        }
    }

    public void buttonOnePressed(ActionEvent actionEvent) {
        this.displayNumber = this.displayNumber + "1";
        this.display.setText(this.displayNumber);
    }

    public void buttonTwoPressed(ActionEvent actionEvent) {
        this.displayNumber = this.displayNumber + "2";
        this.display.setText(this.displayNumber);
    }

    public void buttonPlusPressed(ActionEvent actionEvent) {
        this.operator = "+";
        this.number1 = Integer.parseInt(this.displayNumber);
        this.displayNumber = "";
        this.display.setText("");
        this.calculation.setText(this.number1 + this.operator);
    }
}