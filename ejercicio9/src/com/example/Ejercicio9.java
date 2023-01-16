package com.example;

public class Ejercicio9 {

    public static void main(String[] args) {

        Cliente pepe = new Cliente(1250,56,"Pepe");

        pepe.setTelefono("+346875465");

        System.out.println("nombre: " + pepe.getNombre() + " edad: " + pepe.getEdad() + " teléfono: " + pepe.getTelefono() + " crédito: " + pepe.getCredito());

        Trabajador lucas = new Trabajador(1100, 48, "Lucas", "+346556535");

        System.out.println("nombre: " + lucas.getNombre() + " edad: " + lucas.getEdad() + " teléfono: " + lucas.getTelefono() + " salario: " + lucas.getSalario());

    }
}
