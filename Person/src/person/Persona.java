/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package person;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author docto
 */
public class Persona {
      // Atributs
    private String nom;
    private int edat;
    private double altura; // en metres
    private double pes; // en quilograms
    private String sexe;
    private LocalDate dataNaixement;

    // Constructor
    public Persona (String nom, int edat, double altura, double pes, String sexe, String dataNaixement) {
        this.nom = nom;
        this.edat = edat;
        this.altura = (altura > 0) ? altura : 0.0;
        this.pes = (pes > 0) ? pes : 0.0;
        this.sexe = sexe;
        this.dataNaixement = LocalDate.parse(dataNaixement, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    // Setters i getters amb validació
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setEdat(int edat) {
        if (edat > 0) {
            this.edat = edat;
        }
    }

    public int getEdat() {
        return edat;
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        } 
    }

    public double getAltura() {
        return altura;
    }

    public void setPes(double pes) {
        if (pes > 0) {
            this.pes = pes;
        }
    }

    public double getPes() {
        return pes;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getSexe() {
        return sexe;
    }

    public void setDataNaixement(String dataNaixement) {
        this.dataNaixement = LocalDate.parse(dataNaixement, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public LocalDate getDataNaixement() {
        return dataNaixement;
    }

    // Mètode 1: Calcular IMC
    public double calcularIMC() {
        return pes / (altura * altura);
    }

    // Mètode 2: Es major d'edat
    public boolean esMajorDEdat() {
        return edat >= 18;
    }

    // Mètode 3: Obtenir descripció
    public String obtenirDescripcio() {
        return "Nom: " + nom + ", Edat: " + edat + " anys, Altura: " + altura + " m, Pes: " + pes + " kg, Sexe: " + sexe + " Data: " + dataNaixement;
    }

    // Mètode 4: Celebrar aniversari
    public void celebrarAniversari() {
        edat++;
        System.out.println(nom + " celebra un any més! Ara té " + edat + " anys.");
    }

    // Mètode 5: Calcular freqüència màxima cardíaca
    public int calcularFreqMaximaCardiaca() {
        if (sexe.equalsIgnoreCase("home")) {
            return (int) (208 - (0.7 * edat));
        } else if (sexe.equalsIgnoreCase("dona")) {
            return (int) (206 - (0.88 * edat));
        }
        return 0;
    }

    // Mètode 6: Convertir altura a centímetres
    public double convertirAlturaACentimetres() {
        return altura * 100;
    }

    // Mètode 7: Té pes saludable
    public boolean tePesSaludable() {
        double imc = calcularIMC();
        return imc >= 18.5 && imc <= 24.9;
    }
}

