/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banc;

/**
 *
 * @author docto
 */
public class Compte {
    private static final String prefixNumeroCompte = "ES450-";
    private static int comptadorComptes = 1;

    private String numero; // Número del compte
    Client titular; // Titular del compte
    double saldo; // Saldo actual del compte
    double interesAnual; // Percentatge d'interès anual
    

    public Compte(Client titular, double saldoInicial) {
        this.numero = prefixNumeroCompte + comptadorComptes++;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public Compte(String numero, Client titular, double saldo, double interesAnual) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.interesAnual = interesAnual;
    }

    public Compte() {
    }

    public void transferir(Compte altreCompte, double quantitat) {
        if (saldo >= quantitat) {
            saldo -= quantitat;
            altreCompte.saldo += quantitat;
            System.out.println("Transferència de " + quantitat + " euros realitzada amb èxit a " + altreCompte.numero);
        } else {
            System.out.println("Saldo insuficient per fer la transferència.");
        }
    }

    void calculaInteresAnual() {
        saldo += saldo * interesAnual / 100;
    }

    void ingresar(double quantitat) {
        saldo += quantitat;
    }

    boolean retirar(double quantitat) {
        if (saldo >= quantitat) {
            saldo -= quantitat;
            System.out.println("Has retirat " + quantitat + " euros");
            return true;
        } else {
            System.out.println("Saldo insuficient");
            return false;
        }
    }
    
    String mostrarSaldo() {
        return "En el teu compte " + numero + " el saldo és de  " + saldo;
    }

    @Override
    public String toString() {
        return "Compte{" + "numero=" + numero + ", titular=" + titular + ", saldo=" + saldo + ", interesAnual=" + interesAnual + '}';
    }
    
    
}
