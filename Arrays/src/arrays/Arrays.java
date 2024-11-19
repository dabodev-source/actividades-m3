/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

/**
 *
 * @author docto
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] preus = new int [5];
        
        preus[0] = 3;
        preus[1] = 4;
        preus[2] = 40;
        preus[3] = 21;
        preus[4] = 20;
        //preus[5] = 14;
        System.out.println(preus[3]);
        
        // Tiene 6 posiciones empieza desde el 0 hasta la ultima que pongas en este ejemplo 6
        int [] numeros = {10,45,23,67,23,1};
        numeros[3] = 5;
        
        int  i = 0;
        while(i<preus.length){
            System.out.println(preus[i]);
            i++;
        }
                
        }
            
    }
