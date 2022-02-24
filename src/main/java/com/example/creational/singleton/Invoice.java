package com.example.creational.singleton;

public class Invoice {

    Calculator calculator = Calculator.getCalculator();

    public double calculateTotalPrice(double a, double b) {
        return calculator.calculate(a, b);
    }
}