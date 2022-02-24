package com.example.structural.flyweight;

public class Circle implements Shape {
    private final String color;
    private int x;
    private int y;
    private int radius;

    public Circle(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String draw() {
        return color + ", " + x + ", " + y + ", " + radius;
    }

    public String getColor() {
        return color;
    }
}
