/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parellsenar;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class ParellSenar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclat = new Scanner(System.in);
        int numero = 0;
        
        System.out.println("Entra el numero");
        numero = teclat.nextInt();
        
        if ((numero % 2) == 0) {              
                 System.out.println("Es parell");
             } else  
                System.out.println("Es senar");
    }
    
}
