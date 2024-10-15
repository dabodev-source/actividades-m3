/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modificaresultat;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class ModificaResultat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclat = new Scanner(System.in);
        int numero;
        int resultat = 0;
        
        System.out.println("Entra el numero:");
        numero = teclat.nextInt();
        
        // Multiplica el número per 3 i guarda en resultat
        
        //Para guardar pones el numbro que tiene por ejemlo resultat y se hace de la siguiente manera
        resultat = numero *3;
        System.out.println(resultat);
               
        // Sumali 6
        resultat = resultat +6;
        System.out.println(resultat);
       
        // Divideix entre 3
        resultat = resultat /3;
        System.out.println(resultat);
          
        // Resta-li el valor del número original. En aquest exemple 23
        // Cuando haces el calculo del numero original pones lo mismo que el + pero pones la variable que es numero.
        resultat = resultat - numero;
        System.out.println(resultat);
        
        // mostra el valor resultant: Endevino que serà 2!!
    }
    
}
