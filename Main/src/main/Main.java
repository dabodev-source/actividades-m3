/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author docto
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        UtilsArrays array = new UtilsArrays();
        int[] numeros = {5, 10, 15, 20, 25};

        // Probar método mostrar
        System.out.print("Valores del array: ");
        array.mostrar(numeros);

        // Probar método suma
        int suma = array.suma(numeros);
        System.out.println("Suma del array: " + suma);

        // Probar método mitjana
        double mitjana = array.mitjana(numeros);
        System.out.println("Mitjana del array: " + mitjana);

        // Probar método max
        int max = array.max(numeros);
        System.out.println("Maximo del array: " + max);

        // Probar método min
        int min = array.min(numeros);
        System.out.println("Minimo del array: " + min);

        // Probar método rang
        int rang = array.rang(numeros);
        System.out.println("Rango del array: " + rang);

        // Probar inicialitzaAleatori
        int[] aleatori = new int[5];
        array.inicialitzaAleatori(aleatori, 1, 100);
        System.out.print("Array aleatorio: ");
        array.mostrar(aleatori);

        // Probar valorsSuperiors
        int[] superiors = array.valorsSuperiors(numeros, 15);
        System.out.print("Valores superiores a 15: ");
        array.mostrar(superiors);
        
        //Probar valorsInferiors
        int[] inferiors = array.valorsInferiors(numeros, 3);
        System.out.println("Valors inferiors a 3:");
        array.mostrar(inferiors);

        // Probar multiplica
        int[] multiplicados = array.multiplica(numeros, 2);
        System.out.print("Array multiplicado por 2: ");
        array.mostrar(multiplicados);
        
        //Probar suma
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {10, 20, 30};

        // Probar método suma (dos vectores)
        int[] sumaArrays = array.suma(array1, array2);
        System.out.print("Suma de los dos arrays: ");
        array.mostrar(sumaArrays); // Esperado: [11, 22, 33, 4]
    }
    
}
