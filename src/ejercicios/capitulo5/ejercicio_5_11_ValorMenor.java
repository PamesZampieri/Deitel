/*
5.11 (Buscar el valor menor) Escriba una aplicación que encuentre el menor de varios enteros. Suponga que el
primer valor leído especifica el número de valores que el usuario introducirá.
*/

package ejercicios.capitulo5;

import java.util.Scanner;

public class ejercicio_5_11_ValorMenor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduzca la cantidad de números enteros a evaluar: ");
        int n = entrada.nextInt();

        System.out.print("Introduzca un número: ");
        int menor = entrada.nextInt();

        for (int i = 0; i < n - 1; i++) {
            System.out.print("Introduzca un número: ");
            int numero = entrada.nextInt();

            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println();
        System.out.printf("El menor de los números enteros ingresados es: %d%n", menor);
    }
}