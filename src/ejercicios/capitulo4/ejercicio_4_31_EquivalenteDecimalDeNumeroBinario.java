/*
4.31 (Imprimir el equivalente decimal de un número binario) Escriba una aplicación que reciba como entrada
un entero que contenga sólo dígitos 0 y 1 (es decir, un entero binario), y que imprima su equivalente decimal.
[Sugerencia: use los operadores residuo y división para elegir los dígitos del número binario uno a la vez, de derecha a
izquierda. En el sistema numérico decimal, el dígito más a la derecha tiene un valor posicional de 1 y el siguiente
dígito a la izquierda tiene un valor posicional de 10, después 100, después 1 000, etcétera. El número decimal 234 puede
interpretarse como 4 * 1 + 3 * 10 + 2 * 100. En el sistema numérico binario, el dígito más a la derecha tiene un valor
posicional de 1, el siguiente dígito a la izquierda tiene un valor posicional de 2, luego 4, luego 8, etcétera.
El equivalente decimal del número binario 1011 es 1 * 1 + 0 * 2 + 1 * 4 + 1 * 8, o 1 + 0 + 4 + 8, o 13].
 */

package ejercicios.capitulo4;

import java.util.Scanner;

public class ejercicio_4_31_EquivalenteDecimalDeNumeroBinario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escriba un número binario (compuesto por 0-1): ");
        int numero = entrada.nextInt();
        int decimal = 0;
        int multiplicador = 1;
        System.out.println();

        while (numero > 0) {
            decimal += (numero % 10 * multiplicador);
            multiplicador *= 2;
            numero /= 10;
        }

        System.out.printf("El Número Decimal correspondiente para el Número Binario ingresado es: %d%n", decimal);
    }
}