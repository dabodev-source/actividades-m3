/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banc;

/**
 *
 * @author docto
 */
public class CompteCorrent extends Compte {
    private double limitDescobert;

    // Constructor
    public CompteCorrent(double limitDescobert, Client titular, double saldoInicial) {
        super(titular, saldoInicial);
        this.limitDescobert = limitDescobert;
    }

    // Constructor amb valors complets
    public CompteCorrent(double limitDescobert, String numero, Client titular, double saldo, double interesAnual) {
        super(numero, titular, saldo, interesAnual);
        this.limitDescobert = limitDescobert;
    }

    // Mètode per retirar fons, tenint en compte el límit de descobert
    @Override
    public boolean retirar(double quantitat) {
        if (quantitat > 0 && (saldo - quantitat) >= -limitDescobert) {
            saldo -= quantitat;
            System.out.println("Has retirat " + quantitat + " euros");
            return true;
        } else {
            System.out.println("Error: No pots retirar aquesta quantitat. Límit de descobert superat.");
            return false;
        }
    }

    // Getter per obtenir el límit de descobert
    public double getLimitDescobert() {
        return limitDescobert;
    }
   
}
