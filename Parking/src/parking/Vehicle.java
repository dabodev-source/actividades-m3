/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parking;

/**
 *
 * @author docto
 */
public class Vehicle {
    
    String marca;
    String model;
    //Cuando pones private es que desde fuera no puedes acceder
    private int any;
    double preu;

    public Vehicle(String marca, String model, int any, double preu) {
        System.out.println("Constructor amb cuatre params");
        this.marca = marca;
        this.model = model;
        this.any = any;
        this.preu = preu;
    }

    public Vehicle() {
        System.out.println("Constructor sense params");
        this.preu = 0;
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

    public int getAny() {
        return any;
    }

    public void setAny(int any) {
        if(any>=1 && any<=3000)
        this.any = any;
        else //this.any = 2000;
            throw new IllegalArgumentException("Any no vàlid.");
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }
    
    
    
    
}
