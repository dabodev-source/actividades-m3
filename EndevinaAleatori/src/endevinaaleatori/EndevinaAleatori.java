/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package endevinaaleatori;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author docto
 */
public class EndevinaAleatori {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclat = new Scanner(System.in);
        Random generador = new Random();
        
        int num = generador.nextInt(1,10);
        System.out.println("Endevina el numero que he pensat (Esta entre el 1 i el 10!)" +num);
        int num2 = teclat.nextInt();
        
        if (num == num2) {
            System.out.println("Felicitacions ha acertat!!!");
        } else{
            System.out.println("Ho sento, havia generat el numero "+num);
        }
    }
    
}
