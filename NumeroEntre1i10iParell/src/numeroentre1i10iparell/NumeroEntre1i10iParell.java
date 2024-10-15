/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeroentre1i10iparell;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class NumeroEntre1i10iParell {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // El programa tiene que usar el else if
        Scanner teclat = new Scanner(System.in);
        System.out.println("Entra el numero");
        int numero = teclat.nextInt();
        
         if (numero >= 1 && numero <= 10) {
            // Si està entre 1 i 10, comprovar si és parell
            if (numero % 2 == 0) {
                System.out.println("El numero esta entre 1 i 10 i es parell.");
            } else {
                System.out.println("El numero esta entre 1 i 10 pere no es parell.");
            }
        } else {
            System.out.println("El numero no esta entre 1 i 10.");
        }
    }
}

