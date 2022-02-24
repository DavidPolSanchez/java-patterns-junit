package com.example.creational.factory;

public class EmpleadoFactory {

    public static Empleado getEmpleado(EmpleadoType type){

        return switch (type) {
            case MECANICO -> new Mecanico();
            case PROGRAMADOR -> new Programador();
        };
    }
}
