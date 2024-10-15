/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package denfins1;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class DeNFins1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclat = new Scanner(System.in);
        System.out.println("Entra un numero");
        int num = teclat.nextInt();
       // Bucle per mostrar els valors des del número fins a l'1
        for (int i=num; i>=1; i--) {
                System.out.print(i+" ");             
            }
    }
    
}
