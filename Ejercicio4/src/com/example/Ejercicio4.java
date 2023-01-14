package com.example;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        // Positive or negative numbers
        Random rand = new Random();
        int numeroif = rand.nextInt();

        if ( numeroif > 0 ) {
            System.out.println("El número " + numeroif + " es positivo");
        } else {
            System.out.println("El número " + numeroif + " es negativo");
        }

        // While
        System.out.println("WHILE BUCLE");
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        // Do While
        System.out.println("DO WHILE BUCLE");
        int numeroDoWhile = 0;
        do {
            System.out.println(numeroDoWhile);
            numeroDoWhile++;
        } while (numeroDoWhile < 0);

        // For
        System.out.println("FOR BUCLE");
        int numeroFor = 3;
        for (int i = 0; i <= numeroFor; i++) {
            System.out.println(i);
        }

        // Switch
        Scanner lectura = new Scanner (System.in);
        System.out.println("Escoja estación: 1 - invierno, 2 - primavera, 3 - verano, 4 - otoño");
        String estacion = lectura.next();

        switch (estacion) {
            case "1" -> System.out.println("Estamos en invierno");
            case "2" -> System.out.println("Estamos en primavera");
            case "3" -> System.out.println("Estamos en verano");
            case "4" -> System.out.println("Estamos en otoño");
            default -> System.out.println("La estación no existe, introduzca una nueva");
        }

    }
}
