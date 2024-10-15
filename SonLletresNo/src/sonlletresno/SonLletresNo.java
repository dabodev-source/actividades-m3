/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sonlletresno;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class SonLletresNo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner teclat = new Scanner(System.in);

        // Bucle per demanar 10 caràcters
        for (int i = 1; i <= 10; i++) {
            System.out.println("Introdueix el caràcter " + i + ": ");
            char car = teclat.next().charAt(0);  // Llegeix un sol caràcter

            // Comprova si és una lletra majúscula
            if (car >= 'A' && car <= 'Z') {
                System.out.println(car + " és una lletra majúscula.");
            }
            // Comprova si és una lletra minúscula
            else if (car >= 'a' && car <= 'z') {
                System.out.println(car + " és una lletra minúscula.");
            }
            // Si no és ni majúscula ni minúscula, no és una lletra
            else {
                System.out.println(car + " no és una lletra.");
            }
        }

        teclat.close();  // Tanca el Scanner
    }
    
}
