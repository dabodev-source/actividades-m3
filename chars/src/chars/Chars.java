/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chars;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class Chars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char lletra;
        // El char es de un unico caracter '
        lletra = 'A';
        Scanner teclat = new Scanner(System.in);
        System.out.println("Entra un lletra");
        // esto es para entrar por teclado
        lletra = teclat.next().charAt(0);
    }
    
}
