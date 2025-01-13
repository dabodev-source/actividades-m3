/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banc;

/**
 *
 * @author docto
 */
public class Sucursal extends Compte{
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
    }
}
