/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seqüèncianumeros;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class SeqüènciaNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclat = new Scanner(System.in);
        
        // Demanar al usuari quin ha de ser el final de la seqüència
        System.out.print("Quin ha de ser el final de la seqüència? ");
        int finalSeq = teclat.nextInt();

        // Inicialitzar el primer número de la seqüència
        int numero = 2;

        // Mostrar la seqüència
        System.out.print("La seqüència és: ");
        
        // Utilitzar un bucle while per generar la seqüència
        while (numero <= finalSeq) {
            System.out.print(numero);
            // Incrementar el número en 3
            numero += 3;
            // Si el número encara no ha arribat al final, afegir una coma
            if (numero <= finalSeq) {
                System.out.print(", ");
            }
        }
    }
    
}
