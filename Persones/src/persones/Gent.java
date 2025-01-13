/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package persones;

import java.time.LocalDate;

/**
 *
 * @author docto
 */
public class Gent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Persona persona1 = new Persona("David ", 15 , 1.75 , 80 , " home " ,"España");
        //Persona persona2 = new Persona("Arturo ", 17 , 1.90 , 60 , " home " , "Francés");
        //Persona persona3 = new Persona("Andrea " , 25 , 1.50 , 70 , " Dona " , "Italià");
          
        Persona persona1 = new Persona("David", 1.75, 70, "home", "Espanya", "15-05-1991","12345678Z");
       
        persona1.afegirTelefon("654321098", 1);
        persona1.afegirTelefon("678123456", 2);
        persona1.afegirTelefon("6872135478", 3);

        // Imprimim les dades
        System.out.println(persona1.obtenirDescripcio());
        System.out.println("DNI: " + persona1.getDNI());
        System.out.println("Telèfons:\n" + persona1.getNumeros());
        System.out.println("IMC: " + persona1.calcularIMC());
        System.out.println("És major d'edat: " + persona1.esMajorDEdat());
        System.out.println(persona1.celebrarAniversari());  
        
        
        System.out.println("\n");
        
        Persona persona2 = new Persona("Andrea", 1.50, 25, "dona", "Espanya", "15-05-1998", "48658A");
        persona2.afegirTelefon("654321098", 4);
        
        System.out.println(persona2.obtenirDescripcio());
        System.out.println("DNI: " + persona2.getDNI());
        System.out.println("Telèfons:\n" + persona2.getNumeros());
        System.out.println("IMC: " + persona2.calcularIMC());
        System.out.println("És major d'edat: " + persona2.esMajorDEdat());
        System.out.println(persona2.celebrarAniversari());  
    }
    
}