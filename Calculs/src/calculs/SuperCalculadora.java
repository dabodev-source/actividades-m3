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
    // M�tode per calcular la suma dels primers n n�meros
    public int sumaPrimersNumeros(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
    }

    // M�tode per calcular el factorial d'un nombre
    public int calcularFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    // M�tode per calcular la suma dels quadrats dels primers n n�meros
    public int sumaQuadrats(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i * i;
        }
        return suma;
    }

    // M�tode per calcular la pot�ncia utilitzant sumes
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

    // M�tode per calcular el nombre de d�gits d'un nombre
    public int nombreDigits(int n) {
        int digits = 0;
        if (n == 0) return 1;
        while (n != 0) {
            n /= 10;
            digits++;
        }
        return digits;
    }

    // M�tode per mostrar el men�
    public void mostrarMenu() {
        System.out.println("\nMen� de SuperCalculadora:");
        System.out.println("1. Suma dels primers n n�meros");
        System.out.println("2. Factorial d'un nombre");
        System.out.println("3. Suma dels quadrats dels primers n n�meros");
        System.out.println("4. Pot�ncia d'un nombre");
        System.out.println("5. Nombre de d�gits d'un nombre");
        System.out.println("6. Sortir");
    }

}
