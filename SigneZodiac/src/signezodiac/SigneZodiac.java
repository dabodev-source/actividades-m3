/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package signezodiac;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class SigneZodiac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcio;
        System.out.println("Llistat dels Signes del Zodiac: ");
        System.out.println("[1] Aries [2] Capricorn [3] Balança [4] Cranc [5] Lleo [6] Taure");
        System.out.println("[7] Aquari [8] Escorpio [9] Sagitari [10] Verge [11] Bessons [12] Peixos");
        Scanner teclat = new Scanner(System.in);
        System.out.println("Entra un numero del Signe Zodiac:");
        opcio = teclat.nextInt();
        
        switch (opcio) {
            case 1: case 5: case 9:
                System.out.println("Es Foc");
                break;
            case 2:  case 6: case 10:
                System.out.println("Es Terra");
                break;
            case 3:  case 7:  case 11:
                System.out.println("Es Aire");
                break;
            case 4: case 8: case 12:
                System.out.println("Es Aigua");
                break;
            default:
                System.out.println("ERROR:" + opcio + " no associat a cap signe");
        }
    }
    
}
