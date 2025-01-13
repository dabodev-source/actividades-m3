/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cercarcaractertext;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class CercarCaracterText {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner teclat = new Scanner(System.in);

        // Entrada de la cadena
        System.out.print("Entra un text: ");
        String text = teclat.nextLine();

        // Entrada del caràcter
        System.out.print("Entra un caràcter: ");
        char caracter = teclat.next().charAt(0);

        // Comprovació si el caràcter es troba dins de la cadena
        if (text.indexOf(caracter) != -1) {
            System.out.println("El caràcter '" + caracter + "' es troba dins de la cadena.");
        } else {
            System.out.println("El caràcter '" + caracter + "' no es troba dins de la cadena.");
        }
    }
    
}
