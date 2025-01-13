/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraysstring;

/**
 *
 * @author docto
 */
public class ArraysString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String prova = "hola";
        prova.charAt(0);
        prova.charAt(1);
        
        for (int i=0; i< prova.length();i++) {
            System.out.println(prova.charAt(i));
        }
        
       char[] a = prova.toCharArray(); // ['h','o','l','a']
       
        System.out.println(a[0]);
        for (int i=0; i<a.length;i++) {
            System.out.println(a[i]);
        }
        
        String text = "poma,pera,plàtan";
        String[] fruits = text.split(","); // ["poma", "pera", "plàtan"]
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        
            String text2 = "Hola, món!";
            String subText = text2.substring(0, 4); // "Hola"
            System.out.println(subText);
            
            
                String text3 = "Hola paco";
                int llargada = text3.length(); // 4
                System.out.println(llargada);
    }
    
}
