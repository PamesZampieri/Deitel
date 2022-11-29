/*
4.29 (Cuadrado de asteriscos) Escriba una aplicación que pida al usuario que introduzca el tamaño del lado de
un cuadrado y que muestre un cuadrado hueco de ese tamaño, compuesto de asteriscos. Su programa debe funcionar
con cuadrados que tengan lados de todas las longitudes entre 1 y 20.
 */

package ejercicios.capitulo4;

import java.util.Scanner;

public class ejercicio_4_29_CuadradoDeAsteriscos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escriba la medida de lado de un cuadrado: ");
        int lado = entrada.nextInt();

        while (lado < 1 || lado > 20) {
            System.out.print("Escriba la medida de lado de un cuadrado: ");
            lado = entrada.nextInt();
        }

        int fila = lado;

        while (fila >= 1) {
            int columna = lado;
            while (columna >= 1) {
                if (fila == lado) {
                    System.out.print("*");
                } else if (fila == 1) {
                    System.out.print("*");
                }

                if (fila < lado) {
                    if (fila > 1) {
                        if (columna == lado) {
                            System.out.print("*");
                        }
                        if (columna == 1) {
                            System.out.print("*");
                        }
                        if (columna < lado) {
                            if (columna > 1) {
                                System.out.print(" ");
                            }
                        }
                    }
                }
                columna--;
            }
            System.out.println();
            fila--;
        }
    }
}
