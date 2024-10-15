/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basics;

/**
 *
 * @author docto
 */
public class Basics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int iva, edad = 23, any_actual;
        double preu;
        
        System.out.println("Tinc"+ edad + "anys");
        
        iva = 27;
        edad = 17;
        any_actual = 2024;
        preu = 17.5;
        
        System.out.println("Tinc"+ edad + "anys");
        System.out.println(preu*2);
        System.out.println(edad/2);
        System.out.println(edad%3);
        System.out.println(edad-2);
        
        preu = edad *2;
        System.out.println("El nou preu és"+ preu);
        edad = edad + 1;
        System.out.println("La nova edad és "+ edad);
    }
    
}
