/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animals;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class Animals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclat = new Scanner(System.in);

        // Demanar el número de vaques
        System.out.print("Quantes vaques hi ha a la granja? ");
        int numVaques = teclat.nextInt();

        // Demanar el número de porcs
        System.out.print("Quants porcs hi ha a la granja? ");
        int numPorcs = teclat.nextInt();

        // Calcular el total d'animals
        int totalAnimals = numVaques + numPorcs;

        // Comprovar que hi ha animals per evitar divisió per zero
        if (totalAnimals > 0) {
            // Calcular els percentatges
            double percentatgeVaques = (double) numVaques / totalAnimals * 100;
            double percentatgePorcs = (double) numPorcs / totalAnimals * 100;

            // Mostrar els percentatges
            System.out.printf("El percentatge és: %.2f%% de vaques i %.2f%% de porcs.%n", percentatgeVaques, percentatgePorcs);

            // Comprovar quin percentatge és més gran
            if (percentatgeVaques > percentatgePorcs) {
                System.out.println("Hi ha més vaques que porcs!");
            } else if (percentatgePorcs > percentatgeVaques) {
                System.out.println("Hi ha més porcs que vaques!");
            } else {
                System.out.println("Hi ha el mateix percentatge de vaques i porcs!");
            }
        } else {
            System.out.println("No hi ha animals a la granja.");
        }
        
    }
    
}
