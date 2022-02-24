package com.example.behavioral.observer;

import com.example.behavioral.command.demo.observer.Computer;
import com.example.behavioral.command.demo.observer.WeatherType;
import org.junit.jupiter.api.Test;

class ComputerTest {

    Computer computer = new Computer();

    @Test
    void updateTest() {
        computer.update(WeatherType.CLOUDY);
    }


}