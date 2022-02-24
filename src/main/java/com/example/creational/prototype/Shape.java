package com.example.creational.prototype;

public class Shape {

    private String color;

    protected Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Shape copy() {
        return this;
    }

    ;
}
