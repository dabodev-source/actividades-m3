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
    // Atributs 
   String numero; //el número del compte
   String titular; //el nom del titular del compte
   double saldo; //el saldo actual del compte
   double interesAnual; //el percentatge d'interès anual
    
        //calculaInteresAnual(): calcula i afegeix al saldo l'interès anual en funció del valor de interesAnual.
   
   void calculaInteresAnual() {
      saldo = saldo + saldo * interesAnual/100;
   }
   
   //ingressar(double quantitat): incrementa el saldo amb la quantitat especificada.
   
   void ingresar(double quantitat) {
       saldo = saldo + quantitat;
   }
        
        //retirar(double quantitat): disminueix el saldo amb la quantitat especificada si hi ha saldo suficient.
   
   boolean retirar(double quantitat) {
       if (saldo >= quantitat) {
       saldo = saldo - quantitat;
           System.out.println("Has retirat " + quantitat + " euros");
           return true;
       }
       else {
           System.out.println("Saldo insuficient");
           return false;
       }
   }
        //mostrarSaldo(): mostra per pantalla el saldo actual del compte.
   String mostrarSaldo() {
       return "En el teu compte " + numero + " el saldo és de  "+ saldo;
       //System.out.println("En el teu compte " + numero + " el saldo és de  "+ saldo);
   }
}
