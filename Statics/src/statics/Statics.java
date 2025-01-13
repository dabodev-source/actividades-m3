/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package statics;

/**
 *
 * @author docto
 */
public class Statics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Utilitats u = new Utilitats();
        
        int res = Utilitats.sumar(10, 30);
        System.out.println(res);
        Math.sqrt(49);
        
        int a = Integer.MIN_VALUE;
        
        Comptador c1 = new Comptador();
        Comptador c2 = new Comptador();
        Comptador c3 = new Comptador();
        //Comptador c4 = new Comptador();
        
         // Accés a l'atribut static sense instància
        System.out.println("S'han creat " + Comptador.numObjectes + " objectes."); 
        // Sortida: S'han creat 3 objectes.
    }
    
}
