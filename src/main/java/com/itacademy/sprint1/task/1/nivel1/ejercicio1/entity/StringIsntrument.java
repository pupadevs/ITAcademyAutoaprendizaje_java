package com.itacademy.sprint1.nivel1.ejercicio1.entity;

public class StringIsntrument extends com.itacademy.sprint1.nivel1.ejercicio1.entity.Instrument {
    public StringIsntrument(String name) {
        super(name);
    }

    @Override
    public void tocar() {
        System.out.println("Esta tocando un instrumento de cuerda");
    }
}
