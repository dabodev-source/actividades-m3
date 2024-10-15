/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quadrat;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class Quadrat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        // Entra el valor del costat per teclat!!
        // Para calcular el area de un cuadrado era multiplicando por 4
        System.out.println("Intodueix el valor del quadrat");
        int costat = teclat.nextInt();
        int perimetre = costat*4;
        
        int area = costat * costat;
            
        System.out.println("El perimetre del quadrat es = " +perimetre);
        System.out.println("El area del quadrat es = " +area);
      
        
        // mostrar el perímetre i l'àrea del quadrat.
    }
    
}
