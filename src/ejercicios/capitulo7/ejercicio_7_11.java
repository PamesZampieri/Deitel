/*
7.11 Escriba instrucciones que realicen las siguientes operaciones con arreglos unidimensionales:
a) Asignar cero a los 10 elementos del arreglo cuentas de tipo entero.
b) Sumar uno a cada uno de los 15 elementos del arreglo bono de tipo entero.
c) Imprima los cinco valores del arreglo mejoresPuntuaciones de tipo entero en formato de columnas.
*/

package ejercicios.capitulo7;

import java.util.Arrays;

public class ejercicio_7_11 {
    public static void main(String[] args) {
        // a)
        int[] cuentas = new int[10];

        for (int i = 0; i < cuentas.length; i++) {
            cuentas[i] = 0;
        }

        // a)
        Arrays.fill(cuentas, 0);

        mostrarArreglo(cuentas, "cuentas");
        System.out.println();

        // b)
        int[] bono = {13, 12, 3, 5, 6, 78, 90, 100, 34, 3, 45, 89, 1, 25, 60};

        for (int i = 0; i < bono.length; i++) {
            bono[i]++;
        }

        mostrarArreglo(bono, "bono");
        System.out.println();

        // c)
        int[] mejoresPuntuaciones = {100, 90, 80, 70, 60};
        System.out.println("MEJORES PUNTUACIONES");
        System.out.printf("%d%11d%10d%10d%10d%n", 1, 2, 3, 4, 5);

        Arrays.sort(mejoresPuntuaciones);
        for (int puntuacion : mejoresPuntuaciones) {
            System.out.printf("%d        ", puntuacion);
        }
    }

    public static void mostrarArreglo(int[] arreglo, String nombreArreglo) {
        System.out.printf("El arreglo %s tiene los siguientes elementos:%n", nombreArreglo);

        for (int elemento : arreglo) {
            System.out.printf("%d ", elemento);
        }

        System.out.println();
    }
}
