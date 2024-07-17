package com.itacademy.sprint1.nivel3;

import com.itacademy.sprint1.nivel3.entity.Redactor;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Map<String, Redactor> redactores = new HashMap<>();
        Boolean exit = true;
        String nombre = "";

        String menu ="""
                === Menú ===
                1.- Introducir redactor.
                2.- Eliminar redactor.
                3.- Introducir noticia a un redactor.
                4.- Eliminar noticia.
                5.- Mostrar todas las noticias por redactor.
                6.- Calcular puntuación de la noticia.
                7.- Calcular precio-noticia.
                8.- Salir del programa.
                Selecciona una opción: 
                """;
        while (exit){
            System.out.println(menu);
            int option = entrada.nextInt();
            switch (option) {
                case 1:
                    entrada.nextLine();

                    System.out.println("Opción 1 seleccionada: Introducir redactor.");
                    System.out.println("Introduzca el nombre del redactor");
                     nombre = entrada.nextLine();
                    System.out.println("Introduzca el DNI del redactor");
                    String dni = entrada.nextLine();
                    Redactor redactor = new Redactor(nombre, dni);
                    redactores.put(redactor.getDni(),redactor);
                    System.out.println(redactor);
                break;
                case 2 :
                    System.out.println("Opción 2 seleccionada: Eliminar redactor.");
                    // Aquí iría la lógica para eliminar un redactor
              break;
                case 3 :
                    System.out.println("Opción 3 seleccionada: Introducir noticia a un redactor.");
                    System.out.println("Escriba el nombre del redactor");
                     nombre = entrada.nextLine();
                break;
                case 4 :
                    System.out.println("Opción 4 seleccionada: Eliminar noticia.");
                    // Aquí iría la lógica para eliminar una noticia
                break;
                case 5 :
                    System.out.println("Opción 5 seleccionada: Mostrar todas las noticias por redactor.");
                    // Aquí iría la lógica para mostrar todas las noticias de un redactor
                break;
                case 6 :
                    System.out.println("Opción 6 seleccionada: Calcular puntuación de la noticia.");
                    // Aquí iría la lógica para calcular la puntuación de una noticia
                break;
                case 7:
                    System.out.println("Opción 7 seleccionada: Calcular precio-noticia.");
                    // Aquí iría la lógica para calcular el precio de una noticia
               break;
                case 8 :
                    System.out.println("Saliendo del programa...");
                    exit = false;
               break;
                default : System.out.println("Opción no válida. Por favor, selecciona una opción del 1 al 8.")
                ;
            }
        }

    }

}
