package com.example.creational.singleton;

public class Offer {

    Calculator calculator = Calculator.getCalculator();

    public double calculateTotalOffer(double a, double b) {
        return calculator.calculate(a, b);
    }
}
