/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calcularnota;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class CalcularNota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner teclat = new Scanner(System.in);

        // Demanar la nota a l'usuari
        System.out.print("Introdueix una nota (entre 0 i 10): ");
        double nota = teclat.nextDouble();

        // Comprovar si la nota està dins del rang permès
        if (nota < 0 || nota > 10) {
            System.out.println("La nota ha de ser entre 0 i 10.");
        } else {
            // Determinar la qualificació segons la nota
            if (nota >= 9) {
                System.out.println("Excel·lent");
            } else if (nota >= 7) {
                System.out.println("Notable");
            } else if (nota >= 6) {
                System.out.println("Bé");
            } else if (nota >= 5) {
                System.out.println("Suficient");
            } else {
                System.out.println("Insuficient");
            }
        }
    }
    
}
