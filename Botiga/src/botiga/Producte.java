/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package botiga;

/**
 *
 * @author docto
 */
public class Producte {
    //nom: el nom del producte
    private String nom;
    //preu: el preu del producte
    private double preu;
    //quantitat: la quantitat disponible
    private double quantitat;
    //categoria: la categoria del producte
    private Categoria categoria;
    //descompte: percentatge de descompte aplicable
    private double descompte;

    
    public Producte(String nom, double preu, double quantitat, Categoria categoria, double descompte) {
        this.nom = nom;
        this.preu = preu;
        this.quantitat = quantitat;
        this.categoria = categoria;
        this.descompte = descompte;
    }
    
    public double getPreu() {
        return preu;
    }

    public double getQuantitat() {
        return quantitat;
    }
    
    String mostrarNom(){
        return nom;
    }
   /* 
    String mostrarCategoria(){
        return categoria;
    }*/

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getDescompte() {
        return descompte;
    }

    public void setDescompte(double descompte) {
        this.descompte = descompte;
    }
    
    //aplicaDescompte(): redueix el preu del producte aplicant el descompte especificat.
    double aplicaDescompte(){    
        return preu = preu * (1 - descompte/100);
    }
    //actualitzaEstoc(int quantitatVendes): disminueix la quantitat en funció de les unitats venudes.
    double actualitzaEstoc(int quantitatVendes) {
        if (quantitatVendes <= quantitat) {
            quantitat -= quantitatVendes;
        } else {
            System.out.println("No hi ha prou estoc per a aquesta venda.");
        }
        return quantitatVendes;
    }
    //esExhaurit(): retorna true si la quantitat és zero; false en cas contrari.
    
    boolean esExhaurit() {
        return quantitat == 0;
    }
    
    //preuFinal(): retorna el preu final després d'aplicar el descompte, si n'hi ha.
    double preuFinal() {
        return preu;
        
    }

    @Override
    public String toString() {
        return "Producte{" + "nom=" + nom + ", preu=" + preu + ", quantitat=" + quantitat + ", categoria=" + categoria + ", descompte=" + descompte + '}';
    }
    
    public String getDescripcio() {
        return "Nom: " + nom + ", Categoria: " + categoria + ", Preu: " + preu + " ?";
    }
    
    
}
