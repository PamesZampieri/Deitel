/*
4.30 (Palíndromos) Un palíndromo es una secuencia de caracteres que se lee igual al derecho y al revés. Por ejemplo,
cada uno de los siguientes enteros de cinco dígitos es un palíndromo: 12321, 55555, 45554 y 11611. Escriba una
aplicación que lea un entero de cinco dígitos y determine si es un palíndromo. Si el número no es de cinco dígitos, el
programa debe mostrar un mensaje de error y permitir al usuario que introduzca un nuevo valor.
 */

package ejercicios.capitulo4;

import java.util.Scanner;

public class ejercicio_4_30_Palindromos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escriba un número entero de 5 dígitos: ");
        int numero = entrada.nextInt();
        System.out.println();

        while (numero < 10000 || numero >= 100000) {
            System.out.println("Error! El número ingresado no tiene 5 dígitos.");
            System.out.println();

            System.out.print("Escriba un número entero de 5 dígitos: ");
            numero = entrada.nextInt();
            System.out.println();
        }

        int digito1 = numero / 10000;
        int digito2 = numero / 1000 % 10;
        int digito4 = numero / 10 % 10;
        int digito5 = numero % 10;


        if (digito1 == digito5) {
            if (digito2 == digito4) {
                System.out.printf("El número %d es un Palíndromo.%n", numero);
            } else {
                System.out.printf("El número ingresado %d no es un Palíndromo.%n", numero);
            }
        } else {
            System.out.printf("El número ingresado %d no es un Palíndromo.%n", numero);
        }
    }
}
