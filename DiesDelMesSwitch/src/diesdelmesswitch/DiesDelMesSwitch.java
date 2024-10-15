/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diesdelmesswitch;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class DiesDelMesSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclat = new Scanner(System.in);
        int diesMes;
        
        System.out.println("Introduce un mes");
        diesMes = teclat.nextInt();
        
        
         switch(diesMes){
             case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10: case 11: case 12: 
             System.out.println("Existeix el mes");
         }
        
        
        
        
    }
    
}
