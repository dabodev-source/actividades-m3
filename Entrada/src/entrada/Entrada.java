/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entrada;

import java.util.Calendar;

/**
 *
 * @author docto
 */
public class Entrada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Obtenim l'hora i el dia actuals
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);

        // Mostrar la informació actual per a referència
        System.out.println("Day: " + day);  // 1 és diumenge, 7 és dissabte
        System.out.println("Hour: " + hour);

        // Condicionals aniuades
        if (day == Calendar.SATURDAY) {
            System.out.println("NO pots entrar: és dissabte!");
        } else if (day == Calendar.SUNDAY) {
            System.out.println("NO pots entrar: és diumenge!");
        } else {
            // Comprovar l'hora
            if (hour < 8) {
                System.out.println("No pots entrar: Encara no són les 08:00 hores!");
            } else {
                System.out.println("Benvingut a l'aplicació!!");
            }
        }
    }
}

