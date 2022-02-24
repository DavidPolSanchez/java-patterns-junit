package com.example.structural.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class TractorAdapterTest {

    public static final int MAX_SPEED = 100;
    public static final int TURTLE_SPEED = 5;
    public static final int HARE_SPEED = 15;
    Movable tractorAdapter = new TractorAdapter();

    @Test
    void checkModeWhenWeRaiseSpeed100() {
        // He tenido que añadir getter
        tractorAdapter.speedUp(MAX_SPEED);

        assertTrue(tractorAdapter.getSpeed() == HARE_SPEED);
    }

    @Test
    void checkModeWhenWeRaiseSpeed10() {
        // He tenido que añadir getter
        tractorAdapter.speedUp(10);

        assertTrue(tractorAdapter.getSpeed() == TURTLE_SPEED);
    }


    @Test
    void whenSetSpeedTheValueIsModified() throws Exception {
        tractorAdapter.setSpeed(MAX_SPEED);

        assertTrue(tractorAdapter.getSpeed() == MAX_SPEED);
    }
}