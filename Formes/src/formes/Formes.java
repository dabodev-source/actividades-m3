/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package formes;

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
                  
   }
    
}
