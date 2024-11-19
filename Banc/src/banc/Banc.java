/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banc;

/**
 *
 * @author docto
 */
public class Banc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Compte compte1 = new Compte();
        compte1.numero = "ES10 1093 1345 1256 9432";
        compte1.saldo = 32323;
        compte1.titular = "Joan Sants Ponts";
        compte1.interesAnual = 1;
        
        System.out.println(compte1.saldo);
        compte1.calculaInteresAnual();
        System.out.println(compte1.saldo);
        
        compte1.ingresar(100);
        compte1.ingresar(200);
        System.out.println(compte1.saldo);
        
        boolean res = compte1.retirar(100);
        if(res==true) {
            System.out.println("Operaió ok.");
        }
        System.out.println(compte1.saldo);
        
        //compte1.mostrarSaldo();
        String missatge = compte1.mostrarSaldo();
        System.out.println(missatge);
        
        //res = compte1.retirar(978787878);
        if(compte1.retirar(978787878)) {
            System.out.println("Operació ok.");
        }
        System.out.println(compte1.mostrarSaldo()); 
    }
    
}
