/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recepcio;

/**
 *
 * @author docto
 */
public class Hotel {
   private String nom; //el nom de l'hotel
   private String localitzacio; //la ciutat o regió on es troba
   private int nombreHabitacions; //el nombre total d'habitacions disponibles
   private int habitacionsOcupades; //el nombre d'habitacions actualment ocupades
   private double preuPerNit; //el preu per nit d'una habitació
   private int estrelles; //nombre d'estrelles de l'hotel (valor entre 1 i 5)

    public Hotel(String nom, String localitzacio, int nombreHabitacions, int habitacionsOcupades, double preuPerNit, int estrelles) {
        this.nom = nom;
        this.localitzacio = localitzacio;
        this.nombreHabitacions = nombreHabitacions;
        this.habitacionsOcupades = habitacionsOcupades;
        this.preuPerNit = preuPerNit;
        setEstrelles(estrelles);
    }
    
     // Mètodes
    public double calculaIngressos() {
        return habitacionsOcupades * preuPerNit;
    }

    public void reservaHabitacio() {
        if (habitacionsOcupades < nombreHabitacions) {
            habitacionsOcupades++;
            System.out.println("Habitació reservada!");
        } else {
            System.out.println("No hi ha habitacions disponibles.");
        }
    }

    public void alliberaHabitacio() {
        if (habitacionsOcupades > 0) {
            habitacionsOcupades--;
            System.out.println("Habitació alliberada!");
        } else {
            System.out.println("No hi ha habitacions ocupades per alliberar.");
        }
    }

    public int disponibilitat() {
        return nombreHabitacions - habitacionsOcupades;
    }

    public void mostraEstrelles() {
        if (estrelles >= 1 && estrelles <= 5) {
            for (int i = 0; i < estrelles; i++) {
                System.out.print("*");
            }
            System.out.println();
        } else {
            System.out.println("Nombre d'estrelles no vàlid.");
        }
    }

    // Setters i Getters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getLocalitzacio() {
        return localitzacio;
    }

    public void setLocalitzacio(String localitzacio) {
        this.localitzacio = localitzacio;
    }

    public int getNombreHabitacions() {
        return nombreHabitacions;
    }

    public void setNombreHabitacions(int nombreHabitacions) {
        this.nombreHabitacions = nombreHabitacions;
    }

    
    public int getHabitacionsOcupades() {
        return habitacionsOcupades;
    }

    public void setHabitacionsOcupades(int habitacionsOcupades) {
        this.habitacionsOcupades = habitacionsOcupades;
    }

    public double getPreuPerNit() {
        return preuPerNit;
    }

    public void setPreuPerNit(double preuPerNit) {
        this.preuPerNit = preuPerNit;
    }

    public int getEstrelles() {
        return estrelles;
    }
 
    public void setEstrelles(int estrelles) {
        if (estrelles >= 1 && estrelles <= 5) {
            this.estrelles = estrelles;
        } else {
            System.out.println("Nombre d'estrelles no vàlid. Ha de ser entre 1 i 5.");
        }
    }
    
}
