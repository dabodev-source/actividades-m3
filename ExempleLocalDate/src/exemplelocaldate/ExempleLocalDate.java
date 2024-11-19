/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplelocaldate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author docto
 */
public class ExempleLocalDate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Assignar la data actual
        LocalDate dataActual = LocalDate.now();
        System.out.println("Data actual: " + dataActual);

        // Assignar una data de naixement en un format específic
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dataNaixementStr = "15-08-1990";
        LocalDate dataNaixement = LocalDate.parse(dataNaixementStr, formatter);
        System.out.println("Data de naixement: " + dataNaixement);
    }
    
}
