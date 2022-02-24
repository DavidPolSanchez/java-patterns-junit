package com.example.creational.singleton;

public class Calculator { // singleton

    private static Calculator calculadora;

    private Calculator() {
    }

    public static Calculator getCalculator() {
        if (calculadora == null)
            calculadora = new Calculator();
        return calculadora;
    }

    double calculate(double a, double b) {
        return a + b;
    }
}