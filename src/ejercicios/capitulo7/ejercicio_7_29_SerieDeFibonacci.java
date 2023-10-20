/*
7.29 (Serie de Fibonacci) La serie de Fibonacci 0,1,1,2,3,5,8,13,21,... empieza con los términos 0 y 1, y tiene la
propiedad de que cada término sucesivo es la suma de los dos términos anteriores.
*/

package ejercicios.capitulo7;

import java.util.Scanner;

public class ejercicio_7_29_SerieDeFibonacci {
    public static void main(String[] args) {
        /*
        a) Escriba un método llamado fibonacci(n) que calcule el enésimo número de Fibonacci. Incorpore este método en
        una aplicación que permita al usuario introducir el valor de n.
        */

        Scanner entrada = new Scanner(System.in);

        System.out.print("Escriba la posición del número que quiere conocer de la Serie de Fibonacci: ");
        int numero = entrada.nextInt();

        System.out.printf("El número es: %d%n%n", fibonacciEnteros(numero));

        /*
        b) Determine el número de Fibonacci más grande que puede imprimirse en su sistema.
        c) Modifique la aplicación que escribió en la parte (a), de manera que utilice double en vez de int para calcular
        y devolver números de Fibonacci, y utilice esta aplicación modificada para repetir el inciso (b).
        */

        System.out.printf("%s%n", "SERIE DE FIBONACCI EN ENTEROS: ");

        for (int i = 0; i <= 50; i++) {
            System.out.printf("%2d: %,d%n", i, fibonacciEnteros(i));
        }

        System.out.printf("%n%s%n", "SERIE DE FIBONACCI EN NÚMEROS FLOTANTES: ");

        for (int i = 0; i <= 50; i++) {
            System.out.printf("%2d: %,.2f%n", i, fibonacciFlotantes(i));
        }
    }

    private static int fibonacciEnteros(int numero) {
        int a = 0;
        int b = 1;
        int aux;
        int resultado = a + b;

        if (numero == 0 || numero == 1) {
            return numero;
        }

        for (int i = 0; i < numero - 2; i++) {
            aux = b;
            b += a;
            a = aux;

            resultado = a + b;
        }

        return resultado;
    }

    private static double fibonacciFlotantes(int numero) {
        int a = 0;
        int b = 1;
        int aux;
        double resultado = a + b;

        if (numero == 0 || numero == 1) {
            return numero;
        }

        for (int i = 0; i < numero - 2; i++) {
            aux = b;
            b += a;
            a = aux;

            resultado = a + b;
        }

        return resultado;
    }
}