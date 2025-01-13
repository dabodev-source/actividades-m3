package calculs;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author docto
 */
public class SuperCalculadora {
    // Mètode per calcular la suma dels primers n números
    public int sumaPrimersNumeros(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
    }

    // Mètode per calcular el factorial d'un nombre
    public int calcularFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    // Mètode per calcular la suma dels quadrats dels primers n números
    public int sumaQuadrats(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i * i;
        }
        return suma;
    }

    // Mètode per calcular la potència utilitzant sumes
    public int calcularPotencia(int base, int exponent) {
        int resultat = 1;
        for (int i = 0; i < exponent; i++) {
            int temp = 0;
            for (int j = 0; j < base; j++) {
                temp += resultat;
            }
            resultat = temp;
        }
        return resultat;
    }

    // Mètode per calcular el nombre de dígits d'un nombre
    public int nombreDigits(int n) {
        int digits = 0;
        if (n == 0) return 1;
        while (n != 0) {
            n /= 10;
            digits++;
        }
        return digits;
    }

    // Mètode per mostrar el menú
    public void mostrarMenu() {
        System.out.println("\nMenú de SuperCalculadora:");
        System.out.println("1. Suma dels primers n números");
        System.out.println("2. Factorial d'un nombre");
        System.out.println("3. Suma dels quadrats dels primers n números");
        System.out.println("4. Potència d'un nombre");
        System.out.println("5. Nombre de dígits d'un nombre");
        System.out.println("6. Sortir");
    }

}
