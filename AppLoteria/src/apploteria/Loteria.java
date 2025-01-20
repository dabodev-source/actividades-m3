/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apploteria;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author docto
 */
public class Loteria {
     private int[] apuestas;
    private int[] aleatorios;
    private boolean apuestaRealizada;
    private boolean sorteoRealizado;

    public Loteria() {
        apuestas = new int[6];
        aleatorios = new int[6];
        apuestaRealizada = false;
        sorteoRealizado = false;
    }

    public boolean setApostes(int[] numeros) {
        if (numeros.length != 6) {
            return false; // La apuesta debe tener exactamente 6 números
        }
        Arrays.sort(numeros);
        for (int i = 0; i < 5; i++) {
            if (numeros[i] == numeros[i + 1]) {
                return false; // No se permiten números repetidos en la apuesta
            }
        }
        apuestas = numeros.clone();
        apuestaRealizada = true;
        return true;
    }

    public void sortejar() {
        if (!apuestaRealizada) {
            System.out.println("Debe realizar una apuesta válida antes de realizar el sorteo.");
            return;
        }
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            int numero;
            do {
                numero = random.nextInt(49) + 1;
            } while (Arrays.binarySearch(aleatorios, numero) >= 0);
            aleatorios[i] = numero;
        }
        Arrays.sort(aleatorios);
        sorteoRealizado = true;
    }

    public int numeroEncerts() {
        if (!sorteoRealizado) {
            System.out.println("Debe realizar el sorteo antes de obtener el número de aciertos.");
            return 0;
        }
        int encerts = 0;
        for (int i = 0; i < 6; i++) {
            if (Arrays.binarySearch(apuestas, aleatorios[i]) >= 0) {
                encerts++;
            }
        }
        return encerts;
    }

    public int[] getAleatoris() {
        if (!sorteoRealizado) {
            System.out.println("Debe realizar el sorteo antes de obtener los números sorteados.");
            return new int[0];
        }
        return aleatorios.clone();
    }
}
