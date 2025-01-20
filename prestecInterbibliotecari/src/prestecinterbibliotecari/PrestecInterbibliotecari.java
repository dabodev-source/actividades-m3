/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prestecinterbibliotecari;

import java.util.ArrayList;

/**
 *
 * @author docto
 */
public class PrestecInterbibliotecari {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Biblioteca b1 = new Biblioteca("Privada","Priorat 5, Tarragona");
        Biblioteca b2 = new Biblioteca("Privada","Priorat 5, Tarragona");
        Biblioteca b3 = b1;
        System.out.println(b1.equals(b2)); //false 
        System.out.println(b1.equals(b3)); //true
        
        ArrayList<Biblioteca> biblioteques = new ArrayList();
        biblioteques.add(new Biblioteca("Pública ","Priorat 4, Tarragona"));
        biblioteques.add(new Biblioteca("Privada ","Priorat 5, Tarragona"));
        biblioteques.add(new Biblioteca("Mixta ","Priorat 6, Tarragona"));
        
        for (Biblioteca biblio: biblioteques) {
            System.out.println(biblio);
        }
        
        Biblioteca bEsborrar = new Biblioteca ("Privada","Priorat 5, Tarragona");
        biblioteques.remove(bEsborrar);
        for (Biblioteca biblio: biblioteques) {
            System.out.println(biblio);
        }
        
        
        System.out.println(biblioteques.get(1));
        
        System.out.println("");
        //biblioteques.remove(0); // Esborrar passan referencia
        String nomEsborrar = "Privada";
        int i = 0;
        boolean trobat = false;
        while (trobat==false && i< biblioteques.size()) {
            if(biblioteques.get(i).equals(nomEsborrar)) {
               //biblioteques.remove(i);
               biblioteques.remove(biblioteques.get(i));
               trobat = true;
            }
            i++;
            
        }
        
       
       int pos = biblioteques.indexOf(1);
        System.out.println("Posicio = " +pos);

    }
    
}
