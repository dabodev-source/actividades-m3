/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buclesencaixatfigura4;

/**
 *
 * @author docto
 */
public class BuclesEncaixatFigura4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Programa que mostri per pantalla:
        //E * * * * * * * *
        //* E * * * * * * *
        //* * E * * * * * *
        //* * * E * * * * *
        //* * * * E * * * *
        //* * * * * E * * *
        //* * * * * * E * *
        //* * * * * * * E *
        //* * * * * * * * E
        
        for (int i = 1; i <= 9; i++) {
            for (int j = 1 ; j <= 9; j++) {         
                if (i == j) {
                    System.out.print("E ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();  
        }
    }
    
}
