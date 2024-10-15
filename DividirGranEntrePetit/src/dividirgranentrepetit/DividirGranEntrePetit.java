/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dividirgranentrepetit;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class DividirGranEntrePetit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Programa java que entri per teclat 2 números diferents i mostri el resultat de dividir el més gran entre el més petit.
        Scanner teclat = new Scanner(System.in);
        int mesGran;
        int mesPetit;
        
        System.out.println("Introdueix el numero mes gran");
        mesGran = teclat.nextInt();
        
        System.out.println("Introdueix el numero mes petit");
        mesPetit = teclat.nextInt();
        
        //Comprova primer que els 2 números siguin diferents. En cas contrari mostra per pantalla "Els números han de ser diferents".
        if (mesGran == mesPetit) {
            System.out.println("No pots utilitzar el mateix número per gran i petit.");
        } else {
            // Comprovar que el divisor (petit) no sigui zero
            if (mesPetit != 0) {
                // Mostrar el resultat de la divisió
                double resultat = (double) mesGran / mesPetit;
                System.out.println("El resultat de la divisió de " + mesGran + " per " + mesPetit + " és: " + resultat);
            } else {
                // Si el divisor és zero, mostrar el missatge d'error
                System.out.println("El divisor no pot ser 0.");
            }
        }

        
        //Comprova que el petit no sigui zero!! Si és zero mostre el missatge "El divisor no pot ser 0".
       
        
        
    }
    
}
