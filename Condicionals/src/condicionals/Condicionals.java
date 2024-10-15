/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package condicionals;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class Condicionals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // int a;
       // double b;
        
       // boolean plou; // true false
        //plou = true;
        //plou = false;
        
        // a = 10;
         //System.out.println(a<=10); // >< <= >=
         //System.out.println(plou);
        // System.out.println(a==10); // Cuando pones dos iguales es que estas comparando
         
         //Es fa un descompte del 10%.
             final double DESCOMPTE = 10;
            //Es fa descompte per compres d’un mínim de 100 euros.
             final double COMPRA_MIN = 100;
             
             Scanner lector = new Scanner(System.in);
             
             System.out.print("Quin és el preu del producte, en euros? ");
             double preu = lector.nextDouble();  
             System.out.print("Quuantes unitats has comprat? ");
             double unitats = lector.nextDouble();  
             
             double total = preu * unitats;
             if (total >= COMPRA_MIN) {              
                 double descompteFet = total * DESCOMPTE / 100;
                 total=total-descompteFet;
             }      
             System.out.println("El preu final per pagar és de " + total + " euros.");
    }
    
}
