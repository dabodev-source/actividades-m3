/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package orderinvers;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class OrderInvers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        // Mida fixa de l'array
        int[] array = new int[10];
        
        System.out.println("Introdueix 10 números separats per espais:");

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
                

        // Mostrar els valors introduïts
        System.out.println("Els valors introduïts són:");
        for (int valor : array) {
            System.out.print(valor + " ");
        }
        
       System.out.println();
        
       System.out.println("Els números en ordre invers són:");
        for (int i = array.length - 1; i >=0; i--) {
            System.out.print(array[i] + " ");
        }
    }
    
}


//250 406 908 304 506 99 65 123 67 45