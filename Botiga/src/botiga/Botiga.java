/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package botiga;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class Botiga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            
        Categoria tecnologia = new Categoria("Tecnologia", "Productes i serveis relacionats amb tecnologia.");
        Categoria esports = new Categoria("Esports", "Equipament i accessoris esportius.");
        Categoria alimentacio = new Categoria("Alimentació", "Productes alimentaris i begudes.");
        Categoria moda = new Categoria("Moda", "Roba i accessoris de moda.");
        
        Producte p1 = new Producte("Portàtil", 1200.0, 10, tecnologia, 15.0);
        Producte p2 = new Producte("Pilota de futbol", 30.0, 50, esports, 10.0);
        Producte p3 = new Producte("Cafè premium", 15.5, 100, alimentacio, 5.0);
        Producte p4 = new Producte("Jaqueta d'hivern", 80.0, 20, moda, 20.0);
        
        System.out.println(p1.getNom());
        System.out.println(p1.getPreu());
        System.out.println(p1);
        System.out.println(p2.getNom());
        System.out.println(p2.getPreu());
        System.out.println(p2);
        
        Categoria[] categories = new Categoria[4];
        categories[0] = new Categoria("Tecnologia", "Productes i serveis relacionats amb tecnologia.");
        categories[1] = new Categoria("Esports", "Equipament i accessoris esportius.");
        categories[2] = new Categoria("Alimentació", "Productes alimentaris i begudes.");
        categories[3] = new Categoria("Moda", "Roba i accessoris de moda.");

        // Mostrem la llista de categories
        System.out.println("Llista de categories:");
        for (Categoria categoria : categories) {
            System.out.println(categoria);
        }
       
    
        Producte[] productes = new Producte[10];
        productes[0] = new ProducteTecnologic("Windows 11", 16, "Portàtil", 1200.0, 10, tecnologia, 15.0);
        productes[1] = new ProducteEsportiu(5, "Cuir", "Pilota de futbol", 30.0, 50, esports, 10.0);
        productes[2] = new ProducteAlimentari(20250130, 200, "Cafè premium", 15.5, 100, alimentacio, 5.0);
        productes[3] = new ProducteDeModa("M", "Cotó", "Jaqueta d'hivern", 80.0, 20, moda, 20.0);
        productes[4] = new ProducteTecnologic("Android 12", 128, "Auriculars", 50.0, 25, tecnologia, 10.0);
        productes[5] = new ProducteEsportiu(42, "Sintètic", "Sabates esportives", 70.0, 30, esports, 20.0);
        productes[6] = new ProducteAlimentari(20250115, 150, "Galetes artesanes", 5.0, 150, alimentacio, 5.0);
        productes[7] = new ProducteDeModa("L", "Seda", "Camisa de seda", 45.0, 10, moda, 25.0);
        productes[8] = new ProducteTecnologic("iOS 16", 64, "Tauleta tàctil", 300.0, 15, tecnologia, 15.0);
        productes[9] = new ProducteEsportiu(68, "Metàl·lic", "Raqueta de tennis", 100.0, 8, esports, 10.0);

        
        System.out.println("\nLlista de productes:");
        for (Producte producte : productes) {
            System.out.println(producte.toString());
        }
        
       
/*
        // Mostrem la llista de productes amb la seva categoria
        System.out.println("\nLlista de productes:");
        for (Producte producte : productes) {
            System.out.println(producte.getDescripcio());
        }

        // Crear Scanner per a l'entrada de dades
        Scanner teclat = new Scanner(System.in);

        // Demanar el nom d'un producte
        System.out.print("\nEscriu el nom d'un producte per conèixer el seu preu: ");
        String nomProducte = teclat.nextLine();
        boolean trobat = false;

        // Comprovar el nom del producte sense utilitzar break
        for (int i = 0; i < productes.length; i++) {
            if (productes[i].getNom().equalsIgnoreCase(nomProducte)) {
                System.out.println("El preu de " + productes[i].getNom() + " és " + productes[i].getPreu() + " ?.");
                trobat = true;
                i = productes.length; // Sortir del bucle assignant un valor fora del rang
            }
        }

        if (!trobat) {
            System.out.println("Producte no trobat.");
        }
 
        
        // Demanar dos preus
        System.out.print("\nIntrodueix el primer preu: ");
        double preu1 = teclat.nextDouble();
        System.out.print("Introdueix el segon preu: ");
        double preu2 = teclat.nextDouble();

        double minPreu = Math.min(preu1, preu2);
        double maxPreu = Math.max(preu1, preu2);

        // Mostrar productes dins del rang de preus
        System.out.println("\nProductes amb preu entre " + minPreu + " ? i " + maxPreu + " ?:");
        trobat = false;
        for (Producte producte : productes) {
            if (producte.getPreu() >= minPreu && producte.getPreu() <= maxPreu) {
                System.out.println(producte.getDescripcio());
                trobat = true;
            }
        }

        if (!trobat) {
            System.out.println("No s'ha trobat cap producte en aquest rang de preus.");
        }
     */   
    }
    
}
