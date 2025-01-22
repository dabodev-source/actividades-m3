/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persones;

/**
 *
 * @author docto
 */
public class Actiu extends Persona {
    private String ocupacio;
    private double souMensual;
    private int horesTreballades;

    public Actiu(String ocupacio, double souMensual, int horesTreballades, String nom, double altura, double pes, String sexe, String nacionalitat, String data, String DNI) {
        super(nom, altura, pes, sexe, nacionalitat, data, DNI);
        this.ocupacio = ocupacio;
        this.souMensual = souMensual;
        this.horesTreballades = horesTreballades;
    }

    public Actiu(String ocupacio, double souMensual, int horesTreballades) {
        this.ocupacio = ocupacio;
        this.souMensual = souMensual;
        this.horesTreballades = horesTreballades;
    }

    public String getOcupacio() {
        return ocupacio;
    }

    public void setOcupacio(String ocupacio) {
        this.ocupacio = ocupacio;
    }

    public double getSouMensual() {
        return souMensual;
    }

    public void setSouMensual(double souMensual) {
        this.souMensual = souMensual;
    }

    public int getHoresTreballades() {
        return horesTreballades;
    }

    public void setHoresTreballades(int horesTreballades) {
        this.horesTreballades = horesTreballades;
    }
    
    public double calcularIngresosAnuals() {
        double souAnual = souMensual * 12;
        
        return souAnual;
    }

    @Override
    public String toString() {
        return super.toString() + " ocupacio " + ocupacio + " souMensual " + souMensual + " horesTreballades " + horesTreballades;
    }
    
    
}
