/*
 (Aritmética) Escriba una aplicación que pida al usuario que escriba dos números, que obtenga los números
del usuario e imprima la suma, producto, diferencia y cociente (división) de los números. Use las técnicas que se
muestran en la figura 2.7.
 */

package ejercicios.capitulo2;

import java.util.Scanner;

public class Ejercicio_15 {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.print("Escriba el primer entero: ");
        numero1 = entrada.nextInt();

        System.out.print("Escriba el segundo entero: ");
        numero2 = entrada.nextInt();

        System.out.printf("La suma es: %d%n", numero1 + numero2);

        System.out.printf("La multiplicacion es: %d%n", numero1 * numero2);

        System.out.printf("La resta es: %d%n", numero1 - numero2);

        System.out.printf("La division es: %d%n", numero1 / numero2);
    }
}