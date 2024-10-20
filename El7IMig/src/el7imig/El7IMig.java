/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package el7imig;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author docto
 */
public class El7IMig {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclat = new Scanner(System.in);
        Random generador = new Random();
        
        int numeroGenerat =  generador.nextInt(1,10);
        int numeroUsuari;
        char continuar ='s';
        
        System.out.println("Fes una aposta");
        numeroUsuari = teclat.nextInt();
        
        System.out.println(numeroGenerat);
        
        String carta;
        switch (numeroGenerat) {
            case 8:
                carta = "Sota";
                break;
            case 9:
                carta = "Cavall";
                break;
            case 10:
                carta = "Rei";
                break;
            default:
                carta = Integer.toString(numeroGenerat); // Si és entre 1 i 7, mostra el número
                break;
        }
        System.out.println("L'ordinador ha generat la carta: " + carta);
        System.out.print("Vols continuar (s/n)?");
        continuar=teclat.next().charAt(0);
    }
    
}
