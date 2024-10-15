/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author docto
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclat = new Scanner(System.in);
         try {
            // Demanar un nombre enter per teclat
            System.out.print("Introdueix un nombre enter: ");
            int nombre = teclat.nextInt();

            // Comprovar si el nombre és positiu, negatiu o zero
            if (nombre > 0) {
                System.out.println("El nombre és positiu.");
            } else if (nombre < 0) {
                System.out.println("El nombre és negatiu.");
            } else {
                System.out.println("El nombre és zero.");
            }
        } catch (InputMismatchException e) {
            // Capturar l'excepció si l'usuari no introdueix un nombre enter
            System.out.println("Error: Has d'introduir un nombre enter!");
        }
    }
    
}
