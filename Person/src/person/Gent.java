/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package person;

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
         // Crear tres persones
        Persona persona1 = new Persona("Anna", 25, 1.70, 60, "dona", "12/10/1998");
        Persona persona2 = new Persona("Joan", 17, 1.80, 75, "home", "05/03/2007");
        Persona persona3 = new Persona("Marta", 30, 1.65, 55, "dona", "23/07/1994");

        // Cridar m?todes per a cada persona
        System.out.println(persona1.obtenirDescripcio());
        System.out.println("IMC: " + persona1.calcularIMC());
        System.out.println("Major d'edat: " + persona1.esMajorDEdat());
        persona1.celebrarAniversari();
        System.out.println("Freq. Max. Card?aca: " + persona1.calcularFreqMaximaCardiaca());
        System.out.println("Altura en cm: " + persona1.convertirAlturaACentimetres());
        System.out.println("Pes saludable: " + persona1.tePesSaludable());
        
        System.out.println();

        System.out.println(persona2.obtenirDescripcio());
        System.out.println("IMC: " + persona2.calcularIMC());
        System.out.println("Major d'edat: " + persona2.esMajorDEdat());
        persona2.celebrarAniversari();
        System.out.println("Freq. Max. Card?aca: " + persona2.calcularFreqMaximaCardiaca());
        System.out.println("Altura en cm: " + persona2.convertirAlturaACentimetres());
        System.out.println("Pes saludable: " + persona2.tePesSaludable());

        System.out.println();

        System.out.println(persona3.obtenirDescripcio());
        System.out.println("IMC: " + persona3.calcularIMC());
        System.out.println("Major d'edat: " + persona3.esMajorDEdat());
        persona3.celebrarAniversari();
        System.out.println("Freq. Max. Card?aca: " + persona3.calcularFreqMaximaCardiaca());
        System.out.println("Altura en cm: " + persona3.convertirAlturaACentimetres());
        System.out.println("Pes saludable: " + persona3.tePesSaludable());
    }
}

