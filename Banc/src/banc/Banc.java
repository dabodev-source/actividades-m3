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
        
        /* Sucursal sucursal = new Sucursal();
        Compte[] comptes = sucursal.getComptes();
        for (Compte c : comptes) {
            System.out.println(c.titular.getNom());
        }*/
        
        /*
        Client client1 = new Client("11111111A", "Ana Mena");
        Compte compte1 = new Compte(client1, 1000);
        Compte compte2 = new Compte(client1, 500);

        System.out.println(compte1.mostrarSaldo());
        System.out.println(compte2.mostrarSaldo());

        compte1.transferir(compte2, 200);

        System.out.println(compte1.mostrarSaldo());
        System.out.println(compte2.mostrarSaldo());
        */
        
        Sucursal sucursal = new Sucursal();
         // Mostrem la informació dels comptes
        System.out.println("Informació de la Sucursal:");
        sucursal.mostrarInformacioComptes();
        
        System.out.println("\n");
        // Exemple de retirades i afegir interessos
        CompteCorrent cc = new CompteCorrent(500, new Client("Joan", "J12345678"), 1000);
        cc.retirar(1200);  // Hauria de funcionar amb el límit de descobert
        System.out.println(cc);

        CompteEstalvi ce = new CompteEstalvi(3.0, "ES450-004", new Client("Maria", "M98765432"), 1000, 1.5);
        ce.afegirInteres(); // Afegeix l'interès
        System.out.println(ce);
        
       /*
        Compte compte1 = new Compte();
        compte1.numero = "ES10 1093 1345 1256 9432";
        compte1.saldo = 32323;
        Client joanSants = new Client("111111111A","Joan Sants Ponts");
        compte1.titular = joanSants;//"Joan Sants Ponts";
        compte1.interesAnual = 1;
        
        Compte compte2 = new Compte("ES10 1111 1111 1111 2222",joanSants,1000,1);
        System.out.println(compte2.titular.getNom());
        System.out.println(compte2);
        
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
*/
    }
    
}
