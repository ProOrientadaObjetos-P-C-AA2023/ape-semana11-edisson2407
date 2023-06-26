package com.mycompany.juegoderol;

import java.util.Scanner;

public class JuegoDeRol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opcion;

        System.out.println("---------------ROL GAME-------------------");
        System.out.println("===INGRESE SUS PERSONAJES===");

        Guerrero guerrero = null;
        Mago mago = null;
        Arquero arquero = null;

        do {
            System.out.println("Ingrese el tipo de personaje que desea crear:");
            System.out.println("1. Guerrero");
            System.out.println("2. Mago");
            System.out.println("3. Arquero");
            System.out.println("4. Pelea");
            System.out.println("5. Dederminar Ganador");
            System.out.println("0. Salir");

            opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    guerrero = crearGuerrero();
                    break;
                case "2":
                    mago = crearMago();
                    break;
                case "3":
                    arquero = crearArquero();
                    break;
                case "4":
                    pelea(guerrero,mago,arquero);
                    break;
                case "5":
                    determinarGanador(guerrero,mago,arquero);
                    break;
                case "0":
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                    break;
            }

            System.out.println();
        } while (!opcion.equals("0"));

        if (guerrero != null && mago != null && arquero != null) {
            System.out.println("¡Comienza la pelea!");
            pelea(guerrero, mago, arquero);
            System.out.println("------------[GANADOR]-------------");
            determinarGanador(guerrero, mago, arquero);
        }
    }

    public static Guerrero crearGuerrero() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del guerrero:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el nivel del guerrero:");
        int nivel = scanner.nextInt();

        System.out.println("Ingrese los puntos de vida del guerrero:");
        int puntosVida = scanner.nextInt();

        System.out.println("Ingrese la fuerza del guerrero:");
        int fuerza = scanner.nextInt();

        Guerrero guerrero = new Guerrero(nombre, nivel, puntosVida, fuerza);
        System.out.println("Se ha creado un guerrero: " + guerrero.getNombre());
        System.out.println();

        return guerrero;
    }

    public static Mago crearMago() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del mago:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el nivel del mago:");
        int nivel = scanner.nextInt();

        System.out.println("Ingrese los puntos de vida del mago:");
        int puntosVida = scanner.nextInt();

        System.out.println("Ingrese cuántos hechizos tiene el mago: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Limpiar el búfer
        String[] hechizos = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese hechizo " + (i + 1) + " : ");
            hechizos[i] = scanner.nextLine();
        }

        Mago mago = new Mago(nombre, nivel, puntosVida, hechizos);
        System.out.println("Se ha creado un mago: " + mago.getNombre());
        System.out.println();

        return mago;
    }

    public static Arquero crearArquero() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del arquero:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el nivel del arquero:");
        int nivel = scanner.nextInt();

        System.out.println("Ingrese los puntos de vida del arquero:");
        int puntosVida = scanner.nextInt();

        System.out.println("Ingrese la precisión del arquero:");
        int precision = scanner.nextInt();

        Arquero arquero = new Arquero(nombre, nivel, puntosVida, precision);
        System.out.println("Se ha creado un arquero: " + arquero.getNombre());
        System.out.println();

        return arquero;
    }

    public static void pelea(Guerrero guerrero, Mago mago, Arquero arquero) {
        System.out.println("-------[ E M P I E Z A  LA  P E L E A ]--------- ");
        guerrero.ataque();
        mago.defensa();
        arquero.ataque();
        guerrero.defensa();
        mago.ataque();
        arquero.defensa();

        // SUBIR nivel a los personajes
        System.out.println("");
        System.out.println("-------[ SUBEN DE nivel ]---------");
        guerrero.subirNivel();
        mago.subirNivel();
        arquero.subirNivel();
    }

    public static void determinarGanador(Guerrero guerrero, Mago mago, Arquero arquero) {
        if (guerrero.getPuntosDeVida() > mago.getPuntosDeVida() && guerrero.getPuntosDeVida() > arquero.getPuntosDeVida()) {
            System.out.println("El guerrero " + guerrero.getNombre() + " ha ganado la batalla!");
            guerrero.subirNivel();
        } else if (mago.getPuntosDeVida() > guerrero.getPuntosDeVida() && mago.getPuntosDeVida() > arquero.getPuntosDeVida()) {
            System.out.println("El mago " + mago.getNombre() + " ha ganado la batalla");
            mago.subirNivel();
        } else if (arquero.getPuntosDeVida() > guerrero.getPuntosDeVida() && arquero.getPuntosDeVida() > mago.getPuntosDeVida()) {
            System.out.println("El arquero " + arquero.getNombre() + " ha ganado la batalla");
            arquero.subirNivel();
        } else {
            System.out.println("La batalla terminó en empate");
        }
    }
}



