/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculnotamitjanamajormenor;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class CalculNotaMitjanaMajorMenor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclat = new Scanner(System.in);
        // Introduir el número d'alumnes
        System.out.println("Introdueix el nombre d'alumnes: ");
        int numAlumnes = teclat.nextInt();
        
         // Variables per acumular la suma de les notes, la nota més gran i la més petita
        double suma = 0;
        double notaMaxima = 0;
        double notaMin = 0;
        
        for (int i = 1; i <= numAlumnes; i++) {
            System.out.print("Introdueix la nota de l'alumne " + i + ": ");
            double nota = teclat.nextDouble();
            suma += nota; 
            //La primera nota introduïda es guarda com a nota màxima i mínima
            if (i == 1) {
                notaMaxima = nota;
                notaMin = nota;
            }
            
            if(nota > notaMaxima) {
                notaMaxima = nota;
            }
            if (nota < notaMin) {
                notaMin = nota;
            }
        }
        
         // Calcular la mitjana dividint la suma entre el nombre d'alumnes
        double mitjana = suma / numAlumnes;

        //  Mostrar la mitjana per pantalla
        System.out.println("La nota mitjana de la classe és: " + mitjana);
        System.out.println("La nota Major es: " + notaMaxima);
        System.out.println("La nota Minima es: " + notaMin);
        
    }
    
}
