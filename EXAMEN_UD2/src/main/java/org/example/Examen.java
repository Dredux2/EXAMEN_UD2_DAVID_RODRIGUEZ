package org.example;
import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class Examen {
    public static void ejercicio1() {
        Scanner sc2 = new Scanner(System.in);
        Random rm = new Random();
        int random = rm.nextInt(3);
        String opcionMaquina;
        int marcadorMaquina = 0;
        int marcadorUsuario = 0;

        for (int ronda = 0; ronda <= 3; ronda++) {
            System.out.println("¿Piedra, papel o tijera? (p/a/t)");
            String opcion = sc2.next();

            switch (random){
                case 0:
                    opcionMaquina = "Piedra";
                    System.out.println(opcionMaquina);
                    break;

                case 1:
                    opcionMaquina = "Papel";
                    System.out.println(opcionMaquina);
                    break;

                case 2:
                    opcionMaquina = "Tijera";
                    System.out.println(opcionMaquina);
                    break;
            }
        }
    }

    public static void ejercicio2() {
        Scanner sc = new Scanner(System.in);
        try {
            // Selecciono la fecha de hoy
            LocalDateTime hoy = LocalDateTime.now();
            // Selecciono de la fecha el año actual
            int anyoActual = hoy.getYear();
            // Contador de edad
            int edadPasada = -1;
            // Pregunta al usuario
            System.out.print("Dime tu año de nacimiento: ");
            int anyo = sc.nextInt();

            // Condicion para impedir numeros menores a 1900 o superiores a el año actual
            if (anyo >= 1900 && anyo <= anyoActual) {
                // inicia guardando el año para poder incrementarlo en una variable y poder terminar el bucle
                // La condicion es que el año de nacimiento tiene que ser menor o igual al actual
                for (int anyoPasado = anyo; anyo <= anyoActual; anyo++) {
                    // Incrementa el año para poder mostrarlo en cada interaccion
                    anyoPasado++;
                    // Incrementa la edad en cada interaccion
                    edadPasada++;
                    // Salida mostrando el año y la edad
                    System.out.println(anyoPasado + " - edad: " + edadPasada);
                    System.out.println();
                }
            } else {
                // Error de la condicion del IF
                System.out.println("Error: Debes ingresar una fecha mayor a 1900 o menor al año actual.");
            }
            // Excepcion para cualquier cosa que no sea un numero entero
        } catch (InputMismatchException e1) {
            System.out.println("Error: Debes ingresar un numero valido.");
        }
    }
}