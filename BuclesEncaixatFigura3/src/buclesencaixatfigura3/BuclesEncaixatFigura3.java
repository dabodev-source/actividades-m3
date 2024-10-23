/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buclesencaixatfigura3;

/**
 *
 * @author docto
 */
public class BuclesEncaixatFigura3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //Hay que hacer esta figura
        //*
        //**
        //***
        //****
        //*****
        //******
        //*******
        //********
        //*********
        
        for (int i = 1; i <= 9; i++ ) {
            for (int j = 1; j <= i; j++){
                 System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
