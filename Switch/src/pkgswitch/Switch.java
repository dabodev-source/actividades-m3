/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgswitch;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int opcio;
        //char opcio;
        String opcio;
        Scanner teclat = new Scanner(System.in);
        System.out.println("Entra una opcio:");
        //opcio = teclat.nextInt();
        //opcio = teclat.next().charAt(0);
        opcio = teclat.next();
        // Cuando pones una letra tienes que ponerlo con el signo de aprostrof '' y para hacer un String hay que poner entre comillas el nombre ""
        switch(opcio) {
            case "primera":
                System.out.println("Has introduit primera");
                System.out.println("Hola que tal");
                //Para que el codigo del case haga el codigo de cada case al final pones un break
                break;
            case "segona":
                System.out.println("Has introduit segona");
                break;
            case "tercera":
                System.out.println("Has introduit tercera");
                break;
                //default es por si no se cumple los otros case se pone otra opcion, como por ejemplo si es incorrecto
            default:
                System.out.println("Opcio incorrecta");
        }
    }
    
}
