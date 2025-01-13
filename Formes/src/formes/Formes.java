/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package formes;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class Formes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      /*   //Primera versió
        Rectangle r1 = new Rectangle(4,5,"groc",8,9);
        Rectangle r2 = new Rectangle(2,3,"blau",7,2);
        Rectangle r3 = new Rectangle(9,7,"negre",5,6);
        */
        
        
        //Segona versió
        Rectangle [] llista = {
            new Rectangle(4,5, "groc"),
            new Rectangle(4,4,"vermell"),
            new Rectangle(9,10, "verd"),
            new Rectangle(3,4, "blau"),
            new Rectangle(2,6, "groc"),
            new Rectangle(1,5, "vermell"),
            new Rectangle(5,5, "verd"),
            new Rectangle(6,6, "vermell"),
            new Rectangle(8,8, "blau"),
            new Rectangle(2,5, "verd"),
                
        };

        
           
        for(int i=0; i<llista.length; i++) {
            llista[i].mostar();
            System.out.println("");
        }
       /* 
        Rectangle r1 = new Rectangle();
        r1.setCostat1(4);
        r1.setCostat2(5);
        r1.mostar();
        
        Rectangle r2 = new Rectangle(5,8);
        r2.mostar();
        
        Rectangle r3 = new Rectangle(12,3, "negre");
        r3.mostar();
        */
        Rectangle rectangle1 = new Rectangle(10,5,"groc",5,8);
        
        Rectangle rectangle2 = new Rectangle(3,3,"blau",12,3);
         
        rectangle1.mostar();
        System.out.println(" ");
        rectangle2.mostar();
        System.out.println("Llargada: " + rectangle1.getLlargada());
        System.out.println("Amplada: " + rectangle1.getAmplada());
        
        int a1 = rectangle1.area();
        int a2 = rectangle2.area();
        
        System.out.println(a1+ " " +a2);
         
        rectangle1.escalar(2);
        rectangle1.mostar();
        
        rectangle2.escalar(2);
        rectangle2.mostar();
        
        System.out.println("Llargada: " + rectangle1.getLlargada());
        System.out.println("Amplada: " + rectangle1.getAmplada());
        System.out.println("Llargada: " + rectangle2.getLlargada());
        System.out.println("Amplada: " + rectangle2.getAmplada());
        System.out.println("El perimetre es " + rectangle1.perimetre());
        System.out.println("El perimetre es " + rectangle2.perimetre());
             
        Scanner teclat = new Scanner(System.in);
        //Demana a l'usuari la posició d'un rectangle i que mostri les dades d'aquell rectangle.
        System.out.println("Quin rectangle vols mostrar");
        
        try {
            int posicio = teclat.nextInt();
            llista[posicio].mostar();
        } 
        catch(Exception e) {
            System.out.println("Posicio incorrecta");
                
                }
        //Demana a l'usuari un color i compta quants rectangles tenim d'aquell color.
        String color = teclat.next();
        int compt=0;
        for (int i=0; i< llista.length; i++) {
            if (llista[i].getColor().equals(color)) compt++;
        }
        System.out.println("Hi ha "+compt+" rectangles d'aquest color");
        
        //Demana a l'usuari una àrea i que mostri per pantalla el dibuix dels rectangles que tinguin una àrea superior a la demanada.
        int area = teclat.nextInt();
        for (Rectangle rect : llista) {
            if (rect.area() > area) rect.mostar();
        }
   }
    
}
