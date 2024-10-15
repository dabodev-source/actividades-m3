/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package strings;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class Strings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola");
        
        String paraula = "hola";
        System.out.println(paraula);
        String frase = "Avui no plou";
        System.out.println(frase);
        String conjunt = "regd7he();";
        System.out.println(conjunt);
        System.out.println(paraula + frase);
        System.out.println(paraula.charAt(0));
        //length te calcula cuantas letras tiene la variable y los espacios que tiene
        System.out.println(paraula.length());
        
        String entrada;
        System.out.println("Entra un String:");
        Scanner teclat = new Scanner(System.in);
        // para guardar una palabra es next no nextInt, si pones solo next guarda lo primero antes del espacio pero si pones nextLine muestra todo
        entrada = teclat.nextLine();
        System.out.println(entrada);
        //if (entrada == "hola"){ // Asi no es crack
            
        //}
        
        if(entrada.equals("hola")) {
            System.out.println("Cadenes igual");
        }
        else{
            System.out.println("Cadenes diferents");
        }
    }
    
}
