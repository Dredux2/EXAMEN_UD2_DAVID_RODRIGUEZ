package org.example;
import java.time.LocalDateTime;
import java.util.Scanner;
public class Examen {
    public static void ejercicio1() {

    }

    public static void ejercicio2() {
        Scanner sc = new Scanner(System.in);
        LocalDateTime hoy = LocalDateTime.now();
        int anyoActual = hoy.getYear();
        int edadPasada = -1;

        System.out.print("Dime tu año de nacimiento: ");
        int anyo = sc.nextInt();

        if (anyo >= 1900 && anyo <= anyoActual){
            for (int anyoPasado = anyo; anyo <= anyoActual; anyoPasado++){
                edadPasada++;
                anyo++;
                System.out.println(anyoPasado + " - edad: " + edadPasada);
                System.out.println();
            }
        } else {
            System.out.println("Error: Debes ingresar una fecha mayor a 1900 o menor al año actual.");
        }
    }

    public static void main(String[] args) {
        ejercicio1();
        ejercicio2();
    }
}