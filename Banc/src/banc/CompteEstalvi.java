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

    public double getTipusInteres() {
        return tipusInteres;
    }

    public void setTipusInteres(double tipusInteres) {
        this.tipusInteres = tipusInteres;
    }

    public CompteEstalvi(double tipusInteres, String numero, Client titular, double saldo, double interesAnual) {
        super(numero, titular, saldo, interesAnual);
        this.tipusInteres = tipusInteres;
    }
    
    public void afegirInteres(){
        
    }
    
}
