/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package positiunegatiuozerowhile;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class PositiuNegatiuOZeroWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclat = new Scanner(System.in);
        int i = 0;
        
        while (i<8) {
            System.out.println("Entra el numero");
            double numero = teclat.nextDouble();
            if (numero > 0) {
            System.out.println("El numero es positivo.");
        } else if (numero < 0) {
            System.out.println("El numero es negativo.");
        } else {
            System.out.println("El numero es cero.");
        }
            i++;
        }
        System.out.println("Adeu");
    }
    
}
