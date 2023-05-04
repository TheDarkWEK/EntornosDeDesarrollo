/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.daw.pasapalabra.util;

/**
 *
 * @author Sergio
 */
import java.util.Scanner;

public class Utilidades {

    static Scanner sc = new Scanner(System.in);

    static String[] letras = Palabras.devuelveLetras();
    static String[] definiciones = Palabras.devuelveDefiniciones();
    static String[] soluciones = Palabras.devuelveSoluciones();
    static String palabra;

    static int letra = 0;

    static int ronda = 0;
    static int aciertos = 0;
    static int errores = 0;
    static int total = 0;

    static int finalizador = 0;

    public static void rosco() {
        for (int i = 0; i < letras.length; i++) {
            System.out.print("[" + letras[i] + "] ");
        }
        System.out.println(" ");

    }

    /**
     * Comienza ronda, muestra en que ronda estamos, comprueba si se debe finalizar 
     * y si se da el caso finaliza partida.
     * 
     */
    public static void rondas() {

        do {
            if (finalizador < 1) {
                ronda++;
            }
            System.out.println("\n\n****************************");
            System.out.println("   COMENZAMOS LA RONDA: " + (ronda));
            System.out.println("****************************\n");

            letra = 0;
            letra();

        } while (finalizador < 1);

        fin();
    }

    /**
     * Muestra letras restantes, toma la entrada e inicia comprobacion.
     * 
     */
    public static void letra() {

        for (int i = 0; i < letras.length; i++) {

            if (errores != 5) {
                if (letras[letra].equals("*")) {
                    letra++;
                    total++;
                } else {
                    System.out.println("\n");
                    rosco();
                    System.out.println("\nEMPIEZA por la letra '" + letras[letra] + "':");
                    System.out.println("* " + definiciones[letra]);

                    palabra = sc.nextLine();

                    comprobacion();

                    letra++;
                    total++;
                }
            }
        }

    }

    /**
     * Compara la entrada con las letras restantes.
     * 
     */
    public static void comprobacion() {
        if (palabra.equalsIgnoreCase(soluciones[letra])) {
            letras[letra] = "*";
            aciertos++;
            System.out.println("\nHas acertado");

        } else if (palabra.equalsIgnoreCase("pasapalabra")) {
            System.out.println("\nSaltamos");

        } else {
            System.out.println("\nHas fallado");
            errores++;
        }

        if (aciertos == letras.length) {
            finalizador = 1;
        } else if (errores == 5) {
            finalizador = 1;
        } else if (ronda == 3) {
            finalizador = 1;
        } else {
            finalizador = 0;
        }

    }

    /**
     *  Muestra datos finales de la partida.
     * 
     */
    public static void fin() {
        calcularPuntuacion(aciertos, errores, ronda);
        System.out.println("\nSITUACION DEL PANEL:");
        rosco();

        System.out.println("Has finalizado el juego en la ronda: " + ronda);
        System.out.println("\nNumero de aciertos: " + aciertos);
        System.out.println("Numero de fallos: " + errores);
        System.out.println("HA TERMINADO LA RONDA " + ronda + ". EL JUEGO HA ACABADO");
        System.out.println("HAS OBTENIDO: " + calcularPuntuacion(aciertos, errores, ronda) + " PUNTOS");

    }

    /**
     * Calcula la puntuacion final.
     */
    public static int calcularPuntuacion(int aciertos, int errores, int ronda) {
        int puntos = 0;

        if (errores == 5) {
            puntos = aciertos * 2 - errores;

        } else if (total == letras.length * 3 && aciertos < letras.length) {
            puntos = aciertos * 2 - errores;

        } else if (ronda == 1) {
            puntos = aciertos * 2 - errores + 30;

        } else if (ronda == 2) {
            puntos = aciertos * 2 - errores + 15;

        } else if (ronda == 3) {
            puntos = aciertos * 2 - errores + 5;

        }
        return puntos;
    }

}
