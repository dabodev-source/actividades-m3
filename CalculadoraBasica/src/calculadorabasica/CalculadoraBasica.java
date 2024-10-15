/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadorabasica;

/**
 *
 * @author docto
 */
public class CalculadoraBasica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 20;
        int b = 23;
        //En las sumas y las restas hay que poner entre parentesis porque el programa detecta las contenaciones
        System.out.println(a + "+"+ b + "=" +(a+b));
        System.out.println(a + "-"+ b +"=" +(a-b));
        System.out.println(a +"*"+ b +"=" + a*b);
        System.out.println(a +"/"+ b +"=" + a /b);
        
    }
    
}
