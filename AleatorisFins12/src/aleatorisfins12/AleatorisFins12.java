/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aleatorisfins12;

import java.util.Random;

/**
 *
 * @author docto
 */
public class AleatorisFins12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random generador = new Random();
        int numeroGenerat = -1;  // Variable per guardar el nombre generat aleatòriament
        int iteracions = 0;      // Comptador d'iteracions

        // Bucle que es repeteix fins que es generi el número 12
        while (numeroGenerat != 12) {
            numeroGenerat = generador.nextInt(16);  // Generar un nombre entre 0 i 15
            int distancia = Math.abs(numeroGenerat - 12);  // Calcular la distància a 12

            // Imprimir el número generat i la distància fins a l'objectiu
            System.out.println("El número generat és: " + numeroGenerat + ", falten " + distancia + " per assolir l'objectiu.");

            iteracions++;  // Incrementar el comptador d'iteracions
        }

        // Un cop s'ha generat el número 12, mostrar el nombre d'iteracions
        System.out.println("Objectiu assolit en " + iteracions + " iteracions.");
    }
    
}
