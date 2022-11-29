/*
5.16 (Programa para imprimir gráficos de barra) Una aplicación interesante de las computadoras es la visualización de
gráficos convencionales y de barra. Escriba una aplicación que lea cinco números, cada uno entre 1 y
30. Por cada número leído, su programa debe mostrar el mismo número de asteriscos adyacentes. Por ejemplo,
si su programa lee el número 7, debe mostrar *******. Muestre las barras de asteriscos después de leer los cinco
números.
 */

package ejercicios.capitulo5;

import java.util.Scanner;

public class ejercicio_5_16_ImprimirGraficosDeBarra {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escriba un número del 1 al 30: ");
        int numero1 = entrada.nextInt();
        System.out.print("Escriba un número del 1 al 30: ");
        int numero2 = entrada.nextInt();
        System.out.print("Escriba un número del 1 al 30: ");
        int numero3 = entrada.nextInt();
        System.out.print("Escriba un número del 1 al 30: ");
        int numero4 = entrada.nextInt();
        System.out.print("Escriba un número del 1 al 30: ");
        int numero5 = entrada.nextInt();
        System.out.println();

        for (int i = 0; i < numero1; i++) {
            System.out.print('*');
        }
        System.out.println();

        for (int i = 0; i < numero2; i++) {
            System.out.print('*');
        }
        System.out.println();

        for (int i = 0; i < numero3; i++) {
            System.out.print('*');
        }
        System.out.println();

        for (int i = 0; i < numero4; i++) {
            System.out.print('*');
        }
        System.out.println();

        for (int i = 0; i < numero5; i++) {
            System.out.print('*');
        }
    }
}
