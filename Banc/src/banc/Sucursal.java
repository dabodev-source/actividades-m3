/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banc;

import java.util.ArrayList;

/**
 *
 * @author docto
 */
public class Sucursal extends Compte{
    /*
    private Compte[] comptes = new Compte[6];

    public Sucursal() {

        Client client1 = new Client("11111111A", "Ana Mena");
        Client client2 = new Client("22222222B", "Lidia Tomey");
        Client client3 = new Client("33333333C", "David Serrano");

        comptes[0] = new Compte(client1, 1000);
        comptes[1] = new Compte(client1, 2000);
        comptes[2] = new Compte(client2, 3000);
        comptes[3] = new Compte(client2, 2000);
        comptes[4] = new Compte(client3, 5000);
        comptes[5] = new Compte(client3, 6000);
    }

    public Compte[] getComptes() {
        return comptes;
    }
    
    void mostrarInformacioComptes(){
        System.out.println(getComptes());
    }*/
    
    private ArrayList<Compte> comptes;

    // Constructor: Inicialitza l'array amb 6 comptes (3 clients)
    public Sucursal() {
        comptes = new ArrayList<>();
        
        // Afegim comptes corrents i d'estalvi per a cada client
        comptes.add(new CompteCorrent(500, new Client("Client 1", "12345"), 1000));
        comptes.add(new CompteEstalvi(2.5, "ES450-001", new Client("Client 1", "12345"), 1500, 1.5));
        
        comptes.add(new CompteCorrent(1000, new Client("Client 2", "67890"), 2000));
        comptes.add(new CompteEstalvi(3.0, "ES450-002", new Client("Client 2", "67890"), 2500, 1.5));
        
        comptes.add(new CompteCorrent(1500, new Client("Client 3", "11223"), 3000));
        comptes.add(new CompteEstalvi(1.5, "ES450-003", new Client("Client 3", "11223"), 3500, 1.5));
    }

    // Mètode per mostrar la informació de tots els comptes
    public void mostrarInformacioComptes() {
        for (Compte compte : comptes) {
            System.out.println(compte);
        }
    }
}
