/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3array;

import java.util.Random;

/**
 *
 * @author docto
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random generator = new Random();
        int [] numeros = new int [20];
        int [] quadrats = new int [20];
        int [] cubs = new int [20];
        

        // Carreguem l'array numeros amb valors aleatoris entre 0 i 10
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = generator.nextInt(11); // Genera valors de 0 a 10
            quadrats[i] = numeros[i] * numeros[i]; // Calcula el quadrat
            cubs[i] = numeros[i] * numeros[i] * numeros[i]; // Calcula el cub
        }

        // Mostrem el contingut dels tres arrays en tres files
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < quadrats.length; i++) {
            System.out.print(quadrats[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < cubs.length; i++) {
            System.out.print(cubs[i] + " ");
        }
        System.out.println();
        
    }
    
}
