/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package horesminutssegons4vegades;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class HoresMinutsSegons4Vegades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclat = new Scanner(System.in);

        int i = 0;
        
        // Bucle que es repeteix 4 vegades
        while (i < 4) {
            // Demana els segons per teclat
            System.out.println("Introdueix els segons (" + (i + 1) + "/4):");
            int segons = teclat.nextInt();
            
            double hores;
            double minuts;

            // Càlcul de hores, minuts i segons
            hores = Math.floor(segons / 3600); // Calcular hores
            segons = segons % 3600; // Actualitzar els segons restants
            minuts = Math.floor(segons / 60); // Calcular minuts
            segons = segons % 60; // Actualitzar els segons restants

            // Mostrar el resultat per pantalla
            System.out.println("Hores: " + (int) hores);
            System.out.println("Minuts: " + (int) minuts);
            System.out.println("Segons: " + segons);
            System.out.println(); // Salt de línia per separar les iteracions
            
            i++; // Incrementar el comptador del bucle
        }
    }
    
}
