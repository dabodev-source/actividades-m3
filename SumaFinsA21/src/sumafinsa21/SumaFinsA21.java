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
        
        // Bucle fins que la suma passi de 21
        while (suma <= 21) {
            // Demanar a l'usuari un número
            System.out.print("Entra número: ");
            int numero = teclat.nextInt();

            // Comprovar si el número està entre 1 i 5
            if (numero >= 1 && numero <= 5) {
                suma += numero;  // Sumar el número a la suma total
            } else {
                System.out.println("El número no és correcte!");  // Missatge d'error si el número no és vàlid
            }

            // Si la suma passa de 21, mostrar el missatge final
            if (suma > 21) {
                System.out.println("Més de 21! La suma dels números entrats és " + suma);
            }
        }
         
       
    }
    
}
