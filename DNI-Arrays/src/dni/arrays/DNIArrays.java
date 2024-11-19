/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dni.arrays;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class DNIArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Array de lletres corresponents al DNI
        char[] lletres = {
            'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B',
            'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'
        };

        Scanner scanner = new Scanner(System.in);

        try {
            // Entrada del número de DNI sense lletra
            System.out.println("Introdueix el número del DNI (sense lletra): ");
            int numeroDNI = scanner.nextInt();

            // Càlcul del residu de la divisió entre 23
            int residu = numeroDNI % 23;

            // Agafem la lletra corresponent de l'array
            char lletraDNI = lletres[residu];

            // Mostrem el resultat
            System.out.println("DNI: " + numeroDNI);
            System.out.println("El residu de dividir-lo entre 23 és: " + residu);
            System.out.println("La lletra seria la " + lletraDNI + ", que és la que ocupa aquesta posició l'array de lletres");
        } catch (Exception e) {
            System.out.println("Error: Assegura't d'introduir un número enter vàlid.");
        } finally {
            scanner.close(); // Tanquem el Scanner per alliberar recursos
        }
    }
    
}
