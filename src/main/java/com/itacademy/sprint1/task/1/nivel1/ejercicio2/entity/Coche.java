package com.itacademy.sprint1.nivel1.ejercicio2.entity;

public class Coche {
    private static final String MARCA = "Audi";
    private static String modelo;
    private final Double potencia;

    public Coche(Double potencia) {
        this.potencia = potencia;

    }

    public void setModelo(String modelo){
       this.modelo = modelo;
    }
    public static void frenar(){
        System.out.println("El "+ MARCA+" " + modelo +" esta frenando");
    }

    public void acelerar(){
        System.out.println("El "+ MARCA+" " + modelo +" esta acelerando");

    }


}
