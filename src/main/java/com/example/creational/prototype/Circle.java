package com.example.creational.prototype;

public class Circle extends Shape {

    int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public Shape copy() {
        return new Circle(this.getColor(), this.radius);
    }
}
