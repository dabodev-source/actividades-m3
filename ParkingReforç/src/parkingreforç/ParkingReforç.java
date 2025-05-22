/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parkingreforç;

import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 *
 * @author docto
 */
public class ParkingReforç {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LocalDateTime h1;
        
        h1 = LocalDateTime.now();
        System.out.println(h1);
        
        LocalDateTime h2;
        
        h2 = LocalDateTime.of(2015,2,2, 10, 30);
        LocalDateTime h3 = LocalDateTime.parse("2025-02-04T12:32:07");
        
        System.out.println(h2);
        System.out.println(h3);
        
    }
    
}
