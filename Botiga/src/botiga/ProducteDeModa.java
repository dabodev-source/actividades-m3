/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package botiga;

/**
 *
 * @author docto
 */
public class ProducteDeModa extends Producte {
    private String mida; // Per exemple: "S", "M", "L", "XL"
    private String tipusTeixit;

    public ProducteDeModa(String mida, String tipusTeixit, String nom, double preu, double quantitat, Categoria categoria, double descompte) {
        super(nom, preu, quantitat, categoria, descompte);
        this.mida = mida;
        this.tipusTeixit = tipusTeixit;
    }

    public String getMida() {
        return mida;
    }

    public void setMida(String mida) {
        this.mida = mida;
    }

    public String getTipusTeixit() {
        return tipusTeixit;
    }

    public void setTipusTeixit(String tipusTeixit) {
        this.tipusTeixit = tipusTeixit;
    }

    @Override
    public String toString() {
        return "ProducteDeModa{" + "mida=" + mida + ", tipusTeixit=" + tipusTeixit + '}';
    }
    
    
    
}
