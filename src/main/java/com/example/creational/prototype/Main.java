package com.example.creational.prototype;

public class Main {

    public static void main(String[] args) {

        Shape circle = new Circle("azul", 10);

        Shape circle2 = circle.copy();
        circle2.setColor("rojo");

        Circle circle3 = (Circle) circle.copy();
        System.out.println(circle3);
    }

}

