package com.itacademy.sprint1.nivel1.ejercicio2;

import com.itacademy.sprint1.nivel1.ejercicio2.entity.Coche;

public class MainCoche {
    public static void main(String[] args) {
        Coche coche = new Coche(93.0d);
        coche.setModelo("TT");
        Coche.frenar();
        coche.acelerar();
    }
}
