/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucles.encaixats.divisors;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class BUCLESENCAIXATSDivisors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclat = new Scanner(System.in);
        
        int num1;
        int numfinal;
        
        System.out.println("Entra el valor inici");
        num1 = teclat.nextInt();
        
        System.out.println("Entra el valor final");
        numfinal = teclat.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            for (int j =1; j <=1; j++) {
                System.out.print(i + " ");
            }
           System.out.println(""); 
        }
        
    }
    
}
