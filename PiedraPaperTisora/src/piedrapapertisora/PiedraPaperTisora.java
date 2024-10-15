/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package piedrapapertisora;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author docto
 */
public class PiedraPaperTisora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclat = new Scanner(System.in);
        Random generador = new Random();
        
        // Generarmos un numero aleatoria por ordenador (0: pedra, 1: paper, 2:tisora)
        int ordinador = generador.nextInt(3);
        
        //Pedimos al usuario que entre su eleccion (pedra, peper, tisora)
        System.out.println("Entra pedra, paper o tisora:");
        String usuario = teclat.nextLine().toLowerCase(); //Convertir a minusculas para evitar problemas de comparacion
        
        //Determinamos la elecion del ordinador
        
        String eleccioOrdinador = "";
        
        switch(ordinador){
            case 0:
               eleccioOrdinador = "pedra";
                break;
            case 1:
                eleccioOrdinador = "paper";
                break;
            case 2:
                eleccioOrdinador = "tisora";
                break;
        }
        //Mostrarmos la elecion del ordenador
        System.out.println("Ordinador ha tret: " +eleccioOrdinador);
        
        switch(usuario){
            case "pedra":
                if (ordinador == 0){
                    System.out.println("Heu empatat!!");
                } else if (ordinador == 1){
                    System.out.println("Has perdut!! El papaer embolica la pedra");
                } else {
                    System.out.println("Has guanyat!! La pedra esclafa les tisores");
                }
                break;
            case "paper":
                if (ordinador == 0){
                    System.out.println("Has guanyat!! El paper embolica la pedra");
                } else if (ordinador == 1){
                    System.out.println("Heu empatat!!");
                } else {
                    System.out.println("Has perdut!! Les tisores tallen el paper");
                }
                break;
                
            case "tisora":
                if (ordinador == 0){
                    System.out.println("Has perdut!! La pedra esclafa les tisores");
                } else if (ordinador == 1){
                    System.out.println("Has guanyat!! Les tisores tallen el paper");
                } else {
                    System.out.println("Heu empatat!!");
                }
                break;
            default:
                System.out.println("Opcio no vàlida!!! Has d'introduir 'pedra', 'paper' o 'tisora'.");
        }
    }
    
}
