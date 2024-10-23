/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package elsrectangles;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class ElsRectangles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclat = new Scanner(System.in);
        
        //Podemos reagrupar, si estan relacionadas entre si
        int costat11,costat12;
        int costat21,costat22;
        
        System.out.println("Entra el primer rectangle: ");
        costat11 = teclat.nextInt();
        System.out.println("Entra el primer rectangle: ");
        costat12 = teclat.nextInt();
        System.out.println("Entra el segon rectangle: ");
        costat21 = teclat.nextInt();
        System.out.println("Entra el segon rectangle: ");
        costat22 = teclat.nextInt();
             
        int area1 = costat11 * costat12;
        int area2 = costat21 * costat22;
        int perimetre2 = 2 * costat21 + 2 * costat22;
        int perimetre1 = 2 * costat11 + 2 * costat12;
       
        
        
        System.out.println("Area i perimetre primer rectangle " + perimetre1 + " " + area1);
        System.out.println("Area i perimetre segon rectangle " + perimetre2 + " " + area2) ;
                 
    }
    
}
