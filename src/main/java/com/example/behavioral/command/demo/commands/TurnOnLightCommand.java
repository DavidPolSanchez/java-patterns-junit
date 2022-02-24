package com.example.behavioral.command.demo.commands;

import com.example.behavioral.command.demo.receivers.Light;

/**
 * Light stop Command where we are encapsulating both Object[light] and the
 * operation[turnOff] together as command. This is the essence of the command.
 *
 */
public class TurnOnLightCommand implements Command {

    Light light;

    public TurnOnLightCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        System.out.println("Turning on light.");
        light.turnOn();
    }
}
