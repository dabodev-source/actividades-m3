/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayambelsparells;

import java.util.Random;

/**
 *
 * @author docto
 */
public class ArrayAmbElsParells {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here   
        Random random = new Random();

        // Generar la primera llista de 15 elements compresos entre 50 i 100
        int[] primeraLlista = new int[15];
        for (int i = 0; i < primeraLlista.length; i++) {
            primeraLlista[i] = random.nextInt(51) + 50; // Nombres entre 50 i 100
        }

        // Comptar els nombres parells
        int parellsCount = 0;
        for (int num : primeraLlista) {
            if (num % 2 == 0) {
                parellsCount++;
            }
        }

        // Crear la segona llista amb els nombres parells
        int[] segonaLlista = new int[parellsCount];
        int index = 0;
        for (int num : primeraLlista) {
            if (num % 2 == 0) {
                segonaLlista[index++] = num;
            }
        }

        // Mostrar les dues llistes
        System.out.print("Primera llista: ");
        for (int num : primeraLlista) {
            System.out.print(num + " ");
        }

        System.out.print("\nSegona llista: ");
        for (int num : segonaLlista) {
            System.out.print(num + " ");
        }
        
    }
    
}
