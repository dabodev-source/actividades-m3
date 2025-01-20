/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apploteria;

/**
 *
 * @author docto
 */
public class AppLoteria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Creo un objecte de la classe Loteria
        Loteria loto = new Loteria();

        // Deso en un array els números als que aposto
        int[] apostes = {2, 12, 25, 34, 36, 26};
        // faig l'aposta
        if (!loto.setApostes(apostes)) {
            System.out.println("¡Error en la apuesta!");
            return;
        }

        // Comença el sorteig!!! Bona sort!;
        loto.sortejar();

        // Recupero el número d'encerts
        int encerts = loto.numeroEncerts();
        System.out.println("N'he encertat " + encerts);

        // Vull saber quins números han estat els agraciats
        System.out.println("Els números sorteig han estat:");
        int[] resultats = loto.getAleatoris();
        for (int resultat : resultats) {
            System.out.print(resultat + " ");
        }
        System.out.println();
    }
    
}
