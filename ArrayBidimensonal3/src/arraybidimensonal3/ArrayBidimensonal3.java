/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraybidimensonal3;

import java.util.Random;

/**
 *
 * @author docto
 */
public class ArrayBidimensonal3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int files = 4;
        int columnes = 6;

        
        int[][] array = new int[files][columnes];

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
       
        Random random = new Random();
        
        for (int fila = 0; fila < files; fila++) {
            for (int columna = 0; columna < columnes; columna++) {
                array[fila][columna] = random.nextInt(200) + 1; 
                if (array[fila][columna] > max) {
                    max = array[fila][columna];
                }
                if (array[fila][columna] < min) {
                    min = array[fila][columna];
                }
            }
        }

        
        System.out.println("Array generat:");
        for (int fila = 0; fila < files; fila++) {
            int sumaFila = 0; 
            for (int columna = 0; columna < columnes; columna++) {
                System.out.print(array[fila][columna] + "\t");
                sumaFila += array[fila][columna];
            }
            System.out.println(" | Suma fila " + (fila + 1) + ": " + sumaFila);
        }

        
        System.out.println("\nElement més gran de l'array: " + max);
        System.out.println("Element més petit de l'array: " + min);
    }
    
}
