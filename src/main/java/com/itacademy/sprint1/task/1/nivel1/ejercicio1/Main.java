package com.itacademy.sprint1.nivel1.ejercicio1;

import com.itacademy.sprint1.nivel1.ejercicio1.entity.Instrument;
import com.itacademy.sprint1.nivel1.ejercicio1.entity.StringIsntrument;
import com.itacademy.sprint1.nivel1.ejercicio1.entity.WindiInstrument;

public class Main {
    static {
        System.out.println("La clase DemoCargaClase ha sido cargada.");
    }

    public static void main(String[] args) {
        WindiInstrument viento = new WindiInstrument("Flauta");
        StringIsntrument cuerda = new StringIsntrument("Guitarra");
        playInstrument(viento);
        playInstrument(cuerda);



    }

    //SOLID Principle Lisko sustitucion
    public static void playInstrument(Instrument instrument){
        instrument.tocar();
    }
}
