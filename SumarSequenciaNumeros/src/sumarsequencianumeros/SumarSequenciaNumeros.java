/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumarsequencianumeros;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class SumarSequenciaNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclat = new Scanner(System.in);
         
        // int num;
        // int resultat;
        // System.out.println("Entra un numero");
        // num = teclat.nextInt();
         //System.out.println("La suma fins ara és " + num);
        
        // while (num!=0) {
           //   System.out.println("Entra un numero");
            //  num = teclat.nextInt();
             
            //  System.out.println("La suma fins ara és " + num);
             
             //  resultat = num +num;   
              // System.out.println(resultat);
              
              
         //} 
        //System.out.println("La suma total dels números introduïts és: " + resultat);
        
        int suma = 0;
        int numero;

        // Bucle per entrar números fins que l'usuari introdueixi un 0
        do {
            // Demana a l'usuari que introdueixi un número
            System.out.print("Introdueix un número: ");
            numero = teclat.nextInt();

            // Sumar el número introduït (si no és 0)
            if (numero != 0) {
                suma += numero;
                // Mostrar la suma fins al moment
                System.out.println("La suma fins ara és: " + suma);
            }
        } while (numero != 0); // Repetir mentre el número no sigui 0

        // Mostrar la suma total un cop finalitzat el bucle
        System.out.println("La suma total dels números introduïts és: " + suma);
        
      
            
    
    }
}
