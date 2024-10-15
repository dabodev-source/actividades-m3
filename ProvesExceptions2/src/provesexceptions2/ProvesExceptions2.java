/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package provesexceptions2;

/**
 *
 * @author docto
 */
public class ProvesExceptions2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dividend = 10;
        int divisor = 0;

        try {
            int resultat = dividend / divisor; // Això provocarà una excepció
            System.out.println("Resultat: " + resultat);
        } catch (ArithmeticException e) {
            System.out.println("Error: No es pot dividir per zero.");
        }
    }
    
}
