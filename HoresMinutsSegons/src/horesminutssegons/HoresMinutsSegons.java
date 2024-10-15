/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package horesminutssegons;

/**
 *
 * @author docto
 */
public class HoresMinutsSegons {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int segons = 41668; // Pots canviar aquest valor
        double hores;
        double minuts;

        // Càlcul de hores, minuts i segons
        hores = Math.floor(segons / 3600); // Calcular hores
        segons = segons % 3600; // Actualitzar els segons restants
        minuts = Math.floor(segons / 60); // Calcular minuts
        segons = segons % 60; // Actualitzar els segons restants

        // Mostrar el resultat per pantalla
        System.out.println("Hores: " + hores);
        System.out.println("Minuts: " + minuts);
        System.out.println("Segons: " + segons);
    }
    
}
