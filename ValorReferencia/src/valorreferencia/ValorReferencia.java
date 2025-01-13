/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package valorreferencia;

/**
 *
 * @author docto
 */
public class ValorReferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b;
        
        // El nombre que hay despues de Persona "Joan" son referencies
        Persona joan = new Persona();
        Persona iker;
        joan.dni = "123456789Q";
        joan.nom = "Joan Gracia Moreno";
        
        iker = joan;
        
        System.out.println(iker.nom);
        
        a = 10;
        b = a;
        
        Persona sergi = new Persona();
        sergi.nom = "Sergi Mas Pes";
        
        //sergi = joan;
        
        //System.out.println(sergi.nom);
        
        //String y arrays son clases
        
        joan.metode1(a, sergi);
        System.out.println(a + " " + sergi.nom);
        
        int [] llista = new int [3];
        llista[0] = 1; llista[1] = 2; llista[2] = 3;
        
        int[] numeros;
        numeros = llista;
        numeros[2] = 1000000;
        joan.metode2(llista);
        
        
    }
    
}
