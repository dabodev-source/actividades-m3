/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rectangle;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class Rectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclat  = new Scanner(System.in);
        //Hacemos los calculos del costatGran y el costatPetit
        int costatGran;
        int costatPetit;
               
        //Pedimos por telcado el costado grande
        System.out.println("Introdueix el valor del costat gran del rectangle");
        costatGran = teclat.nextInt();
        
        //Pedimos por telcado el costado pequeño
        System.out.println("Introdueix el valor del csotat petit del rectangle");
        costatPetit = teclat.nextInt();
        
        //Calculamos el perimetro y el area del rectangulo
        int perimetre = 2 * costatGran + 2 * costatPetit;
        int area = costatGran * costatPetit;
        
        System.out.println("Perimetre del rectangle = " + perimetre);
        System.out.println("Area del rectangle = " + area);
        
        
        
        
    }
    
}
