/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculnotamitjana;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class CalculNotaMitjana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclat = new Scanner(System.in);

        // 1. Introduir el número d'alumnes
        System.out.print("Introdueix el nombre d'alumnes: ");
        int numAlumnes = teclat.nextInt();

        // Variable per acumular la suma de les notes
        double suma = 0;

        // 2. Demanar la nota de cada alumne
        for (int i = 1; i <= numAlumnes; i++) {
            System.out.print("Introdueix la nota de l'alumne " + i + ": ");
            double nota = teclat.nextDouble();
            suma += nota;  // Anar acumulant la suma de les notes
        }

        // 4. Calcular la mitjana dividint la suma entre el nombre d'alumnes
        double mitjana = suma / numAlumnes;

        // 5. Mostrar la mitjana per pantalla
        System.out.println("La nota mitjana de la classe és: " + mitjana);

        teclat.close();  // Tancar el Scanner
    }
    
}
