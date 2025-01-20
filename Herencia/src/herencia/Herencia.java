/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia;

/**
 *
 * @author docto
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Vehicle v = new Vehicle("Honda","civic");
        System.out.println(v.getMarca());
        v.soroll();
        
        Cotxe c = new Cotxe();
        c.setMarca("Ford");
        c.setModel("Fiesta");
        c.soroll();
        
        Cotxe c2 = new Cotxe();
        c2.setMarca("Peugeot");
        c2.setModel("Rifter");
        c2.soroll();
        
        
        Autobus a = new Autobus();
        a.setMarca("Mercedes");
        a.setModel("Citaro");
        a.setArticulat(true);
        a.soroll();
        
        Vehicle [] llista = new Vehicle[4];
        llista[0] = v;
        llista[1] = c;
        llista[2] = c2;
        llista[3] = a;
        
        // element guarda el array
        for (Vehicle element: llista) {
            System.out.println(element);
            if(element instanceof Autobus ) {
                System.out.println("Element és un autobus");
                Autobus auto = (Autobus)element;
                System.out.println(auto.isArticulat()); 
            }
        }
        
        
    }
    
}
