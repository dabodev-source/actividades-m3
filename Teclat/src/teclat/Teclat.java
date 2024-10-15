/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teclat;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class Teclat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclat = new Scanner(System.in);
        int numero;
        //Esto tendras que ponerlo encima del teclat.nextInt()
        System.out.println("Introduce un numero:");
        numero = teclat.nextInt();
        //Cuando pones un mas al lado de una variable estas concatenando
        System.out.println("Has entrat " +numero);
        
        double decimal;
        System.out.println("Introduce un numero decimal:");
        decimal = teclat.nextDouble();
        System.out.println("Has entrat " + decimal);
        
        int suma;
        System.out.println("Introduce la suma");
        suma = teclat.nextInt();
        System.out.println("Has entrar " + suma);
        
    }
    
}
