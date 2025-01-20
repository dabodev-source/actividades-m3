/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist;


/**
 *
 * @author docto
 */
public class ArrayList {

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
        
        ArrayList fruites = new ArrayList();
    }
    
}
