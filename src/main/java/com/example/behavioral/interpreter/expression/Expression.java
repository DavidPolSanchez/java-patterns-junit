package com.example.behavioral.interpreter.expression;

import com.example.behavioral.interpreter.Parser;

public interface Expression {
    int interpret(Parser operation);
}
