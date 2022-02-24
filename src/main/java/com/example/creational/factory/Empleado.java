package com.example.creational.factory;

public class Empleado {
    private String nss;
    private String salary;

    public Empleado() {
    }

    public Empleado(String nss, String salary) {
        this.nss = nss;
        this.salary = salary;
    }

    public String getNss() {
        return nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}