package com.example;

public class Cliente extends Persona{
    int credito;

    public Cliente(int credito, int edad, String nombre) {
        super(edad, nombre);
        this.credito = credito;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }


}
