/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculardescompte;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class CalcularDescompte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclat = new Scanner(System.in);
        // Demanar al usuari que introdueixi la quantitat
        System.out.print("Introdueix una quantitat N: ");
        double n = teclat.nextDouble();

        // Aplicar els descomptes segons les condicions
        if (n < 500) {
            n = n * 0.95; // Restar un 5%
        } else if (n >= 500 && n < 1000) {
            n = n * 0.92; // Restar un 8%
        } else if (n >= 1000 && n <= 5000) {
            n = n * 0.85; // Restar un 15%
        } else if (n > 5000) {
            n = n * 0.75; // Restar un 25%
        }

        // Visualitzar el resultat
        System.out.println("El resultat després d'aplicar el descompte és: " + n + "€");
    }
    
}
