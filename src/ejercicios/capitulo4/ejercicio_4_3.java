/*
Escriba cuatro instrucciones distintas en Java, en donde cada una sume 1 a la variable entera x.
 */

package ejercicios.capitulo4;

import java.util.Scanner;

public class ejercicio_4_3 {
    public static void main(String[] args) {
        int x = 0;
        System.out.printf("El valor de x es: %d%n", x);

        x = x + 1;
        x += 1;
        x++;
        ++x;

        System.out.printf("El valor de x es: %d%n", x);
    }
}