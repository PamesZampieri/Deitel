/*
6.17 (Par o impar) Escriba un método llamado esPar que utilice el operador residuo (%) para determinar si un
entero dado es par. El método debe tomar un argumento entero y devolver true si el entero es par, y false en caso
contrario. Incorpore este método en una aplicación que reciba como entrada una secuencia de enteros (uno a la vez),
y que determine si cada uno es par o impar.
*/

package ejercicios.capitulo6;

import java.util.Scanner;

public class ejercicio_6_17_ParOImpar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escriba un número entero (presione -1 para terminar): ");
        int numero = entrada.nextInt();

        while (numero != -1) {
            System.out.print(esPar(numero) ? "Es par." : "Es impar.");
            System.out.println();

            System.out.print("Escriba un número entero (presione -1 para terminar): ");
            numero = entrada.nextInt();
        }
    }

    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
}