/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elsrectangles;

/**
 *
 * @author docto
 */
public class Rectangle {
    int costat11,costat12;
    int costat21,costat22;
    
    void mostarRectangle() {
        for (int i=0; i< costat11; i++) {
           for (int j=0; j< costat12; j++) {
               System.out.print("*");
           }
           System.out.println("");
          
       }
        for (int i=0; i< costat21; i++) {
           for (int j=0; j< costat22; j++) {
               System.out.print("*");
           }
           System.out.println("");
          
       }
    }
}
