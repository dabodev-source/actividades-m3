/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package botiga;

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
        Producte p = new Producte("Ordinador portatil" , 150 , 50 , "Electronica" , 20);
        Producte p2 = new Producte("Sudadera" , 20 , 0 , "Roba" , 10);
        
       
        System.out.println("Nombre del producte: " + p.mostrarNom());
        // Mostramos el precio original antes de aplicar el descuento
        System.out.println("Precio original: " + p.getPreu());

        // Aplicamos el descuento
        p.aplicaDescompte();
        
        // Mostramos el precio después de aplicar el descuento
        System.out.println("Precio después del descuento: " + p.getPreu());

        // Actualizamos el stock
        p.actualitzaEstoc(3);
        System.out.println("Stock después de la venta: " + p.getQuantitat());
        
        //Mostramos la categoria
        System.out.println("La categoria es: " + p.mostrarCategoria());

        // Comprobamos si está agotado
        System.out.println("¿El producto está agotado? " + p.esExhaurit());

        // Mostramos el precio final (que es el mismo tras aplicar el descuento)
        System.out.println("Precio final con descuento: " + p.preuFinal());
        
        // Ahora hacemos lo mismo pero con producte 2
        
        System.out.println("\n--------------------------------\n");
        
        System.out.println("Nombre del producte: " + p2.mostrarNom());
        System.out.println("Precio original: " + p2.getPreu());
        
        p2.aplicaDescompte();
        
        System.out.println("Precio después del descuento: " + p2.getPreu());
        System.out.println("La categoria es: " + p2.mostrarCategoria());
        
        p2.actualitzaEstoc(9);
        System.out.println("Stock después de la venta: " + p2.getQuantitat());
        
        System.out.println("¿El producto está agotado? " + p2.esExhaurit());
        
        System.out.println("Precio final con descuento: " + p2.preuFinal());
        
        
    }
    
}
