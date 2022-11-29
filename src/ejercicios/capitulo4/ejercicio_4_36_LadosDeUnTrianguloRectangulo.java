/*
4.36 (Lados de un triángulo rectángulo) Escriba una aplicación que lea tres enteros distintos de cero, y luego
determine e imprima si éstos podrían representar los lados de un triángulo rectángulo.
*/

package ejercicios.capitulo4;

import java.util.Scanner;

public class ejercicio_4_36_LadosDeUnTrianguloRectangulo {
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

        if (b * b + c * c == a * a) {
            System.out.println("Es un triángulo rectángulo.");
        } else {
            System.out.println("No es un triángulo rectángulo.");
        }
    }
}
