/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package llançamentdau;

import java.util.Random;

/**
 *
 * @author docto
 */
public class LlançamentDau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Inicialitzar array de comptadors per a cada cara del dau (1 a 6)
        int[] comptadors = {0, 0, 0, 0, 0, 0};
        Random random = new Random();

        // Llançar el dau 100 vegades
        for (int i = 0; i < 100; i++) {
            int tirada = random.nextInt(6) + 1; // Genera un número entre 1 i 6
            comptadors[tirada - 1]++; // Incrementar el comptador de la cara corresponent
        }

        // Mostrar els resultats
        System.out.println("Resultats del llançament del dau:");
        for (int i = 0; i < comptadors.length; i++) {
            System.out.printf("Ha sortit %d cops el %d.%n", comptadors[i], i + 1);
        }
    }
    
}
