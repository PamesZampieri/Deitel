/*
4.35 (Lados de un triángulo) Escriba una aplicación que lea tres valores distintos de cero introducidos por el
usuario, y que determine e imprima si podrían representar los lados de un triángulo.
 */

package ejercicios.capitulo4;

import java.util.Scanner;

public class ejercicio_4_35_LadosDeUnTriangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escriba el lado de un triángulo: ");
        int lado1 = entrada.nextInt();

        System.out.print("Escriba el lado de un triángulo: ");
        int lado2 = entrada.nextInt();

        System.out.print("Escriba el lado de un triángulo: ");
        int lado3 = entrada.nextInt();

        int a = lado1;
        int b = lado2;
        int c = lado3;

        if (lado2 >= lado1) {
            if (lado2 >= lado3) {
                a = lado2;
                b = lado1;
                c = lado3;
            }
        }

        if (lado3 >= lado1) {
            if (lado3 >= lado2) {
                a = lado3;
                b = lado2;
                c = lado1;
            }
        }

        if (a < b + c) {
            System.out.println("Es un triángulo válido.");
        } else {
            System.out.println("No es un triángulo válido.");
        }
    }
}
