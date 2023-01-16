package com.example;

public class Ejercicio8 {

    public static void main(String[] args) {

        Persona alumno = new Persona();

        // Using setters
        alumno.setEdad(43);
        alumno.setNombre("Alberto");
        alumno.setTelefono("618704054");

        // Using String method
        System.out.println(alumno);
    }
}
