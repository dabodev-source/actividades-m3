/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elsjocdelsdaus;

/**
 *
 * @author docto
 */
public class Jugador {
    public String nom; // El nom del jugador.
    public int punts; // Els punts acumulats pel jugador
    public static int comptador_jugadors = 0;
    private boolean eliminat;
    
    public Jugador() { // Constructor per inicialitzar el jugador amb un nom automàtic. Els jugadors portaran per nom "Jugador 1", "Jugador 2",...S'ha de fer servir l'atribut static comptador_jugadors;
        comptador_jugadors++;
        this.nom = "Jugador " + comptador_jugadors;
        this.punts = 0;
        this.eliminat = false;
    }
     
    public Jugador(String nom, int punts) {
        this.nom = nom;
        this.punts = punts;
        this.eliminat = false;
    }

    public String getNom() {
        return nom;
    }

    public int getPunts() {
        return punts;
    }
   
    public static int comptador_jugadors (){ // Compta quants jugadors s'han creat fins al moment.
        return comptador_jugadors;
    }
    
    public void afegirPunts(int punts) {
        this.punts += punts;        
    }
    
    public boolean isEliminat() {
        return eliminat;
    }
    
    public void eliminar() {
        this.eliminat = true;
    }
    
}
