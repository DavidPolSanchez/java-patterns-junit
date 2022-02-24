package com.example.behavioral.interpreter.expression;

import com.example.behavioral.interpreter.Parser;

public class NumberExpression implements Expression {

    private final int number;

    public NumberExpression(String number) {
        this.number = Integer.parseInt(number);
    }

    @Override
    public int interpret(Parser context) {
        return number;
    }

}
