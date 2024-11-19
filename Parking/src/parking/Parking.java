/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parking;

/**
 *
 * @author docto
 */
public class Parking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehicle v = new Vehicle();
        
        //v.any = 1997;
        v.marca = "";
        v.model = "";
        v.preu = 657;
        
        Vehicle v2 = new Vehicle("Audi","RS4",2020,5000);
        System.out.println(v2.getMarca());
        
        v2.setMarca("Chervolet");
        System.out.println(v2.marca);
        System.out.println(v2.getMarca());
        
        //v2.any = -1000;
        try {
          v2.setAny(-1000);
          System.out.println(v2.getAny());
        }
        catch(Exception e){
            System.out.println("Error en l'any");
        }
        
        
        
        
    }
    
}
