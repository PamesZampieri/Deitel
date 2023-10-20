/*
(Múltiplos) Escriba una aplicación que lea dos enteros, determine si el primero es un múltiplo del segundo e
imprima el resultado. [Sugerencia: use el operador residuo].
 */

package ejercicios.capitulo2;

import java.util.Scanner;

public class Ejercicio_26 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.print("Escriba el primer entero: ");
        numero1 = entrada.nextInt();

        System.out.print("Escriba el segundo entero: ");
        numero2 = entrada.nextInt();

        if (numero1 % numero2 == 0) {
            System.out.printf("%d es multiplo de %d%n", numero1, numero2);
        }

        if (numero1 % numero2 != 0) {
            System.out.printf("%d no es multiplo de %d%n", numero1, numero2);
        }
    }
}