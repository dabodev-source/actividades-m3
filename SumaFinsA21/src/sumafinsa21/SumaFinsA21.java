/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumafinsa21;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class SumaFinsA21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclat = new Scanner(System.in);
        int suma = 0;
        int num;
        
        do {
            // Demana a l'usuari que introdueixi un número
            System.out.print("Introdueix un número: ");
            num = teclat.nextInt();

            // Sumar el número introduït (si no és 0)
            if (num >= 1 && num <= 6) {
                suma += num;
                // Mostrar la suma fins al moment
                //System.out.println("La suma fins ara és: " + suma);
            }
        } while (num != 0); // Repetir mentre el número no sigui 0
         System.out.println("La suma total dels números introduïts és: " + suma);
         
         
         
    }
    
}
