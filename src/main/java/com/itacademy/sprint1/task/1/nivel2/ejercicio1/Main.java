package com.itacademy.sprint1.nivel2.ejercicio1;

import com.itacademy.sprint1.nivel2.ejercicio1.entity.SmartPhone;

public class Main {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone("Samsung", "S24+");
        phone.callNumber("665695115");
        phone.takeAPhoto();
        phone.alarm();
    }
}
