/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package botiga;

/**
 *
 * @author docto
 */
public class ProducteTecnologic extends Producte{
    private String versio;
    private int memoria;

    public ProducteTecnologic(String  versio, int memoria, String nom, double preu, double quantitat, Categoria categoria, double descompte) {
        super(nom, preu, quantitat, categoria, descompte);
        this.versio = versio;
        this.memoria = memoria;
    }

    public String getVersio() {
        return versio;
    }

    public void setVersio(String versio) {
        this.versio = versio;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }
    
    @Override
    public String toString() {
        return "ProducteTecnologic{" + "versio=" + versio + ", memoria=" + memoria + '}';
    }
    
    
}
