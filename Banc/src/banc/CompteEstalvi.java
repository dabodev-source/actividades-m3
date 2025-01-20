/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banc;

/**
 *
 * @author docto
 */
public class CompteEstalvi extends Compte {
    private double tipusInteres;

    // Constructor amb par�metres
    public CompteEstalvi(double tipusInteres, String numero, Client titular, double saldo, double interesAnual) {
        super(numero, titular, saldo, interesAnual);
        this.tipusInteres = tipusInteres;
    }

    // Getter i Setter per al tipus d'inter�s
    public double getTipusInteres() {
        return tipusInteres;
    }

    public void setTipusInteres(double tipusInteres) {
        this.tipusInteres = tipusInteres;
    }

    // M�tode per afegir l'inter�s sobre el saldo
    public void afegirInteres() {
        double interes = saldo * tipusInteres / 100;
        saldo += interes;
        System.out.println("S'ha afegit l'inter�s: " + interes + " euros al compte d'estalvi.");
    }
    
}
