package com.example.behavioral.observer;

import com.example.behavioral.command.demo.observer.Computer;
import com.example.behavioral.command.demo.observer.SmartPhone;
import com.example.behavioral.command.demo.observer.Weather;
import com.example.behavioral.command.demo.observer.WeatherType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class WeatherTest {

    @Mock
    Computer computer;

    @Mock
    SmartPhone smartPhone;

    @InjectMocks
    Weather weather = new Weather();

    @Test
    @DisplayName("Testing computer ")
    void chageWeatherComputerTest() {
        weather.addObserver(computer);
        weather.changeWeather(WeatherType.CLOUDY);
        ArgumentCaptor<WeatherType> argument = ArgumentCaptor.forClass(WeatherType.class);
        verify(computer).update(argument.capture());
        assertEquals(WeatherType.CLOUDY, argument.getValue());
    }

    @Test
    @DisplayName("Testing SmartPhone ")
    void chageWeatherSmartPhoneTest() {
        weather.addObserver(smartPhone);
        weather.changeWeather(WeatherType.RAINY);
        ArgumentCaptor<WeatherType> argument = ArgumentCaptor.forClass(WeatherType.class);
        verify(smartPhone).update(argument.capture());
        assertEquals(WeatherType.RAINY, argument.getValue());
    }

    @Test
    void removeObserverTest() {
        weather.addObserver(computer);
        weather.removeObserver(computer);
        weather.changeWeather(WeatherType.SUNNY);
        verify(computer, never()).update(WeatherType.SUNNY);
    }
}