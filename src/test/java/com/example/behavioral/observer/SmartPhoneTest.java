package com.example.behavioral.observer;

import com.example.behavioral.command.demo.observer.SmartPhone;
import com.example.behavioral.command.demo.observer.WeatherType;
import org.junit.jupiter.api.Test;

class SmartPhoneTest {

    SmartPhone smartPhone = new SmartPhone();

    @Test
    void updateTest() {
        smartPhone.update(WeatherType.CLOUDY);
    }

}