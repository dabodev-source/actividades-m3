/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package botiga;

/**
 *
 * @author docto
 */
public class ProducteAlimentari extends Producte {
    private int dataCaducitat;
    private int calories;

    public ProducteAlimentari(int dataCaducitat, int calories, String nom, double preu, double quantitat, Categoria categoria, double descompte) {
        super(nom, preu, quantitat, categoria, descompte);
        this.dataCaducitat = dataCaducitat;
        this.calories = calories;
    }

    public int getDataCaducitat() {
        return dataCaducitat;
    }

    public void setDataCaducitat(int dataCaducitat) {
        this.dataCaducitat = dataCaducitat;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "ProducteAlimentari{" + "dataCaducitat=" + dataCaducitat + ", calories=" + calories + '}';
    }
   
    
}
