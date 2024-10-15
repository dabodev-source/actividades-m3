/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package llançamentmoneda;

import java.util.Random;

/**
 *
 * @author docto
 */
public class LlançamentMonedaFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Random random = new Random();
        int cares = 0;
        int creus = 0;

        // Llançament de la moneda 100 vegades
        for (int i = 0; i < 100; i++) {
            int resultat = random.nextInt(2); // 0 per cara, 1 per creu

            if (resultat == 0) {
                cares++;  // Incrementem cares si el resultat és 0
            } else {
                creus++;  // Incrementem creus si el resultat és 1
            }
        }

        // Mostrar el resultat
        System.out.println("Cares: " + cares);
        System.out.println("Creus: " + creus);
    }
    
}
