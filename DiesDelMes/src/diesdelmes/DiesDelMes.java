/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diesdelmes;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class DiesDelMes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcio;
        Scanner teclat = new Scanner(System.in);
        System.out.println("Entra un numero del mes:");
        opcio = teclat.nextInt();
        
        switch (opcio) {
            case 1:case 3:case 4: case 5: case 6:case 7: case 8:case 9:case 10:case 11:case 12:
                System.out.println("Este mes tiene 31 dies");
                break;
            case 2:
                System.out.println("Febrero tiene 28 dies");
                break;
            default:
                System.out.println("No existeis aquest mes");
        }
    }
    
}
