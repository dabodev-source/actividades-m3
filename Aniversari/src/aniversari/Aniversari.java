/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aniversari;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author docto
 */
public class Aniversari {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Obtenim la data actual
        LocalDate dataActual = LocalDate.now();
        int anyActual = dataActual.getYear();
        int mesActual = dataActual.getMonthValue();
        int diaAvui = dataActual.getDayOfMonth();

        // Mostrem la data actual (opcional)
        System.out.println("Data actual: " + diaAvui + "/" + mesActual + "/" + anyActual);
        
        // Crear un escàner per llegir les entrades
        Scanner teclat = new Scanner(System.in);
        
        // Entra el dia, el mes i l'any del teu aniversari
        System.out.print("Entra el dia del teu aniversari: ");
        int diaAniversari = teclat.nextInt();

        System.out.print("Entra el mes del teu aniversari: ");
        int mesAniversari = teclat.nextInt();

        System.out.print("Entra l'any del teu aniversari: ");
        int anyAniversari = teclat.nextInt();
        
        // Crear una data per al aniversari
        LocalDate dataAniversari = LocalDate.of(anyAniversari, mesAniversari, diaAniversari);
        
        // Calcular l'edat
        int edat = anyActual - anyAniversari;
        
        // Comprovar si ja ha passat el aniversari aquest any
        if (mesActual < mesAniversari || (mesActual == mesAniversari && diaAvui < diaAniversari)) {
            edat--; // Si el aniversari no ha passat encara, restem 1 any
        }
        
        // Mostrar la edat
        System.out.println("Tens " + edat + " anys!");
    }
    
}
