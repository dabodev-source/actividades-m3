/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package botiga;

/**
 *
 * @author docto
 */
public class Categoria {
    private String nom;
    private double preu;
    private String descripcio;

    public Categoria(String nom, String descripcio) {
        this.nom = nom;
        this.descripcio = descripcio;
    }
    public Categoria (){
        
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    @Override
    public String toString() {
        return  nom  + descripcio ;
    }
    
    public double getPreu() {
        return preu;
    }
    
    
}
