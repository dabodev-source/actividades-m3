/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buscarcaracter;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class BuscarCaracter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner teclat = new Scanner(System.in);

        // Entrada del text
        System.out.print("Entra un text: ");
        String text = teclat.nextLine();

        // Entrada del caràcter
        System.out.print("Entra un caràcter: ");
        char caracter = teclat.next().charAt(0);

        // Variables per emmagatzemar les posicions i el compte
        StringBuilder posicions = new StringBuilder();
        int comptador = 0;

        // Recorrem el text per trobar el caràcter
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == caracter) {
                posicions.append(i + 1).append(" "); // Posició +1 per començar a comptar des de 1
                comptador++;
            }
        }

        // Mostrem el resultat
        if (comptador > 0) {
            System.out.println("El caràcter '" + caracter + "' es troba en les posicions: " + posicions.toString().trim());
            System.out.println("Surt " + comptador + " cop" + (comptador > 1 ? "s" : "") + ".");
        } else {
            System.out.println("El caràcter '" + caracter + "' no es troba en el text.");
        }
    }
    
}
