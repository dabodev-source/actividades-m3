/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operacions;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class Operacions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a , b ;
        Scanner teclat = new Scanner(System.in);
        
        // Donar valor a la variable a per teclat
        System.out.println("Entra el valor del primer operand:");
        a = teclat.nextInt();
        
        // Donar valor a la variable b per teclat
        System.out.println("Entra el valor  del primer operand:");
        b = teclat.nextInt();
        
        System.out.println(a + "+"+ b + "=" +(a+b));
        System.out.println(a + "-"+ b +"=" +(a-b));
        System.out.println(a +"*"+ b +"=" + a*b);
        System.out.println(a +"/"+ b +"=" + a /b);
    }
    
}
