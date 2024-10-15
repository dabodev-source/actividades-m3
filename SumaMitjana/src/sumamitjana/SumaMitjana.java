/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumamitjana;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class SumaMitjana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclat = new Scanner(System.in);
        int num1, num2, num3, num4;
        int resultat;
        
        
       // Donar valor a les variables a través del teclat del terminal
        System.out.println("Entra els numeros per a calcular la mitjana:");
        num1 = teclat.nextInt();
        num2 = teclat.nextInt();
        num3 = teclat.nextInt();
        num4 = teclat.nextInt();
        
         resultat = (num1 + num2 + num3 + num4)/4;
        
        System.out.println("El resultat es " + resultat);
        
        // Mostra el resultat operacions
        
    }
    
}
