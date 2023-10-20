/*
6.12 Escriba instrucciones que asignen enteros aleatorios a la variable n en los siguientes rangos:
*/

package ejercicios.capitulo6;

import java.security.SecureRandom;

public class ejercicio_6_12 {
    public static void main(String[] args) {
        SecureRandom numerosAleatorios = new SecureRandom();

        //a) 1 ≤n ≤ 2.
        for (int contador = 1; contador <= 20; contador++) {
            int numero = 1 + numerosAleatorios.nextInt(2);
            System.out.printf("%d ", numero);

            if (contador % 5 == 0) {
                System.out.println();
            }
        }
        System.out.println();

        //b) 1 ≤n ≤ 100.
        for (int contador = 1; contador <= 20; contador++) {
            int numero = 1 + numerosAleatorios.nextInt(100);
            System.out.printf("%d ", numero);

            if (contador % 5 == 0) {
                System.out.println();
            }
        }
        System.out.println();

        //c) 0 ≤n ≤ 9.
        for (int contador = 1; contador <= 20; contador++) {
            int numero = numerosAleatorios.nextInt(10);
            System.out.printf("%d ", numero);

            if (contador % 5 == 0) {
                System.out.println();
            }
        }
        System.out.println();

        //d) 1000 ≤n ≤ 1112.
        for (int contador = 1; contador <= 20; contador++) {
            int numero = 1000 + numerosAleatorios.nextInt(112);
            System.out.printf("%d ", numero);

            if (contador % 5 == 0) {
                System.out.println();
            }
        }
        System.out.println();

        //e) –1 ≤n ≤ 1.
        for (int contador = 1; contador <= 20; contador++) {
            int numero = -1 + numerosAleatorios.nextInt(3);
            System.out.printf("%d ", numero);

            if (contador % 5 == 0) {
                System.out.println();
            }
        }
        System.out.println();

        //f) –3 ≤n ≤ 11.
        for (int contador = 1; contador <= 20; contador++) {
            int numero = -3 + numerosAleatorios.nextInt(15);
            System.out.printf("%d ", numero);

            if (contador % 5 == 0) {
                System.out.println();
            }
        }
    }
}