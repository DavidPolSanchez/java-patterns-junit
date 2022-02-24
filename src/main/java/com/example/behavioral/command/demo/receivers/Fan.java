package com.example.behavioral.command.demo.receivers;

/**
 * Fan class is a Receiver component in command pattern terminology.
 *
 */
public class Fan {
    public void start() {
        System.out.println("Fan Started..");

    }

    public void stop() {
        System.out.println("Fan stopped..");

    }
}