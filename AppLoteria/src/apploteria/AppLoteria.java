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

        // Deso en un array els n�meros als que aposto
        int[] apostes = {2, 12, 25, 34, 36, 26};
        // faig l'aposta
        if (!loto.setApostes(apostes)) {
            System.out.println("�Error en la apuesta!");
            return;
        }

        // Comen�a el sorteig!!! Bona sort!;
        loto.sortejar();

        // Recupero el n�mero d'encerts
        int encerts = loto.numeroEncerts();
        System.out.println("N'he encertat " + encerts);

        // Vull saber quins n�meros han estat els agraciats
        System.out.println("Els n�meros sorteig han estat:");
        int[] resultats = loto.getAleatoris();
        for (int resultat : resultats) {
            System.out.print(resultat + " ");
        }
        System.out.println();
    }
    
}
