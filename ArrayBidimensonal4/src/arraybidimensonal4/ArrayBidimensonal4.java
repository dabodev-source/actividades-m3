/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraybidimensonal4;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author docto
 */
public class ArrayBidimensonal4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclat = new Scanner(System.in);
        Random random = new Random();

        int n;

        // Llegir el valor de "n" assegurant que sigui entre 3 i 20
        do {
            System.out.print("Introduir valor n (major que 2 i menor o igual que 20): ");
            n = teclat.nextInt();
        } while (n <= 2 || n > 20);

        // Crear i carregar la matriu amb nombres aleatoris
        int[][] matriu = new int[n][n];
        System.out.println("Matriu generada:");
        for (int fila = 0; fila < n; fila++) {
            for (int columna = 0; columna < n; columna++) {
                matriu[fila][columna] = random.nextInt(10); // Nombres entre 0 i 9
                System.out.print(matriu[fila][columna] + "\t");
            }
            System.out.println();
        }

        // Llegir el número a comptar
        System.out.print("\nIntroduir número a comptar: ");
        int num = teclat.nextInt();

        // Comptar les vegades que apareix el número
        int comptador = 0;
        for (int fila = 0; fila < n; fila++) {
            for (int columna = 0; columna < n; columna++) {
                if (matriu[fila][columna] == num) {
                    comptador++;
                }
            }
        }

        // Mostrar el resultat
        System.out.println("\nEl número " + num + " surt " + comptador + " cop(s).");
    }
    
}
