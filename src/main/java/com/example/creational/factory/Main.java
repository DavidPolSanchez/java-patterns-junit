package com.example.creational.factory;

public class Main {

    public static void main(String[] args) {

//        Empleado mecanico = new Mecanico();

        // Desacoplar la creación de un objeto de quien la tiene que utilizar

        Empleado prog1 = EmpleadoFactory.getEmpleado(EmpleadoType.PROGRAMADOR);
        System.out.println(prog1);

        Empleado prog2 = EmpleadoFactory.getEmpleado(EmpleadoType.PROGRAMADOR);
        System.out.println(prog2);

        Empleado prog3 = EmpleadoFactory.getEmpleado(EmpleadoType.PROGRAMADOR);
        System.out.println(prog3);

        Empleado mecanico1 = EmpleadoFactory.getEmpleado(EmpleadoType.MECANICO);
        Empleado mecanico2 = EmpleadoFactory.getEmpleado(EmpleadoType.MECANICO);

    }
}





