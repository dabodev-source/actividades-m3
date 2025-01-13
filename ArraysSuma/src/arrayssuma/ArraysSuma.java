/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayssuma;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class ArraysSuma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Donat un array de x posicions obtenir la suma de tots els seus elements.
        Scanner teclat = new Scanner(System.in);
        
        System.out.println("Introduce el tamaño del array");
        int x = teclat.nextInt();
        int[] numeros = new int[x];
        
        System.out.println("Introduce los elementos del arrays");
        for (int i = 0; i < x; i++) {
            numeros[i] = teclat.nextInt();
        }
        
        // Calcular la suma
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        
        System.out.println("La suma total es: " + suma);
    }
    
}
