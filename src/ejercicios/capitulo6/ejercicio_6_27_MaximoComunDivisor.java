/*
6.27 (Máximo común divisor) El máximo común divisor (MCD) de dos enteros es el entero más grande que puede
dividir de manera uniforme a cada uno de los dos números. Escriba un método llamado mcd que devuelva el máximo
común divisor de dos enteros. [Sugerencia: tal vez sea conveniente que utilice el algoritmo de Euclides. Puede encontrar
información acerca de este algoritmo en es.wikipedia.org/wiki/Algoritmo_de_Euclides]. Incorpore el método en
una aplicación que reciba como entrada dos valores del usuario y muestre el resultado.
*/

package ejercicios.capitulo6;

import java.util.Scanner;

public class ejercicio_6_27_MaximoComunDivisor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escriba un número entero: ");
        int numero1 = entrada.nextInt();
        System.out.print("Escriba otro número entero: ");
        int numero2 = entrada.nextInt();
        System.out.printf("El Máximo Común Divisor utilizando mi método es: %d y con el método de Euclides es: %d.",
                mcd(numero1, numero2), mcdEuclides(numero1, numero2));
    }

    public static int mcd(int numero1, int numero2) {
        int menor = Math.min(numero1, numero2);
        int mayor = Math.max(numero1, numero2);

        for (int i = menor; i > 1; i--) {
            if (mayor % i == 0 && menor % i == 0) {
                return i;
            }
        }

        return 1;
    }

    public static int mcdEuclides(int numero1, int numero2) {
        int menor = Math.min(numero1, numero2);
        int mayor = Math.max(numero1, numero2);

        while (mayor % menor != 0) {
            int resto = mayor % menor;
            mayor = menor;
            menor = resto;
        }

        return menor;
    }
}