/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package botiga;

/**
 *
 * @author docto
 */
public class ProducteEsportiu extends Producte {
    private int mida;
    private String material;

    public ProducteEsportiu(int mida, String material, String nom, double preu, double quantitat, Categoria categoria, double descompte) {
        super(nom, preu, quantitat, categoria, descompte);
        this.mida = mida;
        this.material = material;
    }

    public int getMida() {
        return mida;
    }

    public void setMida(int mida) {
        this.mida = mida;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "ProducteEsportiu{" + "mida=" + mida + ", material=" + material + '}';
    }
   
}
