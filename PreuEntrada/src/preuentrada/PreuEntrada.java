/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package preuentrada;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class PreuEntrada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclat = new Scanner(System.in);
        double preuEntrada = 5.0;  // Preu base d'una entrada un dia laborable
        
        // Demanar si és un dia laborable (L) o cap de setmana (C)
        System.out.println("És un dia laborable (L) o de cap de setmana (C)?");
        char dia = teclat.next().charAt(0);
        
        // Demanar si el client té Carnet Jove (S/N)
        System.out.println("Tens Carnet Jove (S/N)?");
        char carnetJove = teclat.next().charAt(0);
        
        // Comprovar si és cap de setmana
        if (dia == 'C' || dia == 'c') {
            preuEntrada += preuEntrada * 0.10;  // S'incrementa un 10%
        }
        
        // Comprovar si té Carnet Jove
        if (carnetJove == 'S' || carnetJove == 's') {
            preuEntrada -= preuEntrada * 0.15;  // S'aplica un descompte del 15%
        }
        
        // Mostrar el preu final de l'entrada
        System.out.println("El preu final de l'entrada és: " + preuEntrada + "€.");
    }
    
}
