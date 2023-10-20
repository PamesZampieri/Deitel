//7.9 Considere un arreglo entero t de dos por tres.

package ejercicios.capitulo7;

import java.util.Scanner;

public class ejercicio_7_9_ArregloT {
    public static void main(String[] args) {
        //a) Escriba una instrucción que declare y cree a t.
        int[][] t = new int[2][3];

        //b) ¿Cuántas filas tiene t? Tiene 2 filas.
        //c) ¿Cuántas columnas tiene t? Tiene 3 columnas.
        //d) ¿Cuántos elementos tiene t? Tiene 6 elementos.
        /*
        e) Escriba expresiones de acceso para todos los elementos en la fila 1 de t.
        t[1][0];
        t[1][1];
        t[1][2];

        //f) Escriba expresiones de acceso para todos los elementos en la columna 2 de t.
        t[0][2];
        t[1][2];

        //g) Escriba una sola instrucción que asigne cero al elemento de t en la fila 0 y la columna 1.
        t[0][1] = 0;
         */

        //h) Escriba instrucciones individuales para inicializar cada elemento de t con cero.
        t[0][0] = 0;
        t[0][1] = 0;
        t[0][2] = 0;
        t[1][0] = 0;
        t[1][1] = 0;
        t[1][2] = 0;

        //i) Escriba una instrucción for anidada que inicialice cada elemento de t con cero.
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                t[i][j] = 0;
            }
        }

        for (int[] numero : t) {
            for (int elemento : numero) {
                System.out.printf("%d ", elemento);
            }
        }

        //j) Escriba una instrucción for anidada que reciba como entrada del usuario los valores de los elementos de t.
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n\nEscriba a continuación el valor de cada uno de los elementos de la tabla: ");
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.printf("Elemento de fila %d, columna %d: ", i, j);
                t[i][j] = entrada.nextInt();
            }
        }

        //k) Escriba una serie de instrucciones que determine e imprima el valor más pequeño en t.
        int menor = t[0][0];
        int mayor = t[0][0];

        for (int[] i : t) {
            for (int j : i) {
                if (j < menor) {
                    menor = j;
                }

                if (j > mayor) {
                    mayor = j;
                }
            }
        }

        System.out.printf("El menor de todos los números en la tabla es: %d%n", menor);
        System.out.printf("El mayor de todos los números en la tabla es: %d%n", mayor);

        //l) Escriba una sola instrucción printf que muestre los elementos de la primera fila de t.
        System.out.printf("Los elementos de la primera fila son: %d %d %d%n", t[0][0], t[0][1], t[0][2]);

        //m) Escriba una instrucción que totalice los elementos de la tercera columna de t. No utilice repetición.
        System.out.printf("La suma de los elementos de la tercera columna son: %d%n%n", t[0][2] + t[1][2]);

        /*
        n) Escriba una serie de instrucciones para imprimir el contenido de t en formato tabular. Mencione los índices
        de columna como encabezados a lo largo de la parte superior, y enumere los índices de fila a la izquierda de
        cada fila.
         */

        System.out.print("\\");
        for (int i = 0; i < t[0].length; i++) {
            System.out.printf("%5d", i);
        }
        System.out.println();

        for (int i = 0; i < t.length; i++) {
            System.out.printf("%d", i);
            for (int j = 0; j < t[i].length; j++) {
                System.out.printf("%5d", t[i][j]);
            }
            System.out.println();
        }
    }
}