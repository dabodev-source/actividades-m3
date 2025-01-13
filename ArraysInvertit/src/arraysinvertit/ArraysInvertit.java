/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraysinvertit;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class ArraysInvertit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner teclat = new Scanner(System.in);

        System.out.println("Introdueix el tamany de l'array:");
        int N = teclat.nextInt();
        int[] numeros = new int[N];
        int[] invers = new int[N]; // Nou array per desar els valors invertits

        System.out.println("Introdueix els elements de l'array:");
        for (int i = 0; i < N; i++) {
            numeros[i] = teclat.nextInt();
        }

        // Invertir els valors i desar-los al nou array
        for (int i = 0; i < N; i++) {
            invers[i] = numeros[N - 1 - i];
        }

        // Mostrar el nou array
        System.out.println("Els valors invertits són:");
        for (int num : invers) {
            System.out.print(num + " ");
        }
    }
    
}
