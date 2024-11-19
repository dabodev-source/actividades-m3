/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraydedataleatories;

import java.util.Random;

/**
 *
 * @author docto
 */
public class ArrayDedatAleatories {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random generator = new Random();
        int [] edad = new int [500];
        
        for (int i = 0; i < edad.length; i++) {
            System.out.println(edad[i] = generator.nextInt(0,80)); // Genera valors de 0 a 10
            
        }
    }
    
}
