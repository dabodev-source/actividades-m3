/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calcular.sou;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class CalcularSou {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclat = new Scanner(System.in);

        // Llegir el sou i els anys d'antiguitat
        System.out.print("Introdueix el sou de l'operari: ");
        double sou = teclat.nextDouble();
        
        System.out.print("Introdueix els anys d'antiguitat de l'operari: ");
        int antiguitat = teclat.nextInt();

        // Comprovar les condicions per aplicar els augments o no
        if (sou < 500) {
            if (antiguitat >= 10) {
                // Augment del 20% per antiguitat igual o superior a 10 anys
                sou = sou * 1.20;
                System.out.println("Se li ha atorgat un augment del 20%. El nou sou és: " + sou + "€.");
            } else {
                // Augment del 5% per antiguitat menor a 10 anys
                sou = sou * 1.05;
                System.out.println("Se li ha atorgat un augment del 5%. El nou sou és: " + sou + "€.");
            }
        } else {
            // Si el sou és 500 o més, no es canvia
            System.out.println("El sou és de " + sou + "€. No se li atorga cap augment.");
        }
    }
    
}
