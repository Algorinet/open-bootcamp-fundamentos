package com.example;

public class Trabajador extends Persona {
    int salario;

    public Trabajador(int salario, int edad, String nombre, String telefono) {
        super(edad, nombre, telefono);
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
