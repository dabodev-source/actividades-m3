/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculs;

import java.util.Scanner;

/**
 *
 * @author docto
 */
public class Calculs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        SuperCalculadora calculadora = new SuperCalculadora();
        int opcio;

        do {
            calculadora.mostrarMenu();
            System.out.print("\nSelecciona una opció: ");
            opcio = scanner.nextInt();

            switch (opcio) {
                case 1:
                    System.out.print("Introdueix un valor per n: ");
                    int n1 = scanner.nextInt();
                    System.out.println("La suma dels primers " + n1 + " números és: " + calculadora.sumaPrimersNumeros(n1));
                    break;
                case 2:
                    System.out.print("Introdueix un valor per calcular el factorial: ");
                    int n2 = scanner.nextInt();
                    System.out.println("El factorial de " + n2 + " és: " + calculadora.calcularFactorial(n2));
                    break;
                case 3:
                    System.out.print("Introdueix un valor per n: ");
                    int n3 = scanner.nextInt();
                    System.out.println("La suma dels quadrats dels primers " + n3 + " números és: " + calculadora.sumaQuadrats(n3));
                    break;
                case 4:
                    System.out.print("Introdueix la base: ");
                    int base = scanner.nextInt();
                    System.out.print("Introdueix l'exponent: ");
                    int exponent = scanner.nextInt();
                    System.out.println("El resultat de " + base + "^" + exponent + " és: " + calculadora.calcularPotencia(base, exponent));
                    break;
                case 5:
                    System.out.print("Introdueix un nombre: ");
                    int n5 = scanner.nextInt();
                    System.out.println("El nombre de dígits de " + n5 + " és: " + calculadora.nombreDigits(n5));
                    break;
                case 6:
                    System.out.println("Sortint del programa. Adéu!");
                    break;
                default:
                    System.out.println("Opció no vàlida. Torna-ho a intentar.");
            }
        } while (opcio != 6);

 
    }
    
}
