package ejercicios.capitulo5;

import java.util.Scanner;

public class ejerciciosRepasoFor {
    public static void main(String[] args) {
        /* a)Un for que imprima 5 *:
        for (int i = 0; i < 5; i++) {
            System.out.print('*');
        }
        System.out.println();

        b)Un for que imprima: *
         *
         *
         *
         *

        for (int i = 0; i < 5; i++) {
            System.out.println('*');
        }
        System.out.println();

        /* c)Un for que imprima: ***
         ***
         ***
         ***

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println();

        /* d) Un for que imprima n * m. En el caso de abajo el usuario ingresó n=2 y m=3:
         ***
         ***

        Scanner entrada = new Scanner(System.in);

        System.out.print("Escriba el valor de la base de su rectángulo: ");
        int m = entrada.nextInt();
        System.out.print("Escriba el valor de la altura de su rectángulo: ");
        int n = entrada.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        /* e) Un for que imprima:
        *        *
        ***    ***
        **********

        int n = 1;
        int m = 8;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print('*');
            }
            for (int j = 0; j < m; j++) {
                System.out.print(' ');
            }
            for (int j = 0; j < n; j++) {
                System.out.print('*');
            }
            System.out.println();
            n += 2;
            m -= 4;
        }
        f) Un for que imprima:
        e*Holaeeeee*
        e**Holaeeee*
        e***Holaeee*
        e****Holaee*
        e*****Holae*
         */

        for (int i = 0; i < 5; i++) {
            System.out.print(' ');
            for (int j = 0; j <= i; j++) {
                System.out.print('*');
            }
            System.out.print("Hola");
            for (int j = 5; j > i; j--) {
                System.out.print(' ');
            }
            System.out.println('*');
        }
    }
}
