/*
(Aritmética: menor y mayor) Escriba una aplicación que reciba tres enteros del usuario y muestre la suma,
promedio, producto, menor y mayor de esos números. Utilice las técnicas que se muestran en la figura 2.15 [nota: el
cálculo del promedio en este ejercicio debe dar como resultado una representación entera del promedio. Por lo tanto,
si la suma de los valores es 7, el promedio debe ser 2, no 2.3333...].
 */

package ejercicios.capitulo2;

import java.util.Scanner;

public class Ejercicio_17 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int numero1;
        int numero2;
        int numero3;

        System.out.print("Escriba el primer entero: ");
        numero1 = entrada.nextInt();

        System.out.print("Escriba el segundo entero: ");
        numero2 = entrada.nextInt();

        System.out.print("Escriba el tercer entero: ");
        numero3 = entrada.nextInt();

        System.out.printf("La suma es: %d%n", numero1 + numero2 + numero3);

        System.out.printf("El promedio es: %d%n", (numero1 + numero2 + numero3) / 3);

        System.out.printf("La multiplicacion es: %d%n", numero1 * numero2 * numero3);

        if (numero1 < numero2) {
            if (numero1 < numero3) {
                System.out.printf("%d es el menor%n", numero1);
            }
        }

        if (numero2 < numero1) {
            if (numero2 < numero3) {
                System.out.printf("%d es el menor%n", numero2);
            }
        }

        if (numero3 < numero1) {
            if (numero3 < numero2) {
                System.out.printf("%d es el menor%n", numero3);
            }
        }

        if (numero1 > numero2) {
            if (numero1 > numero3) {
                System.out.printf("%d es el mayor%n", numero1);
            }
        }

        if (numero2 > numero1) {
            if (numero2 > numero3) {
                System.out.printf("%d es el mayor%n", numero2);
            }
        }

        if (numero3 > numero1) {
            if (numero3 > numero2) {
                System.out.printf("%d es el mayor%n", numero3);
            }
        }
    }
}