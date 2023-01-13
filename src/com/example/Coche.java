package com.example;

public class Coche {

    // Atributos

    int puertas;
    String color;

    // Constructor
    public Coche(int puertas, String color) {
        this.puertas = puertas;
        this.color = color;
    }

    // Métodos

    public void anadirPuerta(int cantidad) {
        this.puertas += cantidad;
    }
}
