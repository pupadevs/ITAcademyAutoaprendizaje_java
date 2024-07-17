package com.itacademy.sprint1.nivel1.ejercicio1.entity;

public class WindiInstrument  extends Instrument{

    public WindiInstrument(String name){
        super(name);
    }
    @Override
    public void tocar() {
        System.out.println("Esta sonando un instrumento de viento");
    }
}
