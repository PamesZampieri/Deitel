/*
(Comparación de enteros) Escriba una aplicación que pida al usuario que escriba dos enteros, que obtenga
los números del usuario y muestre el número más grande, seguido de las palabras “es más grande”. Si los números son
iguales, imprima el mensaje “Estos números son iguales”. Utilice las técnicas que se muestran en la figura 2.15.
 */

package ejercicios.capitulo2;

import java.util.Scanner;

public class Ejercicio_16 {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.print("Escriba el primer entero: ");
        numero1 = entrada.nextInt();

        System.out.print("Escriba el segundo entero: ");
        numero2 = entrada.nextInt();

        if (numero1 > numero2) {
            System.out.printf("%d es mas grande%n", numero1);
        }

        if (numero2 > numero1) {
            System.out.printf("%d es mas grande%n", numero2);
        }

        if (numero1 == numero2) {
            System.out.println("Estos numeros son iguales");
        }
    }
}
