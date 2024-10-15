/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package monedes2.pkg0;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class Monedes20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclat = new Scanner(System.in);

        // Demanar la quantitat en cèntims
        System.out.print("Introdueix una quantitat (cèntims d'euro): ");
        int quantitat = teclat.nextInt();

        // Comprovar que la quantitat sigui més gran o igual a 0
        if (quantitat < 0) {
            System.out.println("La quantitat ha de ser més gran o igual a zero.");
        } else {
            // Variables per a comptar les monedes
            int monedes200 = quantitat / 200;
            quantitat %= 200;

            int monedes100 = quantitat / 100;
            quantitat %= 100;

            int monedes50 = quantitat / 50;
            quantitat %= 50;

            int monedes20 = quantitat / 20;
            quantitat %= 20;

            int monedes10 = quantitat / 10;
            quantitat %= 10;

            int monedes5 = quantitat / 5;
            quantitat %= 5;

            int monedes2 = quantitat / 2;
            quantitat %= 2;

            int monedes1 = quantitat;  // El que queda seran monedes de 1 cèntim

            // Mostrar el resultat
            if (monedes200 > 0) {
                System.out.println(monedes200 + " monedes de 2 euros");
            }
            if (monedes100 > 0) {
                System.out.println(monedes100 + " monedes de 1 euro");
            }
            if (monedes50 > 0) {
                System.out.println(monedes50 + " monedes de 50 cèntims");
            }
            if (monedes20 > 0) {
                System.out.println(monedes20 + " monedes de 20 cèntims");
            }
            if (monedes10 > 0) {
                System.out.println(monedes10 + " monedes de 10 cèntims");
            }
            if (monedes5 > 0) {
                System.out.println(monedes5 + " monedes de 5 cèntims");
            }
            if (monedes2 > 0) {
                System.out.println(monedes2 + " monedes de 2 cèntims");
            }
            if (monedes1 > 0) {
                System.out.println(monedes1 + " monedes de 1 cèntim");
            }
        }
    }
    
}
