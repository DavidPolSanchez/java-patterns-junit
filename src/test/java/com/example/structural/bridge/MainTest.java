package com.example.structural.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void shiftUp(){
        Vehicle car1 = new Car(new ManualGear());
        car1.shiftUp();
        System.out.println("\n");

        Vehicle car2 = new Car(new AutomaticGear());
        car2.shiftUp();
        System.out.println("\n");

        Vehicle bus1 = new Bus(new ManualGear());
        bus1.shiftUp();
        System.out.println("\n");

        Vehicle bus2 = new Bus(new AutomaticGear());
        bus2.shiftUp();
    }

}