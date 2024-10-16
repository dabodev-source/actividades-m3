/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maxmin;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class MaxMin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclat = new Scanner(System.in);
        int i = 0;
        int max=0, min = Integer.MAX_VALUE;
        
        while(i<20) {
            System.out.println("Entra un número");
            int numero = teclat.nextInt();
            if (numero > max) {
               max = numero; 
            }
            if (numero < min) {
                min = numero;
            }
            i++;
        }
        System.out.println("Max="+ max + " Min = " +min);
  
        
        //Segona versió
        
        i = 0;
        System.out.println("Entra un número");
        int numero = teclat.nextInt();
        max= numero;
        min =numero;
        
        while(i<19) {
            System.out.println("Entra un número");
            numero = teclat.nextInt();
            if (numero > max) {
               max = numero; 
            }
            if (numero<min) {
                min = numero;
            }
            i++;
        }
        System.out.println("Max="+ max  + " Min = " +min);
    }
    
}
