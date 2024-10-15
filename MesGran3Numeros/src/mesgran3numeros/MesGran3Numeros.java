/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mesgran3numeros;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class MesGran3Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclat = new Scanner(System.in);

        // Demanar els 3 números
        System.out.print("Introdueix el primer número: ");
        int num1 = teclat.nextInt();
        
        System.out.print("Introdueix el segon número: ");
        int num2 = teclat.nextInt();
        
        System.out.print("Introdueix el tercer número: ");
        int num3 = teclat.nextInt();

        // Comprovar quin és el més gran
        if (num1 >= num2 && num1 >= num3) {
            System.out.println("El número més gran és: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("El número més gran és: " + num2);
        } else {
            System.out.println("El número més gran és: " + num3);
        }
    }
    
}
