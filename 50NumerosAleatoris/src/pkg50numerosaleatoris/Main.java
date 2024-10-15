/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg50numerosaleatoris;

import java.util.Random;

/**
 *
 * @author docto
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random generador = new Random();
       int i = 0;
        while (i <50) {
            int num = generador.nextInt(1,16);
            System.out.println(num);
            i++;
        }
    }
    
}
