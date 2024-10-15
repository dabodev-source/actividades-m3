/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tauladel6;

/**
 *
 * @author docto
 */
public class TaulaDel6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Definir el número per la taula de multiplicar
        int numero = 6;

        // Bucle per generar la taula del 6
        for (int i = 1; i <= 10; i++) {
            // Imprimir la línia amb el format desitjat
            System.out.println(numero + " × " + i + " = " + (numero * i));
        }
    }
    
}
