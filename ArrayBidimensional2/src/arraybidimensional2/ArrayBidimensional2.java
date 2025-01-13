/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraybidimensional2;

/**
 *
 * @author docto
 */
public class ArrayBidimensional2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] suma = new int[5][5];

        
        for (int fila = 0; fila < 5; fila++) {
            for (int columna = 0; columna < 5; columna++) {
                suma[fila][columna] = fila + columna;
            }
        }

        
        for (int fila = 0; fila < 5; fila++) {
            for (int columna = 0; columna < 5; columna++) {
                System.out.print(suma[fila][columna] + " ");
            }
            System.out.println(); 
        }
    }
    
}
