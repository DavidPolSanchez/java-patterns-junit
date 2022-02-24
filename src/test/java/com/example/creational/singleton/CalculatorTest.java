package com.example.creational.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void getCalculatorTest() {
        Calculator.getCalculator();
    }

    @Test
    void calculateTest() {
        Double result = Calculator.getCalculator().calculate(1, 1);
        Assertions.assertEquals(2, result);
    }
}