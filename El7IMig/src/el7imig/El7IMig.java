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

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        Random random = new Random();
        
        // Aposta inicial
        System.out.print("Introdueix la quantitat d'euros que vols apostar: ");
        double aposta = teclat.nextDouble();
        
        double puntuacioJugador = 0;
        boolean planta = false;
        String resultat = null;

        System.out.println("Comença el joc!");

        // Bucle principal del joc
        while (puntuacioJugador <= 7.5 && !planta) {
            // Generar una carta de l'1 al 10
            int carta = random.nextInt(10) + 1;

            // Assignar el valor de la carta (de l'1 al 7 és el valor del número, sota, cavall i rei són 0.5)
            double valorCarta = (carta <= 7) ? carta : 0.5;
            puntuacioJugador += valorCarta;

            // Mostrar la carta extreta
            System.out.println("Has tret una carta amb valor de: " + valorCarta);
            System.out.println("La teva puntuació actual és: " + puntuacioJugador);

            // Comprovar si ha arribat a 7.5 exactament
            if (puntuacioJugador == 7.5) {
                resultat = "Has Guanyat " + (2 * aposta) + " euros!";
                planta = true; // El jugador guanya i el joc s'acaba
            } else if (puntuacioJugador > 7.5) {
                resultat = "Has Perdut!!!!";
                planta = true; // El jugador perd i el joc s'acaba
            } else {
                // Preguntar si el jugador vol una altra carta o es planta
                System.out.print("Vols una altra carta? (s per sí, n per no): ");
                String resposta = teclat.next();
                
                if (resposta.equalsIgnoreCase("n")) {
                    planta = true;
                    resultat = "El jugador es planta!!!";
                } else {
                    resultat = null;
                }
            }
        }

        // Mostrar el resultat final
        if (resultat != null) {
            System.out.println(resultat);
        } else {
            System.out.println("La partida ha finalitzat.");
        }
    }
}

