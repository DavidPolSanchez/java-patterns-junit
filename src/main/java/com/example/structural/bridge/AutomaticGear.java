package com.example.structural.bridge;

public class AutomaticGear implements Gear{
    @Override
    public void shiftUp() {
        System.out.println("AutomaticGear shiftUp !");
    }

    @Override
    public void shiftDown() {
        System.out.println("AutomaticGear shiftDown !");
    }

    @Override
    public String toString() {
        return "AutomaticGear{}";
    }
}
