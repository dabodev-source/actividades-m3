/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraynumeromaximiminims;

import java.util.Random;

/**
 *
 * @author docto
 */
public class ArrayNumeroMaximIMinims {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Escriu un programa que generi 25 números aleatoris i després mostri els números introduïts juntament amb les paraules "màxim" i "mímim" al costat del màxim i el mínim respectivament
        int[] vector = new int[10]; 
        Random random = new Random();

        // Generar valors aleatoris i omplir l'array
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(50) + 1; // Nombres entre 1 i 50
        }
       int maxim = vector[0];
       int minim = vector[0];
       
        for(int num : vector) {
              if (num > maxim) {
                 maxim = num; 
              }
              if (num<minim) {
                  minim = num;
              }
        }
      
        System.out.println("Els valors del vector són:");
        for (int num : vector) {
            if (num == maxim) {
                System.out.println(num + " Màxim");
            } else if (num == minim) {
                System.out.println(num + " Mínim");
            } else {
                System.out.println(num);
            }
        }
      
    }
    
}
