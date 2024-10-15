/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fiebre;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class Fiebre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclat = new Scanner(System.in);
        final double TEMP_FEBRE = 37;
        
        System.out.println("Entra la temperatura");
        double temperatura_actual = teclat.nextDouble();
        
        // If significa que haga esto cuando entras por teclado la temperatura calcula la temperatura puesta y si es mas > pues te da el tens febre cuando no pones un else y pones no tens febre
             if (temperatura_actual >= TEMP_FEBRE) {              
                 System.out.println("Tens febre");
             } else  
                System.out.println("No tens febre");
        
    }
    
}
