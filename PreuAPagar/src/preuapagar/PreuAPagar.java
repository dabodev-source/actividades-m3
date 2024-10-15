/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package preuapagar;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class PreuAPagar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclat = new Scanner(System.in);
        int producte;
        int preuPerUnitat;
        int descompte;
        double resultat;
        
        
        System.out.println("Quants productes has comprat?");
        producte = teclat.nextInt();
        System.out.println("Quin es el preu de cada producte?");
        preuPerUnitat = teclat.nextInt();
        System.out.println("Quin descompte aplicarem (%)?");
        descompte = teclat.nextInt();
       
        // calcular los precios y el descuento
        int totalSenseDescompte = producte * preuPerUnitat;
        
        double descompteAplicat = totalSenseDescompte * descompte /100;
        resultat = totalSenseDescompte - descompteAplicat;
        System.out.println("El valor a pagar sera:" + resultat + "euros");
        
        
       
        
    }
    
}
