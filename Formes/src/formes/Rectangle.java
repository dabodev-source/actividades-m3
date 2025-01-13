/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formes;

/**
 *
 * @author docto
 */
public class Rectangle {
    private int costat1;
    private int costat2;
    private String color;
    private double amplada;
    private double llargada;

    public Rectangle(int costat1, int costat2, String color, double amplada, double llargada) {
        this.costat1 = costat1;
        this.costat2 = costat2;
        this.color = color;
        this.amplada = amplada;
        this.llargada = llargada;
    }

    public Rectangle(int costat1, int costat2) {
        this.setCostat1(costat1);
        this.setCostat2(costat2);
        this.color = "negre";
    }

    public Rectangle(int costat1, int costat2, String color) {
        this.costat1 = costat1;
        this.costat2 = costat2;
        this.color = color;
    }
     
    // Constructor sin parametros
    public Rectangle() {
        this.llargada = 1; 
        this.amplada = 1;
    }
    
    public double getAmplada() {
        return amplada;
    }

    public void setAmplada(double amplada) {
        if (amplada > 0 && amplada < 10) {
            this.amplada = amplada;
        } else {
            this.amplada = 1; 
        }
    }

    public double getLlargada() {
        return llargada;
    }

    public void setLlargada(double llargada) {
        if (llargada > 0 && llargada < 10) {
            this.llargada = llargada;
        } else {
            this.llargada = 1; 
        }
    }
    
    public int getCostat1() {
        return costat1;
    }

    public void setCostat1(int costat1) {
        if(costat1>=1 && costat1<=9) {
            this.costat1 = costat1;
        }
        else {
            this.costat1 = 1;
        }
        
    }

    public int getCostat2() {
        return costat2;
    }

    public void setCostat2(int costat2) {
        if(costat1>=1 && costat1<=9) {
            this.costat2 = costat2;
        }
        else {
            this.costat2 = 1;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
    void mostar() {
        String codi = obtenirCodiColor();
        
        for (int i=0; i<costat1; i++) {
            System.out.print(codi);
            for (int j=0; j<costat2; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    
     private String obtenirCodiColor() {
        String codi="";
        switch(color){
            case "negre":
                codi = "\u001B[30m";
            break;
            case "verd":
                codi = "\u001B[32m";
            break;
            case "groc":
                codi = "\u001B[33m";
            break;
            case "blau":
                codi = "\u001B[34m";
            break;
            default:
                codi = "\u001B[0m";
                
        }
        return codi;
    }
    int area() {
        int res = costat1 * costat2;
        return res;
        //System.out.println(res);
    }
    
    int perimetre() {
        int res = costat1 / costat2;
        return res;
    }
    
    void escalar(int numero){
        costat1 = costat1 * numero;
        costat2 = costat2 * numero;
        
    }
    
}
