package edu.okcu.calcfx;

public class Calculator {
    private double runningTotal;

    public Calculator(){
    }

    //method to add numbers
    public double add(double number1, double number2) {
        this.runningTotal = number1 + number2;
        return this.runningTotal;
    }

    //method to subtract numbers
   public double minus(double number1, double number2) {
        this.runningTotal = number1 - number2;
        return this.runningTotal;
    }

    //method to multiply numbers
    public double multiply(double number1, double number2) {
        this.runningTotal = number1 * number2;
        return this.runningTotal;
    }

    //method to divide numbers
    public double divide(double number1, double number2) {
            this.runningTotal = number1 / number2;
            return this.runningTotal;
        }

    //method for modulus
    public double modulus(double number1, double number2) {
        this.runningTotal = number1 % number2;
        return this.runningTotal;
    }



    }



