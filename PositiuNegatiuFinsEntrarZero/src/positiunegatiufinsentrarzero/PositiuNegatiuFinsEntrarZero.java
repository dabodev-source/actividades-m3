/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package positiunegatiufinsentrarzero;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class PositiuNegatiuFinsEntrarZero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclat = new Scanner(System.in);
        int numero;

        // Bucle per demanar números fins que l'usuari introdueixi 0
        do {
            System.out.print("Introdueix un número: ");
            numero = teclat.nextInt(); // Llegir el número

            if (numero > 0) {
                System.out.println("El número " + numero + " és positiu.");
            } else if (numero < 0) {
                System.out.println("El número " + numero + " és negatiu.");
            }
        } while (numero != 0); // Continuar fins que es introdueixi 0

        System.out.println("Adeu!"); // Missatge d'acomiadament
    }
    
}
