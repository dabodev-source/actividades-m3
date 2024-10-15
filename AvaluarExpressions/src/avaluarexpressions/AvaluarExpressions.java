/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avaluarexpressions;

/**
 *
 * @author docto
 */
public class AvaluarExpressions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=3;
        int b=8;
        int c=4;
        int d=2;
        
        // executa i mostra per pantalla el resultat d’avaluar les expressions següents:

        // 2 - a * b + c

        // (2 - a) * b + c

        // a * b - c * a - d

        // a / 3 - b

        // a / (33 - b)

        // d * 23 - 1 + b
        
        System.out.println(2 - a * b + c);
        System.out.println((2 - a) * b + c);
        System.out.println(a * b - c * a - d);
        System.out.println(a / 3 - b);
        System.out.println(a / (33 - b));
        System.out.println(d * 23 - 1 + b);
    }
    
}
