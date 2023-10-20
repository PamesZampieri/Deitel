//7.8 Escriba instrucciones en Java que realicen cada una de las siguientes tareas:

package ejercicios.capitulo7;

import java.util.Arrays;

public class ejercicio_7_8 {
    public static void main(String[] args) {
        //a) Mostrar el valor del elemento 6 del arreglo f.
        int[] f = new int[10];

        for (int i = 0; i < f.length; i++) {
            f[i] = i;
        }

        System.out.printf("El valor del elemento 6 del arreglo f es %d%n", f[6]);

        //b) Inicializar con 8 cada uno de los cinco elementos del arreglo entero unidimensional g.
        int[] g = new int[5];

        Arrays.fill(g, 8);

        mostrarArreglo("g", g);

        //c) Sumar el total de los 100 elementos del arreglo c de punto flotante.
        double[] c = new double[100];

        Arrays.fill(c, 1);

        double total = 0;

        for (double elemento : c) {
            total += elemento;
        }

        System.out.printf("El total de los elementos del arreglo c es: %.2f%n%n", total);

        //d) Copiar el arreglo a de 11 elementos en la primera porción del arreglo b, el cual contiene 34 elementos.
        int[] a = new int[11];
        Arrays.fill(a, 1);

        int[] b = new int[34];
        Arrays.fill(b, 2);

        System.out.println("Arreglos a y b antes del System.arraycopy: ");
        mostrarArreglo("a", a);
        mostrarArreglo("b", b);

        System.arraycopy(a, 0, b, 0, a.length);

        System.out.println("Arreglos a y b después del System.arraycopy: ");
        mostrarArreglo("a", a);
        mostrarArreglo("b", b);

        //e) Determinar e imprimir los valores menor y mayor contenidos en el arreglo w con 99 elementos de punto flotante.
        double[] w = new double[99];

        for (int i = 0; i < w.length; i++) {
            w[i] = i * 2;
        }

        double menor = w[0], mayor = w[0];

        for (int i = 0; i < w.length; i++) {
            if (w[i] < menor) {
                menor = w[i];
            }

            if (w[i] > mayor) {
                mayor = w[i];
            }
        }

        System.out.printf("En el arreglo w el menor valor es: %.2f%nEl mayor es: %.2f", menor,
                mayor);
    }

    public static void mostrarArreglo(String nombreArreglo, int[] arreglo) {
        System.out.printf("Arreglo %s: %n", nombreArreglo);

        for (int i = 0; i < arreglo.length; i++) {
            System.out.printf("Índice: %d Valor: %d%n", i, arreglo[i]);
        }
        System.out.println();
    }
}