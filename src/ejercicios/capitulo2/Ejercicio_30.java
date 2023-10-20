/*
(Separación de los dígitos en un entero) Escriba una aplicación que reciba del usuario un número compuesto por cinco
dígitos, que separe ese número en sus dígitos individuales y los imprima, cada uno separado de los demás
por tres espacios. Por ejemplo, si el usuario escribe el número 42339, el programa debe imprimir

4   2   3   3   9

Suponga que el usuario escribe el número correcto de dígitos. ¿Qué ocurre cuando escribe un número con más
de cinco dígitos? ¿Qué ocurre cuando escribe un número con menos de cinco dígitos? [Sugerencia:es posible hacer este
ejercicio con las técnicas que aprendió en este capítulo. Necesitará utilizar las operaciones de división y residuo
para “seleccionar” cada dígito].
 */

package ejercicios.capitulo2;

import java.util.Scanner;

public class Ejercicio_30 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;

        System.out.print("Escriba un numero de 5 digitos: ");
        numero = entrada.nextInt();

        System.out.printf("%d   ", numero / 10000);

        System.out.printf("%d   ", numero / 1000 % 10);

        System.out.printf("%d   ", numero / 100 % 10);

        System.out.printf("%d   ", numero / 10 % 10);

        System.out.printf("%d%n", numero % 10);
    }
}