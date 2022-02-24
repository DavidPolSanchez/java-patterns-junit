package com.example.structural.flyweight;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.example.structural.flyweight.ShapeUtils.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Flyweight pattern tests")
class FlyweightTest {

    @Test
    @DisplayName("Get one circle with specified color")
    void getCircleTest() {

        Circle circle = (Circle)ShapeFactory.getCircle("Red");

        assertEquals("Red", circle.getColor());
    }

    @Test
    @DisplayName("Get two circles with same color")
    void getSameColorCircleTest() {

        Circle circle1 = (Circle)ShapeFactory.getCircle(getRandomColor());
        circle1.setX(getRandomX());
        circle1.setY(getRandomY());

        Circle circle2 = (Circle)ShapeFactory.getCircle(circle1.getColor());

        assertEquals(circle1, circle2);
    }

    @Test
    @DisplayName("Draw the circle")
    void drawTest() {

        Circle circle = (Circle)ShapeFactory.getCircle("Red");
        circle.setX(5);
        circle.setY(10);
        circle.setRadius(5);

        assertEquals("Red, 5, 10, 5", circle.draw());
    }

}