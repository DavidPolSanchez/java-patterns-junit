package com.example.structural.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarAdapterTest {

    private static final double SPEED = 100;

    Movable sut = new Car();

    @Test
    void checkSetSpeedUp() {
        // He tenido que añadir getter
        sut.speedUp(SPEED);

        assertTrue(sut.getSpeed() == SPEED);
    }

    @Test
    void checkSetSpeed() {
        // He tenido que añadir getter
        sut.setSpeed(SPEED);

        assertTrue(sut.getSpeed() == SPEED);
    }
}
