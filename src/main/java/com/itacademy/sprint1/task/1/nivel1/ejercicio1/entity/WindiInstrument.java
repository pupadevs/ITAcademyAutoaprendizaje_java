package com.itacademy.sprint1.nivel1.ejercicio1.entity;

public class WindiInstrument  extends com.itacademy.sprint1.nivel1.ejercicio1.entity.Instrument {

    public WindiInstrument(String name){
        super(name);
    }
    @Override
    public void tocar() {
        System.out.println("Esta sonando un instrumento de viento");
    }
}
