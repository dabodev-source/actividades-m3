/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplicafentsumes;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class MultiplicaFentSumes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclat = new Scanner(System.in);

        // Demanar els operands a l'usuari
        System.out.print("Operand 1: ");
        int operand1 = teclat.nextInt();

        System.out.print("Operand 2: ");
        int operand2 = teclat.nextInt();

        int resultat = 0;  // Variable per guardar el resultat

        // Bucle per fer sumes successives
        System.out.print(operand1);  // Primer operand imprès per primera vegada
        for (int i = 1; i < operand2; i++) {
            resultat += operand1;  // Sumar l'operand 1 al resultat
            System.out.print(" + " + operand1);  // Imprimir les sumes successives
        }
        resultat += operand1;  // Sumar la darrera vegada
        System.out.println(" = " + resultat);  // Mostrar el resultat
    }
    
}
