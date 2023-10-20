/*
6.9 (Redondeo de números) El método Math.floor se puede usar para redondear un valor al siguiente entero;
por ejemplo, la instrucción
 y = Math.floor(x + 0.5);
redondea el número x al entero más cercano y asigna el resultado a y. Escriba una aplicación que lea valores double y
que utilice la instrucción anterior para redondear cada uno de los números a su entero más cercano. Para cada número
procesado, muestre tanto el número original como el redondeado.
*/

package ejercicios.capitulo6;

import java.util.Scanner;

public class ejercicio_6_9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escriba número decimal (-1 para terminar): ");
        double numero = entrada.nextDouble();

        while (numero != -1) {
            System.out.printf("El número ingresado es %.2f y redondeado es %.2f%n%n", numero, Math.floor(numero + 0.5));

            System.out.print("Escriba otro número decimal(-1 para terminar): ");
            numero = entrada.nextDouble();
        }
    }
}