package com.example.creational.prototype;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Test del patrón Prototype")
public class PrototypeTest {

    @Test
    void circleTest(){
        Shape circle = new Circle("azul", 10);
        Shape circle2 = circle.copy();
        circle2.setColor("rojo");
        assertEquals(circle2.getColor(),"rojo");
    }
}
