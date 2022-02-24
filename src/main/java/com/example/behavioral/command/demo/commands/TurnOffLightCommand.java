package com.example.behavioral.command.demo.commands;

import com.example.behavioral.command.demo.receivers.Light;

/**
 * Light Start Command where we are encapsulating both Object[light] and the
 * operation[turnOn] together as command. This is the essence of the command.
 *
 */
public class TurnOffLightCommand implements Command {

    Light light;

    public TurnOffLightCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        System.out.println("Turning off light.");
        light.turnOff();
    }
}
