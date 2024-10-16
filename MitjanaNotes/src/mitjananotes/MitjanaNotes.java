/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mitjananotes;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class MitjanaNotes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclat = new Scanner(System.in);
        int suma = 0;
        int alumnes;
        int nota;
        
        //Introduir per teclat el número d'alumnes que hi ha al grup.
        System.out.println("Cuants alumnes hi ha al grup? ");
        alumnes = teclat.nextInt();
        
        //Per a cada alumne demaneu la seva nota.
        System.out.println("Introdueix la nota del alumne");
        nota = teclat.nextInt();
        
        while (alumnes<0) {
            suma+= nota/4;
        }
     
        
       System.out.println("La mitjana de les notes es" +suma);
        
    }
    
}
