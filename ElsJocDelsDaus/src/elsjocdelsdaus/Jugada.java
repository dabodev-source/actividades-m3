/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elsjocdelsdaus;

import java.util.Arrays;

/**
 *
 * @author docto
 */
public class Jugada {
   private int [] resultats;
   
   public Jugada(Dau dau, int numeroTirades){
       resultats = new int[numeroTirades];
       for (int i = 0; i < numeroTirades; i++) {
           resultats[i] = dau.llençar();
       }
   }
   
   // Esta parte es con interfices que se llama MaquinaAleatoria
   /*public Jugada(MaquinaAleatoria maquina, int numeroTirades) {
    
       resultats = new int[numeroTirades];
       for(int i = 0; i< resultats.length; i++) {
           resultats[i] = maquina.llençar();
       }
   }*/

    /*@Override
    public String toString() {
        String valors = "";
        for(int i = 0; i< resultats.length; i++) {
            valors = valors + resultats[i] + "";
        }
        return valors;
    }
    */
    public int[] getJugada(){
        return resultats;
    }
    
    public boolean esGuanyadorDirecte(){
        int primer = resultats[0];
        for (int num : resultats) {
            if (num != primer) return false;
        }
        return true;
    }
    
    public boolean mortDirecta(){
        for (int i =0; i < resultats.length; i++) {
            if (i %2 == 0 && resultats[i] % 2 !=0)return false;
            if (i %2 != 0 && resultats[i] % 2 ==0)return false;
        }
        return true;
    }
   
    public int obtenirPuntacio() {
        int suma = 0;
        for(int num : resultats) {
            suma += num;
        }
        return suma;
    }

    @Override
    public String toString() {
        return Arrays.toString(resultats);
    }
    
    
   
}
