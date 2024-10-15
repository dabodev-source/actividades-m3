/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class UF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclat = new Scanner(System.in);

        // Entrada de la nota de les activitats
        System.out.print("Introdueix la nota de les activitats (0-10): ");
        double notaActivitats = teclat.nextDouble();

        // Entrada de la nota de les proves
        System.out.print("Introdueix la nota de les proves (0-10): ");
        double notaProves = teclat.nextDouble();

        // Comprovar que les notes estiguin dins de l'interval vàlid
        if ((notaActivitats < 0 || notaActivitats > 10) || (notaProves < 0 || notaProves > 10)) {
            System.out.println("Les notes han de ser entre 0 i 10.");
        } else {
            // Càlcul de la mitjana ponderada
            double mitjanaPonderada = (notaActivitats * 0.10) + (notaProves * 0.90);

            // Mostrar la mitjana ponderada
            System.out.printf("La teva nota final és: %.2f%n", mitjanaPonderada);

            // Comprovar si s'ha aprovat
            if (mitjanaPonderada >= 5) {
                System.out.println("Has aprovat!");
            } else {
                System.out.println("No has aprovat.");
            }
        }
    }
    
}
