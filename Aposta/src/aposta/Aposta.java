/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aposta;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author docto
 */
public class Aposta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Crea un programa que esculli dos nombres enters aleatoris A i B però no els mostri per pantalla encara. 
        Random generador = new Random();
        Scanner teclat = new Scanner(System.in);
         
        
        int a = generador.nextInt(1,10);
        int b = generador.nextInt(1,10);
        
      
        
        //El programa preguntarà per qui apostem, A o B (guanya el número més alt). 
        System.out.println("Apostes por A o B?");
        char aposta = teclat.next().toUpperCase().charAt(0);
        
        //Un cop l'usuari hagi introduït la seva aposta, el programa mostrarà el valor d'A i B, dirà si hem guanyat l'aposta (encertat el número més alt) o perdut-
        System.out.println("A treu un " + a + " i B treu un " + b);
        
        //Comprovar si l'usuari ha guanyat
        if (a > b && aposta == 'A'){
            System.out.println("HAS GUANYAT!!! A era el més alt.");
        }else if (b> a && aposta == 'B') {
            System.out.println("HAS GUANYAT!!! B era el més alt.");
        } else if (a == b){
            System.out.println("És un EMPAT!!! Tots dos números són iguals.");
        } else {
            System.out.println("HAS PERDUT!!!");
        }
           
    }
    
}
