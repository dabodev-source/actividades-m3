/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buclesencaixatfigura2;

/**
 *
 * @author docto
 */
public class BuclesEncaixatFigura2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Hay que hacer esta figura
        //1
        //1 2
        //1 2 3
        //1 2 3 4
        //1 2 3 4 5
        //1 2 3 4 5 6
        //1 2 3 4 5 6 7
        //1 2 3 4 5 6 7 8
        //1 2 3 4 5 6 7 8 9
        
        for (int i = 1; i <= 9; i++ ) {
            for (int j = 1; j <= i; j++){
                 System.out.print(j + " ");
            }
            System.out.println();
        }
 
    }
    
}
