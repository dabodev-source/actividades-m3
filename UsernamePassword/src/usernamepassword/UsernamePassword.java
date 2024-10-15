/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package usernamepassword;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class UsernamePassword {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // Informació secreta
        final String username = "cponts";
        final String password = "qw34T1234";
        
        // Crear un escàner per llegir l'entrada de l'usuari
        Scanner teclat = new Scanner(System.in);
        
        // Demanar el nom d'usuari
        System.out.print("Introdueix el teu username: ");
        String inputUsername = teclat.nextLine();
        
        // Demanar el password
        System.out.print("Introdueix el teu password: ");
        String inputPassword = teclat.nextLine();
        
        // Comprovar si l'usuari i la contrasenya són correctes
        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println("Login correcte! Benvingut " + username + ".");
        } else {
            System.out.println("Username o password incorrectes!");
        }
    }
    
}
