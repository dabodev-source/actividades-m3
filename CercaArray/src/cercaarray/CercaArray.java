/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cercaarray;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class CercaArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclat = new Scanner(System.in);
        int [] taula = {10,78,90,34,56,23,51,21,2,7,89,13,67,91};
        
        System.out.println("Entra el valor que vols buscar");
        int valor_cercat = teclat.nextInt();
        
        int i=0;
        while (taula[i] != valor_cercat && i < taula.length) {
            i++;
        }
        
        if (taula[i] == valor_cercat) System.out.println("S'ha trobat");
        else System.out.printf("No s'ha trobat");
    }
    
}
