/*
6.14 (Exponenciación) Escriba un método llamado enteroPotencia(base,exponente) que devuelva el valor de
base exponente.
Por ejemplo, enteroPotencia(3,4) calcula 34 (o 3 * 3 * 3 * 3). Suponga que exponente es un entero positivo distinto de
cero y que base es un entero. Use una instrucción for o while para controlar el cálculo. No utilice ningún
método de la clase Math. Incorpore este método en una aplicación que lea valores enteros para base y exponente, y que
realice el cálculo con el método enteroPotencia.
*/

package ejercicios.capitulo6;

import java.util.Scanner;

public class ejercicio_6_14_Exponenciacion {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Este programa calcula la potencia de un número entero:");
        System.out.print("Escriba un número entero para la base: ");
        int base = entrada.nextInt();
        System.out.print("Escriba un número entero positivo para el exponente: ");
        int exponente = entrada.nextInt();

        System.out.printf("La potencia de %d ^ %d es igual a: %d", base, exponente, enteroPotencia(base, exponente));
    }

    public static int enteroPotencia(int base, int exponente) {
        int potencia = base;

        for (int i = 1; i < exponente; i++) {
            potencia *= base;
        }

        return potencia;
    }
}
