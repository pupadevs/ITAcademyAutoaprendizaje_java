package com.itacademy.sprint1.nivel3.entity;

public class Employed {
    private  String name;
    private final String dni;
    private final Double SUELDO = 1500d;


    public Employed(String name, String dni) {
        this.name = name;
        this.dni = dni;

    }

    public String getName() {
        return name;
    }

    public String getDni() {
        return dni;
    }

    public Double getSUELDO() {
        return SUELDO;
    }

    @Override
    public String toString() {
        return "Employed{" +
                "name='" + name + '\'' +
                ", dni='" + dni + '\'' +
                ", SUELDO=" + SUELDO +
                '}';
    }
}
