/*
4.29 (Cuadrado de asteriscos) Escriba una aplicación que pida al usuario que introduzca el tamaño del lado de
un cuadrado y que muestre un cuadrado hueco de ese tamaño, compuesto de asteriscos. Su programa debe funcionar
con cuadrados que tengan lados de todas las longitudes entre 1 y 20.
 */

package ejercicios.capitulo4;

import java.util.Scanner;

public class ejercicio_4_29_CuadradoDeAsteriscosSolucionDos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escriba la medida de lado de un cuadrado: ");
        int lado = entrada.nextInt();

        while (lado < 1 || lado > 20) {
            System.out.print("Escriba la medida de lado de un cuadrado: ");
            lado = entrada.nextInt();
        }

        int i = 0;
        while (i < lado) {
            System.out.print("*");
            i++;
        }
        System.out.println();

        if (lado > 1) {
            i = 0;
            while (i < lado - 2) {
                System.out.print("*");
                int j = 0;
                while (j < lado - 2) {
                    System.out.print(" ");
                    j++;
                }
                System.out.print("*");
                System.out.println();
                i++;
            }

            i = 0;
            while (i < lado) {
                System.out.print("*");
                i++;
            }
        }
    }
}
