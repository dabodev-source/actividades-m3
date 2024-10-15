/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplicapetitidivideixgranfinsrevertir;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class MultiplicaPetitIDivideixGranFinsRevertir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclat = new Scanner(System.in);
        
        // Demanar els números a l'usuari
        System.out.print("Introdueix un número gran: ");
        int gran = teclat.nextInt();
        
        System.out.print("Introdueix un número petit: ");
        int petit = teclat.nextInt();

        // Comprovar que gran és efectivament més gran que petit
        if (gran <= petit) {
            System.out.println("El número gran ha de ser més gran que el número petit.");
        } else {
            // Bucle while per imprimir els valors fins que gran sigui menor o igual que petit
            while (gran > petit) {
                System.out.println("Gran = " + gran + "  Petit = " + petit);
                gran /= 2; // Dividir el número gran per 2
                petit *= 2; // Multiplicar el número petit per 2
            }
        }
    }
    
}
