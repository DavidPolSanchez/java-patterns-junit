package com.example.structural.bridge;

public class ManualGear implements Gear{
    @Override
    public void shiftUp() {
        System.out.println("ManualGear shiftUp !");
    }

    @Override
    public void shiftDown() {
        System.out.println("ManualGear shiftDown !");
    }

    @Override
    public String toString() {
        return "ManualGear{}";
    }
}
