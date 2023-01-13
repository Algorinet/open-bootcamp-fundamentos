package com.example;

import java.util.Arrays;

public class Ejercicio3 {
    public static void main(String[] args) {
        int num1 = 30;
        int num2 = 25;
        int num3 = 47;
        int res = suma(num1, num2, num3);
        System.out.println("El resultado de la suma es:  " + res);

        Coche miCoche = new Coche(2, "rojo");
        miCoche.anadirPuerta(1);

        System.out.println(miCoche.puertas);
    }

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}