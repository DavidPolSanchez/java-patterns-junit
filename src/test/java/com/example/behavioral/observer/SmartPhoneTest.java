package com.example.behavioral.observer;

import org.junit.jupiter.api.Test;

class SmartPhoneTest {

    SmartPhone smartPhone = new SmartPhone();

    @Test
    void updateTest() {
        smartPhone.update(WeatherType.CLOUDY);
    }

}