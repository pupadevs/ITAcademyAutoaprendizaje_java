package com.itacademy.sprint1.nivel1.entity;

public abstract class Instrument {

    private String name;

    public Instrument(String name){
        this.name = name;

    }

    public abstract void tocar();
}
