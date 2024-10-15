/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desitjos;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class Desitjos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner teclat = new Scanner(System.in);
            // comptador inicialitzat 
            int desitjos = 0;

            // En la condició fem ús del comptador
            while (desitjos < 3) {

              System.out.println("Demana un desig!");
              String desig = teclat.nextLine();
              System.out.println("Desig concedit!!");
              // El comptador és incrementat
              desitjos++;

            }
    }
    
}
