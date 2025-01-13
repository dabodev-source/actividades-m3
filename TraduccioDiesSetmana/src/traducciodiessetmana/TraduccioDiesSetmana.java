/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package traducciodiessetmana;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class TraduccioDiesSetmana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Arrays amb els dies de la setmana en català i castellà
        String[] dies = {"dilluns", "dimarts", "dimecres", "dijous", "divendres", "dissabte", "diumenge"};
        String[] dias = {"lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"};

        Scanner teclat = new Scanner(System.in);

        // Entrada del dia en català
        System.out.print("Entra el nom del dia de la setmana en català: ");
        String diaCatala = teclat.nextLine().toLowerCase();

        // Buscar la traducció
        boolean trobat = false;
        for (int i = 0; i < dies.length; i++) {
            if (dies[i].equals(diaCatala)) {
                System.out.println("La traducció al castellà és: " + dias[i]);
                trobat = true;
                break;
            }
        }

        // Si no es troba el dia
        if (!trobat) {
            System.out.println("El dia introduït no és vàlid.");
        }
    }
    
}
