/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persones;

import java.time.Year;

/**
 *
 * @author docto
 */
public class Jubilat extends Persona {
    private double pensioMensual;
    private int dataJubilacio;
    private String[] activitatsPreferides;

    public Jubilat(double pensioMensual, int dataJubilacio, String[] activitatsPreferides, String nom, double altura, double pes, String sexe, String nacionalitat, String data, String DNI) {
        super(nom, altura, pes, sexe, nacionalitat, data, DNI);
        this.pensioMensual = pensioMensual;
        this.dataJubilacio = dataJubilacio;
        this.activitatsPreferides = activitatsPreferides;
    }

    public Jubilat(double pensioMensual, int dataJubilacio, String[] activitatsPreferides) {
        this.pensioMensual = pensioMensual;
        this.dataJubilacio = dataJubilacio;
        this.activitatsPreferides = activitatsPreferides;
    }

    public double getPensioMensual() {
        return pensioMensual;
    }

    public void setPensioMensual(double pensioMensual) {
        this.pensioMensual = pensioMensual;
    }

    public int getDataJubilacio() {
        return dataJubilacio;
    }

    public void setDataJubilacio(int dataJubilacio) {
        this.dataJubilacio = dataJubilacio;
    }

    public String[] getActivitatsPreferides() {
        return activitatsPreferides;
    }

    public void setActivitatsPreferides(String[] activitatsPreferides) {
        this.activitatsPreferides = activitatsPreferides;
    }
    
    public String mostrarActivitats() {
        if (activitatsPreferides == null || activitatsPreferides.length == 0) {
            return "No hi ha activitats preferides.";
        }
        return String.join(", ", activitatsPreferides); // Uneix els elements amb comes
    }
 
    public int calcularAnysJubilacio(){
        int anyActual = Year.now().getValue(); // Obtenim l'any actual
        return anyActual - dataJubilacio; // Restem l'any de jubilació
    }
    
}
