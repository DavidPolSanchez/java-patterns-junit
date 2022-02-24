package com.example.behavioral.command.demo.commands;

import com.example.behavioral.command.demo.receivers.Fan;

/**
 * Fan stop Command where we are encapsulating both Object[fan] and the
 * operation[stop] together as command. This is the essence of the command.
 *
 */
public class StopFanCommand implements Command {

    Fan fan;

    public StopFanCommand(Fan fan) {
        this.fan = fan;
    }

    public void execute() {
        System.out.println("stopping Fan.");
        fan.stop();
    }
}
