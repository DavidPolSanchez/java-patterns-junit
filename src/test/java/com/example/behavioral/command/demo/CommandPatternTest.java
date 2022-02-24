package com.example.behavioral.command.demo;

import com.example.behavioral.command.demo.commands.StartFanCommand;
import com.example.behavioral.command.demo.commands.StopFanCommand;
import com.example.behavioral.command.demo.commands.TurnOffLightCommand;
import com.example.behavioral.command.demo.commands.TurnOnLightCommand;
import com.example.behavioral.command.demo.invoker.HomeAutomationRemote;
import com.example.behavioral.command.demo.receivers.Fan;
import com.example.behavioral.command.demo.receivers.Light;
import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CommandPatternTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    HomeAutomationRemote remote;
    Light light;
    Fan fan;

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
        remote = new HomeAutomationRemote();
    }

    @Nested
    @DisplayName("Light Tests")
    class LightTests{

        @BeforeEach
        void initializeLight(){
            light = new Light();
        }

        @Test
        void turnOnLightTest() {
            remote.setCommand(new TurnOnLightCommand(light));
            remote.buttonPressed();

            assertTrue(outputStreamCaptor.toString().contains("Light is on"));
        }

        @Test
        void turnOffLightTest() {
            remote.setCommand(new TurnOffLightCommand(light));
            remote.buttonPressed();

            assertTrue(outputStreamCaptor.toString().contains("Light is off"));
        }
    }

    @Nested
    @DisplayName("Fan Tests")
    class FanTests{

        @BeforeEach
        void initializeFan(){
            fan = new Fan();
        }

        @Test
        void startFanTest() {
            remote.setCommand(new StartFanCommand(fan));
            remote.buttonPressed();

            assertTrue(outputStreamCaptor.toString().contains("Fan Started"));
        }

        @Test
        void stopFanTest() {
            remote.setCommand(new StopFanCommand(fan));
            remote.buttonPressed();

            assertTrue(outputStreamCaptor.toString().contains("Fan stopped"));
        }
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }
}