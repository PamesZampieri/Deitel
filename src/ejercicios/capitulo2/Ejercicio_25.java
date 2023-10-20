/*
(Par o impar) Escriba una aplicación que lea un entero y que determine e imprima si es impar o par [sugerencia: use el
 operador residuo. Un número par es un múltiplo de 2. Cualquier múltiplo de 2 deja un residuo de 0 cuando se divide
 entre 2
 */

package ejercicios.capitulo2;

import java.util.Scanner;

public class Ejercicio_25 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero1;

        System.out.print("Escriba el numero entero: ");
        numero1 = entrada.nextInt();

        if (numero1 % 2 == 0) {
            System.out.printf("%d es par%n", numero1);
        }

        if (numero1 % 2 != 0) {
            System.out.printf("%d es impar%n", numero1);
        }
    }
}