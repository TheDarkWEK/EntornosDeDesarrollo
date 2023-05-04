/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.daw.pasapalabra;
/**
 *
 * @author Sergio
 */
import es.daw.pasapalabra.util.*;


public class Pasapalabra {

     /**
     * Main inicia mostrandote el rosco y inicia el juego con el metodo rondas()
     * 
     */
    public static void main(String[] args) {

        System.out.println("****************************");
        System.out.println("  BIENVENIDO A PASAPALABRA");
        System.out.println("****************************\n");

        System.out.println("* LETRAS DEL JUEGO");

        Utilidades.rosco();

        Utilidades.rondas();

    }
}
