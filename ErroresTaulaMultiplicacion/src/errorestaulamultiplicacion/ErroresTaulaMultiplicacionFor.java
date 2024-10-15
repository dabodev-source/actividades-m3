/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package errorestaulamultiplicacion;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class ErroresTaulaMultiplicacionFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // TODO code application logic here
        Scanner teclat = new Scanner(System.in);
        int errors = 0;

        // Demanar a l'usuari que introdueixi el número de la taula de multiplicar
        System.out.print("Entra el número per la taula de multiplicar: ");
        int numero = teclat.nextInt();

        // Bucle per demanar els resultats de la taula de multiplicar del número
        for (int i = 1; i <= 10; i++) {
            // Calcular el resultat correcte
            int resultatCorrecte = numero * i;

            // Demanar el resultat a l'usuari
            System.out.print(numero + " × " + i + " = ");
            int respostaUsuari = teclat.nextInt();

            // Comprovar si la resposta és correcta o incorrecta
            if (respostaUsuari == resultatCorrecte) {
                System.out.println("Correcte!");
            } else {
                System.out.println("Incorrecte!");
                errors++;  // Incrementar el comptador d'errors
            }
        }

        // Mostrar el nombre total d'errors
        System.out.println("Has comès " + errors + " errors!");
    }
    
}
