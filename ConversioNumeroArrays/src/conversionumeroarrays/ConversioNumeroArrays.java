/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversionumeroarrays;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class ConversioNumeroArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String [] mesos = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        
        try{
            Scanner teclat = new Scanner(System.in);
            System.out.println("Entra un numero de mes");
            int numero = teclat.nextInt();
            System.out.println(mesos[numero-1]);
        } catch (Exception e){
            System.out.println("Número no vàlid"); 
        }
        
        
    }
    
}
