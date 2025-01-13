/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraymenu;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class ArrayMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Part 1: Llistat de menús i preus
        String[] noms = {"Combinat pinxo pollastre", "Combinat de llom", 
                         "Combinat calamars a la romana", "Combinat sípia i verdures", 
                         "Salmó fumat", "Combinat assortit de verdures"};
        double[] preus = {10, 9, 10.20, 11, 12, 10};

        System.out.println("MENÚS DISPONIBLES:");
        for (int i = 0; i < noms.length; i++) {
            System.out.printf("%d. %s - %.2f euros%n", i + 1, noms[i], preus[i]);
        }

        // Part 2: Demanar número de comensals i elecció de menús
        Scanner teclat = new Scanner(System.in);
        System.out.print("\nQuants comensals seran: ");
        int comensals = teclat.nextInt();

        double total = 0;
        for (int i = 0; i < comensals; i++) {
            System.out.printf("Menú comensal %d: ", i + 1);
            int menuSeleccionat = teclat.nextInt();
            if (menuSeleccionat < 1 || menuSeleccionat > noms.length) {
                System.out.println("Número de menú no vàlid. Torna a provar.");
                i--; // Repetim aquesta iteració
                continue;
            }
            total += preus[menuSeleccionat - 1];
        }

        // Part 3: Factura
        double iva = 0.21; // IVA del 21%
        double totalAmbIVA = total + (total * iva);

        System.out.printf("%nEl preu total dels %d plats amb IVA és de: %.2f euros%n", comensals, totalAmbIVA);        
            
    }
    
}
