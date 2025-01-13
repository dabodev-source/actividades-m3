/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraydedataleatories;

import java.util.Random;

/**
 *
 * @author docto
 */
public class ArrayDedatAleatories {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // Nombre de valors i rang d'edats
        int numValors = 500;
        int minEdat = 0;
        int maxEdat = 80;

        // Crear array per desar les edats
        int[] edats = new int[numValors];

        // Generar valors aleatoris
        Random random = new Random();
        for (int i = 0; i < numValors; i++) {
            edats[i] = random.nextInt(maxEdat - minEdat + 1) + minEdat;
        }

        // Comptadors per a infants i majors d'edat
        int numInfants = 0;
        int numMajorsEdat = 0;

        // Recórrer l'array i comptar
        for (int edat : edats) {
            if (edat >= 0 && edat <= 5) {
                numInfants++;
            }
            if (edat >= 18) {
                numMajorsEdat++;
            }
        }

        // Mostrar resultats
        System.out.println("Número d'infants (0-5 anys): " + numInfants);
        System.out.println("Número de persones majors d'edat (18+ anys): " + numMajorsEdat);
    }
    
}
