/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author docto
 */
public class Autobus extends Vehicle{
    private int numPlaces;
    private double longitud;
    private boolean articulat;

    public int getNumPlaces() {
        return numPlaces;
    }

    public void setNumPlaces(int numPlaces) {
        this.numPlaces = numPlaces;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public boolean isArticulat() {
        return articulat;
    }

    public void setArticulat(boolean articulat) {
        this.articulat = articulat;
    }

    public Autobus(int numPlaces, double longitud, boolean articulat, String marca, String model) {
        super(marca, model);
        this.numPlaces = numPlaces;
        this.longitud = longitud;
        this.articulat = articulat;
    }

    public Autobus() {
    }

    @Override
    public void soroll() {
        super.soroll();
        System.out.println("........");
    }

    
}
