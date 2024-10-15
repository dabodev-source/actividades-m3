/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tauladeln;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class TaulaDelN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner teclat = new Scanner(System.in);

        // Demanar a l'usuari que introdueixi el número per generar la taula
        System.out.print("Introdueix el número per a la taula de multiplicar: ");
        int numero = teclat.nextInt();

        // Bucle per generar la taula del número introduït
        for (int i = 1; i <= 10; i++) {
            // Imprimir la línia amb el format desitjat
            System.out.println(numero + " * " + i + " = " + (numero * i));
        }

        teclat.close();  // Tancar el Scanner
    }
    
}
