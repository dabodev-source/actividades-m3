/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package de1finsan;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class De1FinsAN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Entra un número enter per teclat i mostra els valors que van d'1 fins al número entrat.
        Scanner teclat = new Scanner(System.in);
        System.out.println("Entra un numero");
        int num = teclat.nextInt();
       
        for (int i=1; i<=num; i++) {
                System.out.print(i+"   ");             
            }
    }
    
}
