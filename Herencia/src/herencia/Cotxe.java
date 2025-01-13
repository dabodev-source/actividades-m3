/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author docto
 */
public class Cotxe extends Vehicle{
    private int numPortes;

    public int getNumPortes() {
        return numPortes;
    }

    public void setNumPortes(int numPortes) {
        this.numPortes = numPortes;
    }

    public Cotxe(int numPortes, String marca, String model) {
        super(marca, model);
        this.numPortes = numPortes;
        this.marca = "";
    }

    public Cotxe() {
    }
    
    @Override
    public void soroll() {
        System.out.println("Brum brummmmm...");
    }

    @Override
    public String toString() {
        return "Cotxe{" + "numPortes=" + numPortes + '}';
    }
    
    
}
