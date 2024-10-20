/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package usernamepassword2;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class UsernamePassword2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclat = new Scanner(System.in);

        // Informació secreta
        final String usernameCorrecte = "cponts";
        final String passwordCorrecte = "qw34T1234";
        
        int intents = 0;
        boolean validat = false;

        // Bucle per donar tres intents a l'usuari
        while (intents < 3 && !validat) {
            // Demanar username i password
            System.out.print("Introdueix el teu username: ");
            String username = teclat.nextLine();

            System.out.print("Introdueix la teva contrasenya: ");
            String password = teclat.nextLine();

            // Comprovar si les credencials són correctes
            if (username.equals(usernameCorrecte) && password.equals(passwordCorrecte)) {
                System.out.println("Accés concedit.");
                validat = true;  // L'usuari ha entrat les credencials correctes
            } else {
                intents++;  // Incrementem el comptador d'intents
                if (intents < 3) {
                    System.out.println("Credencials incorrectes. Torna-ho a intentar.");
                }
            }
        }

        // Si després de tres intents no és validat
        if (!validat) {
            System.out.println("Usuari bloquejat!");
        }
    }
    
}
