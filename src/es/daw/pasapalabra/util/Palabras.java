/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.daw.pasapalabra.util;

/**
 *
 * @author Sergio
 */
public class Palabras {
    
    /**
     * Método que devuelve un array con las palabras que son la solución de cada letra
     * @return 
     */
    public static String[] devuelveSoluciones() {
        String soluciones[] = {
            "Amparo", "Basilisco", "Capon", "Dedo","Elfo","Frutal","Grafito"};
        return soluciones;
    }

    /**
     * Método que devuelve un array con las letras 
     * @return 
     */
    public static String[] devuelveLetras(){
        String letras[] ={"A","B","C","D","E","F","G"};
        return letras;
    }
    
    /**
     * Método que devuelve un array con las definiciones de cada palabra que empiecen con la letra correspondiente
     * @return 
     */
    public static String[] devuelveDefiniciones(){
        String definiciones[] = {
            "Nombre de mujer", "Nombre de hombre", "Porción pequeña y ligera de nieve trabada que cae cuando nieva",
            "Parte alargada en que terminan la mano y el pie de los vertebrados", 
            "Ser fantástico de gran belleza y poderes mágicos; vive en los bosques, las aguas y en las proximidades de las casas",
            "Se dice del árbol que produce fruta","Mineral de carbono casi puro, de textura compacta, color negro y brillo metálico," ,
            " graso al tacto y buen conductor de la electricidad"
        };
        return definiciones;
    }
    
    
    
}
