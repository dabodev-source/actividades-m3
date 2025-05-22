/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package elsjocdelsdaus;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author docto
 */
public class ElsJocDelsDaus {

    /**
     * @param args the command line arguments
     */
    private static final int NUM_CARES_DAU = 6;
    private static final int NUM_TIRADES = 5;
    private static final int NUM_MAX_JUGADES = 5;
   
    public static void main(String[] args) {
        // TODO code application logic here  
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introdueix el nombre de jugadors: ");
        int numJugadors = scanner.nextInt();
        
        ArrayList<Jugador> jugadors = new ArrayList<>();
        for (int i = 0; i < numJugadors; i++) {
            jugadors.add(new Jugador());
        }
        
        Dau dau = new Dau(NUM_CARES_DAU);
        
        for (int ronda = 1; ronda <= NUM_MAX_JUGADES && jugadors.size() > 1; ronda++) {
            System.out.println("--- Ronda " + ronda + " ---");
            Iterator<Jugador> iterator = jugadors.iterator();
            while (iterator.hasNext()) {
                Jugador jugador = iterator.next();
                if (jugador.isEliminat()) continue;
                
                Jugada jugada = new Jugada(dau, NUM_TIRADES);
                System.out.println(jugador.getNom() + ": " + jugada);
                
                if (jugada.esGuanyadorDirecte()) {
                    System.out.println(jugador.getNom() + " guanya directament!");
                    return;
                }
                
                if (jugada.mortDirecta()) {
                    System.out.println(jugador.getNom() + " ha estat eliminat per mort directa.");
                    jugador.eliminar();
                } else {
                    jugador.afegirPunts(jugada.obtenirPuntacio());
                }
            }
            
            jugadors.removeIf(Jugador::isEliminat);
            if (jugadors.size() == 1) {
                System.out.println(jugadors.get(0).getNom() + " guanya automàticament perquè és l'últim jugador restant!");
                return;
            }
        }
        
        System.out.println("Fi del joc. Guanyador(s): " + obtenirGuanyador(jugadors));
    }
    
    private static String obtenirGuanyador(ArrayList<Jugador> jugadors) {
        int maxPunts = 0;
        StringBuilder guanyadors = new StringBuilder();
        
        for (Jugador jugador : jugadors) {
            if (jugador.getPunts() > maxPunts) {
                maxPunts = jugador.getPunts();
                guanyadors = new StringBuilder(jugador.getNom());
            } else if (jugador.getPunts() == maxPunts) {
                guanyadors.append(", ").append(jugador.getNom());
            }
        }
        
        return guanyadors.toString();
    }
    
    
}
