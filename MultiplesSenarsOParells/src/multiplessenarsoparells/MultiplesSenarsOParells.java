/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplessenarsoparells;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author docto
 */
public class MultiplesSenarsOParells {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Generar un número de nombres aleatoris segons indiqui l'usuari per teclat. Comptar quants són parells i quants són senars.
        // Crear objectes Scanner per llegir dades i Random per generar nombres aleatoris
        Scanner teclat = new Scanner(System.in);
        Random generador = new Random();

        // Demanar a l'usuari quants números aleatoris vol generar
        System.out.println("Quant números vols generar?");
        int quantitat = teclat.nextInt();

        // Inicialitzar els comptadors de nombres parells i senars
        int parells = 0;
        int senars = 0;

        // Generar els números aleatoris i comptar si són parells o senars
        for (int i = 0; i < quantitat; i++) {
            int numero = generador.nextInt(100); // Genera un nombre aleatori entre 0 i 99
          
            if (numero % 2 == 0) {
                parells++; // Si és parell, augmentar el comptador de parells
            } else {
                senars++; // Si és senar, augmentar el comptador de senars
            }
        }

        // Mostrar el resultat
        System.out.println("S'han generat " + parells + " parells.");
        System.out.println("S'han generat " + senars + " senars.");
        
     
    }
}

    
