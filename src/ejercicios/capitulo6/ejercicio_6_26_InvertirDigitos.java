/*
6.26 (Invertir dígitos) Escriba un método que tome un valor entero y devuelva el número con sus dígitos invertidos.
Por ejemplo, para el número 7631, el método debe regresar 1367. Incorpore el método en una aplicación que
reciba como entrada un valor del usuario y muestre el resultado.
*/

package ejercicios.capitulo6;

import java.util.Scanner;

public class ejercicio_6_26_InvertirDigitos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Este programa imprime un valor entero que se intoduzca de forma invertida.");
        System.out.print("Escriba un número entero: ");
        int numero = entrada.nextInt();

        invertirDigitos(numero);
    }

    public static void invertirDigitos(int numero) {
        while (numero != 0) {
            System.out.print(numero % 10);
            numero /= 10;
        }
    }
}