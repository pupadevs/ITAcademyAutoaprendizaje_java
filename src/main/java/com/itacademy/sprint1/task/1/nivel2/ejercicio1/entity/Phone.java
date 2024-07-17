package com.itacademy.sprint1.nivel2.ejercicio1.entity;

public class Phone {
    private String brand;
    private String model;

    public Phone(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    public void callNumber(String num){
        System.out.println("Se esta llamando al numero " + num);
    }
}
