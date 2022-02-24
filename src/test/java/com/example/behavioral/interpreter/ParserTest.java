package com.example.behavioral.interpreter;

import com.example.behavioral.interpreter.expression.Expression;
import com.example.behavioral.interpreter.expression.NumberExpression;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

class ParserTest {


    @Test
    void test1() {
        String formula = "2 + 1 - 2";
        Parser parser = new Parser(formula);

        int result = 0;
        while (!parser.isEmptyOperators()) {
            Expression operator = parser.popOperator();
            result = operator.interpret(parser);
        }
        assertEquals(1, result);
    }

    @Test
    void test2() {
        String formula = "2 + 1";
        Parser parser = new Parser(formula);
        Expression exp = parser.popNumber();
        assertInstanceOf(NumberExpression.class, exp);
        NumberExpression numberExp = (NumberExpression) exp;
    }

    @Test
    void test3() {
        String formula = "2 - 2";
        Parser parser = new Parser(formula);

        int result = 0;
        while (!parser.isEmptyOperators()) {
            Expression operator = parser.popOperator();
            result = operator.interpret(parser);
        }
        assertEquals(0, result);
    }


    @Test
    void test4() {
        String formula = "2 / 2";
        Parser parser = new Parser(formula);

        int result = 0;
        while (!parser.isEmptyOperators()) {
            Expression operator = parser.popOperator();
            result = operator.interpret(parser);
        }
        assertEquals(1, result);
    }


    @Test
    void test5() {
        String formula = "2 * 2";
        Parser parser = new Parser(formula);

        int result = 0;
        while (!parser.isEmptyOperators()) {
            Expression operator = parser.popOperator();
            result = operator.interpret(parser);
        }
        assertEquals(4, result);
    }




}