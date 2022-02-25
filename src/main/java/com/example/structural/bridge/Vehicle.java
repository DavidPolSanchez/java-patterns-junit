package com.example.structural.bridge;

public class Vehicle {

    private Gear gear;

    public Vehicle(Gear gear) {
        this.gear = gear;

        if (this.gear != null) {
            System.out.println("New " + getClass().getSimpleName() + " with " + gear + " created!");
        } else {
            System.out.println("New " + getClass().getSimpleName() + " with no gear created!");
        }
    }

    public void shiftUp() {
        if (this.gear != null) {
            this.gear.shiftUp();
        } else {
            System.out.println("No gear available!");
        }
    }

    public void shiftDown() {
        if (this.gear != null) {
            this.gear.shiftDown();
        } else {
            System.out.println("No gear available!");
        }
    }
}
