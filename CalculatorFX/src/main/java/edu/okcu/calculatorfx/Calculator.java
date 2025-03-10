package edu.okcu.calculatorfx;

public class Calculator {
    private int runningTotal;

    public int add(int number1, int number2) {
        runningTotal = number1 + number2;
        return runningTotal;
    }


}
