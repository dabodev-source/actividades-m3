/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadorabasica2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author docto
 */
public class CalculadoraBasica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclat = new Scanner(System.in);
        
        try {
             System.out.print("Introdueix un número enter: ");
             int numero = teclat.nextInt();
             System.out.print("Introdueix el atre numero: ");
             int numero2 = teclat.nextInt();
            System.out.println(numero + "+"+ numero2 + "=" +(numero+numero2));
            System.out.println(numero + "-"+ numero2 + "=" +(numero-numero2));
            System.out.println(numero + "*"+ numero2 + "=" + numero*numero2);
            System.out.println(numero + "/"+ numero2 + "=" + numero/numero2);
        } catch (InputMismatchException e) {
            System.out.println("Error: Si us plau, introdueix un número enter vàlid.");
        } catch (ArithmeticException e) {
            System.out.println("El segon operand és un zero!");
            System.out.println(e.getMessage());
        }
    }
    
}
