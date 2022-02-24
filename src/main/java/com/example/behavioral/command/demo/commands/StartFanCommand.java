package com.example.behavioral.command.demo.commands;


import com.example.behavioral.command.demo.receivers.Fan;

/**
 * Fan Start Command where we are encapsulating both Object[fan] and the
 * operation[start] together as command. This is the essence of the command.
 *
 */
public class StartFanCommand implements Command {

    Fan fan;

    public StartFanCommand(Fan fan) {
        this.fan = fan;
    }

    public void execute() {
        System.out.println("starting Fan.");
        fan.start();
    }
}