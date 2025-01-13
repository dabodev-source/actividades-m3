/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numvocalstext;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class NumVocalsText {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);

        // Entrada de la cadena
        System.out.print("Entra una cadena: ");
        String cadena = scanner.nextLine().toLowerCase(); // Convertim a minúscules per simplificar la cerca

        // Inicialitzem el comptador de vocals
        int comptadorVocals = 0;

        // Recorrem la cadena per comptar les vocals
        for (int i = 0; i < cadena.length(); i++) {
            char car = cadena.charAt(i);
            if (car == 'a' || car == 'e' || car == 'i' || car == 'o' || car == 'u') {
                comptadorVocals++;
            }
        }

        // Mostrem el resultat
        System.out.println("La cadena conté " + comptadorVocals + " vocals.");
    }
    
}
