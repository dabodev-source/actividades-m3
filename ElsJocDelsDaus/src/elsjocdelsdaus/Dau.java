/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elsjocdelsdaus;
     
/**
 *
 * @author docto
 */
public class Dau implements MaquinaAleatoria{
    private int numCares;
    
    public Dau(int numCares) {
        this.numCares = numCares;
    }

    @Override
    public int llençar(){
        return (int) (Math.random() * numCares) + 1;
    }
}
