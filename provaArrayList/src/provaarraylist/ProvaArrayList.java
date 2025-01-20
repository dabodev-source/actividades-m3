/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package provaarraylist;

import java.util.ArrayList;

/**
 *
 * @author docto
 */
public class ProvaArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] array = new String[3];
        array[0] = "poma"; array[1]= "pera"; array[2]= "platan";
        
        for (String fruita:array) {
            System.out.println(fruita);
        }
        System.out.println("");
        ArrayList<String> fruites = new ArrayList();
        fruites.add("poma");
        fruites.add("pera");
        fruites.add("platan");
        fruites.add(2, "raim");
        fruites.set(0, "patata");
        
        //fruites.remove(1);
        //fruites.remove("raim");
        for (String fruita:fruites) {
            System.out.println(fruita);
        }
        System.out.println("Element posicio 0: "+ fruites.get(0));
        
        int pos = fruites.indexOf("pera");
        System.out.println("He trobat a " + pos);
        
        //Integer i = 10;
        ArrayList<Integer> numeros = new ArrayList();
    }
    
}
