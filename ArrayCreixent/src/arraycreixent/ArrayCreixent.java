/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraycreixent;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class ArrayCreixent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclat = new Scanner(System.in);

        // Array de 10 enters
        int[] numeros = new int[10];

        // Entrada dels números
        System.out.println("Introdueix 10 números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = teclat.nextInt();
        }

        // Comprovar si la llista és creixent
        boolean esCreixent = true;
        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i] >= numeros[i + 1]) {
                esCreixent = false;
                break;
            }
        }

        // Mostrar resultat
        if (esCreixent) {
            System.out.println("La llista és creixent.");
        } else {
            System.out.println("La llista no és creixent.");
        }
    }
    
}
