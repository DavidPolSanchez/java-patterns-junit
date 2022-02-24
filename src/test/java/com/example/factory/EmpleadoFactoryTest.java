package com.example.factory;

import com.example.creational.factory.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpleadoFactoryTest {

    EmpleadoFactory empleadoFactory;

    @Test
    @DisplayName("Obtener empleado mecanico")
    void getEmpleadoMecanicoTest() {
        Empleado mecanico = empleadoFactory.getEmpleado(EmpleadoType.MECANICO);

        assertInstanceOf(Mecanico.class, mecanico);
    }

    @Test
    @DisplayName("Obtener empleado programador")
    void getEmpleadoProgramadorTest() {
        Empleado programador = empleadoFactory.getEmpleado(EmpleadoType.PROGRAMADOR);

        assertInstanceOf(Programador.class, programador);
    }

    @Test
    @DisplayName("Modificar nss de programador")
    void modifyNssProgramadorTest() {
        Empleado programador = empleadoFactory.getEmpleado(EmpleadoType.PROGRAMADOR);
        String newNss="222222222";
        programador.setNss(newNss);
        assertEquals(newNss,programador.getNss());
    }

    @Test
    @DisplayName("Modificar salary de programador")
    void modifySalaryProgramadorTest() {
        Empleado programador = empleadoFactory.getEmpleado(EmpleadoType.PROGRAMADOR);
        String newSalary ="40000";
        programador.setSalary(newSalary);
        assertEquals(newSalary,programador.getSalary());
    }

    @Test
    @DisplayName("Distintas instancias de mecanico")
    void distintasInstanciasMecanicosTest() {
        Empleado mecanico1 = empleadoFactory.getEmpleado(EmpleadoType.MECANICO);
        Empleado mecanico2 = empleadoFactory.getEmpleado(EmpleadoType.MECANICO);

        assertNotSame(mecanico1,mecanico2);

    }
}