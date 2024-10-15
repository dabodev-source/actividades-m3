/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aleatoris;

import java.util.Random;

/**
 *
 * @author docto
 */
public class Aleatoris {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random generador = new Random();
        
        double num = generador.nextDouble(4,10);
        System.out.println(num);
        
        double num2 = generador.nextDouble(4,11);
        System.out.println(num2);
    }
    
}
