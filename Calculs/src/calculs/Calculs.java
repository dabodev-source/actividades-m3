/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculs;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class Calculs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SuperCalculadora calcu = new SuperCalculadora();
        int resultat = calcu.sumaPrimersNumeros(3); // return 6
        System.out.println("La suma és " + resultat);
        
        //resultat = calcu.sumaPrimersNumeros(10); // return 55
        //System.out.println("La suma és " + resultat);
        
        //resultat = calcu.sumaPrimersNumeros(20); // return 210
        //System.out.println("La suma és " + resultat);
        
        //int numero;
        //Scanner teclat = new Scanner(System.in);
        //System.out.println("Entra el numero");
        //numero = teclat.nextInt();
        //resultat = calcu.sumaPrimersNumeros(numero); // return ?
        //System.out.println("La suma és " + resultat);
        
        calcu.mostarMenu();
    }
    
}
