/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package endevinaaleatori2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author docto
 */
public class EndevinaAleatori2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclat = new Scanner(System.in);
        Random generador = new Random();
       
        System.out.println("Entra el valor inici: ");
        int a = teclat.nextInt();
        
        System.out.println("Entra el valor fi: ");
        int b = teclat.nextInt();
        
        // Comprovar que 'a' sigui menor que 'b'
        if (a >= b) {
            System.out.println("El valor d'inici ha de ser menor que el valor final.");
            return;
        }
        
        // Generar un número aleatori entre a i b
        int numeroGenerat = generador.nextInt(b - a + 1) + a;

        // Demanar a l'usuari que endevini el número
        System.out.print("Endevina el número que he pensat (està entre " + a + " i " + b + "!): ");
        int intentUsuari = teclat.nextInt();
        
        // Comprovar si l'usuari ha encertat o no
        if (intentUsuari == numeroGenerat) {
            System.out.println("Felicitats! Has endevinat el número.");
        } else {
            System.out.println("Ho sento, havia generat el número " + numeroGenerat + "!");
        }
    }
    
}
