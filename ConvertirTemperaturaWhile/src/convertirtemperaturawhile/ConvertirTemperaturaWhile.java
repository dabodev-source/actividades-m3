/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package convertirtemperaturawhile;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class ConvertirTemperaturaWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner hola = new Scanner(System.in);
        
        int i = 0;
        while(i<5) {
            System.out.println("Entra temperatura en graus en Farenheit");
            double temperatureF = hola.nextDouble();
            double tempcel =  ((temperatureF -32)*5)/9;
            
            System.out.println("En celsius és: " + tempcel);
            
            i++;
        }
        System.out.println("Adeu");
    }
    
}
