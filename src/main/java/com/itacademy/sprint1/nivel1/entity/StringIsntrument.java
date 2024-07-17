package com.itacademy.sprint1.nivel1.entity;

public class StringIsntrument extends Instrument {
    public StringIsntrument(String name) {
        super(name);
    }

    @Override
    public void tocar() {
        System.out.println("Esta tocando un instrumento de cuerda");
    }
}
