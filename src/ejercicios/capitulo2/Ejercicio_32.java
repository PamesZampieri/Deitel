/*
(Valores negativos, positivos y cero) Escriba un programa que reciba cinco números, y que determine e imprima la
cantidad de números negativos, positivos, y la cantidad de ceros recibidos.
 */

package ejercicios.capitulo2;

import java.util.Scanner;

public class Ejercicio_32 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero1;
        int numero2;
        int numero3;
        int numero4;
        int numero5;
        int cantidadNegativos = 0;
        int cantidadPositivos = 0;
        int cantidadCeros = 0;

        System.out.print("Escriba el primer numero: ");
        numero1 = entrada.nextInt();

        System.out.print("Escriba el segundo numero: ");
        numero2 = entrada.nextInt();

        System.out.print("Escriba el tercer numero: ");
        numero3 = entrada.nextInt();

        System.out.print("Escriba el cuarto numero: ");
        numero4 = entrada.nextInt();

        System.out.print("Escriba el quinto numero: ");
        numero5 = entrada.nextInt();

        if (numero1 < 0) {
            cantidadNegativos = cantidadNegativos + 1;
        }
        if (numero2 < 0) {
            cantidadNegativos = cantidadNegativos + 1;
        }
        if (numero3 < 0) {
            cantidadNegativos = cantidadNegativos + 1;
        }
        if (numero4 < 0) {
            cantidadNegativos = cantidadNegativos + 1;
        }
        if (numero5 < 0) {
            cantidadNegativos = cantidadNegativos + 1;
        }

        if (numero1 > 0) {
            cantidadPositivos = cantidadPositivos + 1;
        }
        if (numero2 > 0) {
            cantidadPositivos = cantidadPositivos + 1;
        }
        if (numero3 > 0) {
            cantidadPositivos = cantidadPositivos + 1;
        }
        if (numero4 > 0) {
            cantidadPositivos = cantidadPositivos + 1;
        }
        if (numero5 > 0) {
            cantidadPositivos = cantidadPositivos + 1;
        }

        if (numero1 == 0) {
            cantidadCeros = cantidadCeros + 1;
        }
        if (numero2 == 0) {
            cantidadCeros = cantidadCeros + 1;
        }
        if (numero3 == 0) {
            cantidadCeros = cantidadCeros + 1;
        }
        if (numero4 == 0) {
            cantidadCeros = cantidadCeros + 1;
        }
        if (numero5 == 0) {
            cantidadCeros = cantidadCeros + 1;
        }

        System.out.printf("La cantidad de numeros negativos es %d%n", cantidadNegativos);
        System.out.printf("La cantidad de numeros positivos es %d%n", cantidadPositivos);
        System.out.printf("La cantidad de ceros es %d%n", cantidadCeros);
    }
}