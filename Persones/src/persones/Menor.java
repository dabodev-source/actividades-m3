/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persones;

/**
 *
 * @author docto
 */
public class Menor extends Persona{
    private String cursActual;
    private String activitatExtracolar;

    public Menor(String cursActual, String activitatExtracolar, String nom, double altura, double pes, String sexe, String nacionalitat, String data, String DNI) {
        super(nom, altura, pes, sexe, nacionalitat, data, DNI);
        this.cursActual = cursActual;
        this.activitatExtracolar = activitatExtracolar;
    }

    public Menor(String cursActual, String activitatExtracolar) {
        this.cursActual = cursActual;
        this.activitatExtracolar = activitatExtracolar;
    }

    public String getCursActual() {
        return cursActual;
    }

    public void setCursActual(String cursActual) {
        this.cursActual = cursActual;
    }

    public String getActivitatExtracolar() {
        return activitatExtracolar;
    }

    public void setActivitatExtracolar(String activitatExtracolar) {
        this.activitatExtracolar = activitatExtracolar;
    }

    @Override
    public String toString() {
        return super.toString() + " cursActual " + cursActual + " activitatExtracolar " + activitatExtracolar;
    }
    
    
  
}
