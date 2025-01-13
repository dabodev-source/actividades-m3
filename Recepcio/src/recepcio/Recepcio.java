/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recepcio;

/**
 *
 * @author docto
 */
public class Recepcio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Hotel h = new Hotel("Hotel Mediterrani", "Barcelona", 100, 20, 120.0, 4);
        
        //h.nom = "Hotel Mediterrani";
        //h.localitzacio = "Barcelona";
        //h.nombreHabitacions = 100;
        //h.habitacionsOcupades = 20;
        //h.preuPerNit = 120.0;
        //h.estrelles = 4;
        
        System.out.println("El nombre del hotel: " + h.getNom());
        System.out.println("La localitzación es: " + h.getLocalitzacio());
       
        // Mostra ingressos actuals
        System.out.println("Ingressos actuals: " + h.calculaIngressos() + "?");

        // Reservar una habitació
        h.reservaHabitacio();
        System.out.println("Habitacions disponibles: " + h.disponibilitat());

        // Alliberar una habitació
        h.alliberaHabitacio();
        System.out.println("Habitacions disponibles: " + h.disponibilitat());

        // Mostrar estrelles de l'hotel
        h.mostraEstrelles();
        
        Habitacio h1 = new Habitacio();
        
        h1.numeroHabitacio = 1;
        h1.tipus = TipusHabitacio.DOBLE;
        System.out.println(h1.tipus);
        
    }
    
}
