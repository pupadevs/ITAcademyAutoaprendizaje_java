package com.itacademy.sprint1.nivel2.ejercicio1.entity;

public class SmartPhone extends com.itacademy.sprint1.nivel2.ejercicio1.entity.Phone implements com.itacademy.sprint1.nivel2.ejercicio1.entity.Cam, com.itacademy.sprint1.nivel2.ejercicio1.entity.Watch {
    public SmartPhone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void takeAPhoto() {
        System.out.println("Se esta haciendo una foto");
    }

    @Override
    public void alarm() {
        System.out.println("La alarma esta sonando");
    }
}
