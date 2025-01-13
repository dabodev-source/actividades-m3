/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraybidimensional1;

/**
 *
 * @author docto
 */
public class ArrayBidimensional1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [][] matriu = new int [10][10]; // 10 files , 10 Columnes
        
        for (int i=0; i< matriu.length; i++) {
            for (int j=0; j<matriu[i].length; j++) {
                matriu[i][j] = i;
            }
        }
        
        for (int i=0; i< matriu.length; i++) {
            for (int j=0; j<matriu[i].length; j++) {
                System.out.print(matriu[i][j] + " "); 
            }
            System.out.println("");
        }
    }
    
}
