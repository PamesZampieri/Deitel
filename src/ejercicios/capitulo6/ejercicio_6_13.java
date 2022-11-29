/*
6.13 Escriba instrucciones que impriman un número al azar de cada uno de los siguientes conjuntos:
*/

package ejercicios.capitulo6;

import java.security.SecureRandom;

public class ejercicio_6_13 {
    public static void main(String[] args) {
        SecureRandom numerosAleatorios = new SecureRandom();

        /*
        a) 2, 4, 6, 8, 10.
        for (int contador = 1; contador <= 20; contador++) {
            int numero = 2 + 2 * numerosAleatorios.nextInt(5);
            System.out.printf("%d ", numero);

            if (contador % 5 == 0) {
                System.out.println();
            }
        }

        b) 3, 5, 7, 9, 11.
        for (int contador = 1; contador <= 20; contador++) {
            int numero = 3 + 2 * numerosAleatorios.nextInt(5);
            System.out.printf("%d ", numero);

            if (contador % 5 == 0) {
                System.out.println();
            }
        }

        c) 6, 10, 14, 18, 22.
         */
        for (int contador = 1; contador <= 20; contador++) {
            int numero = 6 + 4 * numerosAleatorios.nextInt(5);
            System.out.printf("%d ", numero);

            if (contador % 5 == 0) {
                System.out.println();
            }
        }
    }
}
