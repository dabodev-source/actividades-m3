/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayssuperiorinferiors;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class ArraysSuperiorInferiors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclat = new Scanner(System.in);
        
        //Imprimir la llista.
        int[] vector = new int[5];
        
        System.out.println("Introdueix 5 valors:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            vector[i] = teclat.nextInt(); // Assignar valor a cada posició
        }

        System.out.println("Has entrat els següents valors:");
        for (int i = 0; i < 5; i++) {
            System.out.print(vector[i] + " ");
        }
        
        //Calcular la suma dels elements
        int suma = 0;
        for (int num : vector) {
            suma += num;
        }
        System.out.println("\nLa suma dels valors és: " + suma);  
        
        //Calcular la mitjana dels elements
        double mitjana = (double) suma / vector.length;     
        System.out.println("La mitjana es " + mitjana);
        
        //Mostrar els valors més petits que la mitjana.
        System.out.println("Valors més petits que la mitjana:");
        for (int num : vector) {
            if (num < mitjana) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
        
        
        //Mostrar els valors més grans que la mitjana.
        System.out.println("Valors més gran que la mitjana");
        for (int num : vector) {
            if (num > mitjana) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
    
}
