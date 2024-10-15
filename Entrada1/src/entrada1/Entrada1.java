/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entrada1;

import java.util.Calendar;

/**
 *
 * @author docto
 */
public class Entrada1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calendar calendar = Calendar.getInstance();
        
        int hour = calendar.get(Calendar.HOUR_OF_DAY); // Obtenim l'hora actual
        int minute = calendar.get(Calendar.MINUTE); // Obtenim els minuts actuals
        
        // Comprovar si són les 8:00 del matí
        if (hour == 8 && minute == 0) {
            System.out.println("Benvingut a l'aplicació!");
            // Aquí es poden afegir les instruccions que es volen executar
        } else if (hour < 8) {
            System.out.println("Encara no són les 08:00 hores!");
        } else {
            System.out.println("No pots entrar: Ja han passat les 08:00 hores!");
        }
        
        // Per comprovar el dia
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println("Dia: " + day);
        
        // Mostrem l'hora i els minuts
        System.out.println("Hora: " + hour);
        System.out.println("Minut: " + minute);
    }
    
}
