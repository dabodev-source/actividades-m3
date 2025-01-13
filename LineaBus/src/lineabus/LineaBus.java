/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lineabus;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class LineaBus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Llistes de poblacions i distàncies
        String[] poblacions = {"Tarragona", "Altafulla", "Torredembarra", "Creixell", "Roda de Barà", "El Vendrell"};
        int[] distancies = {14, 3, 8, 5, 10}; // Distàncies entre poblacions consecutives
        double preuPerKm = 0.08; // Preu per km

        Scanner scanner = new Scanner(System.in);

        // Mostrar poblacions
        System.out.println("Poblacions disponibles:");
        for (int i = 0; i < poblacions.length; i++) {
            System.out.printf("%d. %s%n", i + 1, poblacions[i]);
        }

        // Entrada d'origen i destinació
        System.out.print("\nOrigen (número): ");
        int origen = scanner.nextInt() - 1; // Ajustem l'índex a 0-based
        System.out.print("Destinació (número): ");
        int destinacio = scanner.nextInt() - 1;

        // Comprovació d'entrada vàlida
        if (origen < 0 || origen >= poblacions.length || destinacio < 0 || destinacio >= poblacions.length) {
            System.out.println("Origen o destinació no vàlids.");
            return;
        }

        // Calcular distància
        int distanciaTotal = 0;
        if (origen < destinacio) {
            for (int i = origen; i < destinacio; i++) {
                distanciaTotal += distancies[i];
            }
        } else {
            for (int i = origen - 1; i >= destinacio; i--) {
                distanciaTotal += distancies[i];
            }
        }

        // Preguntar si és d'anada/tornada
        System.out.print("Anada/Tornada (s/n): ");
        char anadaTornada = scanner.next().toLowerCase().charAt(0);
        boolean esAnadaTornada = (anadaTornada == 's');

        // Calcular preu
        double preu = distanciaTotal * preuPerKm;
        double descompte = 0;
        if (esAnadaTornada) {
            descompte = preu * 0.05;
            preu -= descompte;
        }

        // Mostrar resultat
        System.out.println("\nFactura:");
        System.out.println("Origen: " + poblacions[origen]);
        System.out.println("Destí: " + poblacions[destinacio]);
        System.out.println("Km: " + distanciaTotal);
        System.out.println("A/T: " + (esAnadaTornada ? "Sí" : "No"));
        System.out.println("Descompte: " + (esAnadaTornada ? "5%" : "0%"));
        System.out.println("Preu: " + preu + " euros");
    }
    
}
