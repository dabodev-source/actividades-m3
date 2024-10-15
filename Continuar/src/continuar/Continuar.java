/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package continuar;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class Continuar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclat = new Scanner(System.in);
        
        int i = 0;
        char resposta = 's';
        
        while(i< 10 && resposta=='s'){
            System.out.println("Vols continuar?");
            resposta = teclat.next().charAt(0);
            
            i++;
        }
    }
    
}
