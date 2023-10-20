/*
5.25 (Programa modificado para imprimir rombos) Modifique la aplicación que escribió en el ejercicio 5.24,
para que lea un número impar en el rango de 1 a 19, de manera que especifique el número de filas en el rombo. Su
programa debe entonces mostrar un rombo del tamaño apropiado.
 */

package ejercicios.capitulo5;

import java.util.Scanner;

public class ejercicio_5_25_ImprimirRombosModificado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escriba el número de filas de un rombo (en el rango de 1 al 19): ");
        int filas = entrada.nextInt();
        int cantidadDeAsteriscos = 1;
        int cantidadDeEspacios = filas / 2;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < cantidadDeEspacios; j++) {
                System.out.print(' ');
            }
            for (int j = 0; j < cantidadDeAsteriscos; j++) {
                System.out.print('*');
            }
            if (i < filas / 2) {
                cantidadDeEspacios--;
                cantidadDeAsteriscos += 2;
            } else {
                cantidadDeEspacios++;
                cantidadDeAsteriscos -= 2;
            }
            System.out.println();
        }
    }
}