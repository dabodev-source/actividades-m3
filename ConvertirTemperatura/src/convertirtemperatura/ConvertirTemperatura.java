/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package convertirtemperatura;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class ConvertirTemperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclat = new Scanner(System.in);
        double TemperatureC;
        // Entrar valor per teclat! 
        System.out.println("Entra la temperatura");
          
        // convertir temp graus Fahrenheit i els converteixi en graus Celcius.
        double temperatureF;
        temperatureF = teclat.nextDouble();
        TemperatureC = ((temperatureF -32)*5)/9;
        //TemperatureC = teclat.nextDouble();
        System.out.println(TemperatureC);
         //TemperatureC = ((temperatureF -32)*5)/9;
         
         while(TemperatureC <5) {
             System.out.println("La temperatura es" + TemperatureC);
             
             TemperatureC = TemperatureC + 1;
         }
    }
    
}
