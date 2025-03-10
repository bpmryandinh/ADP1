package edu.okcu.calcfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalcController {
    @FXML
    Label display;
    @FXML
    Label calculation;
    double number1;
    double number2;
    String displayNumber;
    String operator;
    Calculator calc;

    /*public CalcController() {
    }*/

    public void initialize() {
        this.displayNumber = "";
        this.number1 = 0;
        this.number2 = 0;
        this.operator = "";
        this.calc = new Calculator();
    }

    //Method to calculate with each operator

    public void buttonEqualsPressed(ActionEvent actionEvent) {
        this.number2 = Double.parseDouble(this.displayNumber);
        Label var10000 = this.calculation;
        String var10001 = this.calculation.getText();
        var10000.setText(var10001 + this.number2 + "=");
        switch (this.operator) {
            case "+":
                this.number1 = this.calc.add(this.number1, this.number2);
                break;
            case "-":
                this.number1 = this.calc.minus(this.number1, this.number2);
                break;
            case "/":
                this.number1 = this.calc.divide(this.number1, this.number2);
                break;
            case "*":
                this.number1 = this.calc.multiply(this.number1, this.number2);
                break;
            case "%":
                this.number1 = this.calc.modulus(this.number1, this.number2);
                break;
            default:


        }
        var10000 = this.calculation;
        var10001 = this.calculation.getText();
        var10000.setText(var10001 + this.number1);
        this.display.setText(String.valueOf(this.number1));
        this.displayNumber = String.valueOf(this.number1);

    }

    //Method to display each number and operator

    //numbers
    public void buttonOnePressed(ActionEvent actionEvent) {
        this.displayNumber = this.displayNumber + "1";
        this.display.setText(this.displayNumber);
    }

    public void buttonTwoPressed(ActionEvent actionEvent) {
        this.displayNumber = this.displayNumber + "2";
        this.display.setText(this.displayNumber);
    }

    public void buttonThreePressed(ActionEvent actionEvent) {
        this.displayNumber = this.displayNumber + "3";
        this.display.setText(this.displayNumber);
    }

    public void buttonFourPressed(ActionEvent actionEvent) {
        this.displayNumber = this.displayNumber + "4";
        this.display.setText(this.displayNumber);
    }

    public void buttonFivePressed(ActionEvent actionEvent) {
        this.displayNumber = this.displayNumber + "5";
        this.display.setText(this.displayNumber);
    }

    public void buttonSixPressed(ActionEvent actionEvent) {
        this.displayNumber = this.displayNumber + "6";
        this.display.setText(this.displayNumber);
    }

    public void buttonSevenPressed(ActionEvent actionEvent) {
        this.displayNumber = this.displayNumber + "7";
        this.display.setText(this.displayNumber);
    }

    public void buttonEightPressed(ActionEvent actionEvent) {
        this.displayNumber = this.displayNumber + "8";
        this.display.setText(this.displayNumber);
    }

    public void buttonNinePressed(ActionEvent actionEvent) {
        this.displayNumber = this.displayNumber + "9";
        this.display.setText(this.displayNumber);
    }

    public void buttonZeroPressed(ActionEvent actionEvent) {
        this.displayNumber = this.displayNumber + "0";
        this.display.setText(this.displayNumber);
    }

    //period
    public void buttonPeriodPressed(ActionEvent actionEvent) {
        this.displayNumber = this.displayNumber + ".";
        this.display.setText(this.displayNumber);
    }

    //Operators
    public void buttonPlusPressed(ActionEvent actionEvent) {
        this.operator = "+";
        this.number1 = Double.parseDouble(this.displayNumber);
        this.displayNumber = "";
        this.display.setText("");
        this.calculation.setText(this.number1 + this.operator);
    }

    public void buttonMinusPressed(ActionEvent actionEvent){
        this.operator = "-";
        this.number1 = Double.parseDouble(this.displayNumber);
        this.displayNumber = "";
        this.display.setText("");
        this.calculation.setText(this.number1 + this.operator);
    }

    public void buttonMultiplyPressed(ActionEvent actionEvent){
        this.operator = "*";
        this.number1 = Double.parseDouble(this.displayNumber);
        this.displayNumber = "";
        this.display.setText("");
        this.calculation.setText(this.number1 + this.operator);
    }

    public void buttonDividePressed(ActionEvent actionEvent){
        this.operator = "/";
        this.number1 = Double.parseDouble(this.displayNumber);
        this.displayNumber = "";
        this.display.setText("");
        this.calculation.setText(this.number1 + this.operator);
    }

    public void buttonAllClearPressed(ActionEvent actionEvent){
        this.operator = "AC";
        this.number1 = Double.parseDouble(this.displayNumber);
        this.displayNumber = "";
        this.display.setText("");
    }

    //method for plus/minus
    public void buttonPlusMinusPressed(ActionEvent actionEvent){
        char beforeNum = this.displayNumber.charAt(0);
        String firstStr = Character.toString(beforeNum);
        if (firstStr.equals("-")){
            this.displayNumber = displayNumber.substring(1);
        } else {
            this.displayNumber = "-" + displayNumber;
        }
        this.display.setText(this.displayNumber);
    }

    public void buttonModulusPressed(ActionEvent actionEvent){
        this.operator = "%";
        this.number1 = Double.parseDouble(this.displayNumber);
        this.displayNumber = "";
        this.display.setText("");
        this.calculation.setText(this.number1 + this.operator);
    }
}