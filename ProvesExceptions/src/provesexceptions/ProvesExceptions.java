/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package provesexceptions;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class ProvesExceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Introdueix un número enter: ");
            int numero = scanner.nextInt(); // Això llençarà una excepció si no és un enter
            System.out.println("Has introduït el número: " + numero);
        } catch (Exception e) {
            System.out.println("Error: Si us plau, introdueix un número enter vàlid.");
            //System.out.println(e.getMessage());
        }
    }
    }
    
