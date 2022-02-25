package com.example.structural.bridge;

/*
Desacoplar una abstracción de su implementación para que
ambas puedan variar independientemente.

Bridge es un patrón de diseño estructural que permite dividir una clase
grande o un conjunto de clases estrechamente relacionadas en dos
jerarquías separadas -abstracción e implementación- que pueden
desarrollarse de forma independiente.

El patrón puente consiste en preferir la composición a la herencia.
Los detalles de implementación son empujados desde una jerarquía a
otro objeto con una jerarquía separada.

Cómo reconocerlo:

Cuando hay dos jerarquías diferentes que interactúan juntas y
si se llama a un método, ese método es realmente implementado por la otra jerarquía.

Evita CarWithManualGear, CarWithAutomaticGear, BusWithManualGear and BusWithAutomaticGear

El patrón puente en este caso combina 2 jerarquías diferentes:
- vehículos
- cajas de cambio
 */
public class Main {

    public static void main(String[] args) {
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
