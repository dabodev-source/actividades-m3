/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elsjocdelsdaus;

import java.util.Random;

/**
 *
 * @author docto
 */
public class Ruleta implements MaquinaAleatoria{
    int  valors [];
    Random rand;
    
    void Ruleta (int[] valors) {
        this.valors = valors;
        this.rand = new Random();
    }
    
    @Override
    public int llençar() {
        return valors[rand.nextInt(valors.length)];
    }
    
}
