/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package statics;

/**
 *
 * @author docto
 */
public class Comptador {
     public static int numObjectes = 0;

    public Comptador() {
        // Incrementa el comptador cada vegada que es crea un objecte
        numObjectes++;
    }
}
