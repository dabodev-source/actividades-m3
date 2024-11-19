/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package persones;

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
        Persona persona1 = new Persona("David ", 15 , 1.75 , 80 , " home " ,"España");
        Persona persona2 = new Persona("Arturo ", 17 , 1.90 , 60 , " home " , "Francés");
        Persona persona3 = new Persona("Andrea " , 25 , 1.50 , 70 , " Dona " , "Italià");
          
        System.out.println(persona1.obtenirDescripcio());
        System.out.println(persona2.obtenirDescripcio());
        System.out.println(persona3.obtenirDescripcio());
        
        System.out.println(persona1.calcularIMC());
        System.out.println(persona2.calcularIMC());
        System.out.println(persona3.calcularIMC());
        
        System.out.println(persona1.esMajorDEdat());
        System.out.println(persona2.esMajorDEdat());
        System.out.println(persona3.esMajorDEdat());
        
        System.out.println(persona1.tePesSaludable());
        System.out.println(persona2.tePesSaludable());
        System.out.println(persona3.tePesSaludable());
        
        System.out.println(persona1.calcularFreqMaximaCardiaca());
        System.out.println(persona2.calcularFreqMaximaCardiaca());
        System.out.println(persona3.calcularFreqMaximaCardiaca());
        
        System.out.println(persona1.convertirAlturaAcentimetres());
        System.out.println(persona2.convertirAlturaAcentimetres());
        System.out.println(persona3.convertirAlturaAcentimetres());
        
        System.out.println(persona1.celebrarAniversari());
        System.out.println(persona2.celebrarAniversari());
        System.out.println(persona3.celebrarAniversari());
            
    }
    
}