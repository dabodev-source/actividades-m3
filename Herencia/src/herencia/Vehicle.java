/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author docto
 */
public class Vehicle {
    //Poner el pretected las clases hijas pueden utilizarlas sin poner directamente el geters y settes
    protected String marca;
    protected String model;
    
    public Vehicle(){
        
    }

    public Vehicle(String marca, String model) {
        this.marca = marca;
        this.model = model;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
    public void soroll() {
        System.out.println("Brrrrr...");
    }

    @Override
    public String toString() {
        return "Vehicle{" + "marca=" + marca + ", model=" + model + '}';
    }
    
    
    
}
