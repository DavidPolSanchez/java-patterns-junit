package com.example.behavioral.observer;

import org.junit.jupiter.api.Test;

class ComputerTest {

    Computer computer = new Computer();

    @Test
    void updateTest() {
        computer.update(WeatherType.CLOUDY);
    }


}