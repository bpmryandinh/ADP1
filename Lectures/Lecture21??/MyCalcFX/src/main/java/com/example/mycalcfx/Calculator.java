package com.example.mycalcfx;

public class Calculator {
    private int runningTotal;

    public Calculator() {
    }

    public int add(int number1, int number2) {
        this.runningTotal = number1 + number2;
        return this.runningTotal;
    }
}
