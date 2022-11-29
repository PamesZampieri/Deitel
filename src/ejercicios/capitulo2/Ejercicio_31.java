/*
(Tabla de cuadrados y cubos) Utilizando sólo las técnicas de programación que aprendió en este capítulo,
escriba una aplicación que calcule los cuadrados y cubos de los números del 0 al 10, y que imprima los valores
resultantes en formato de tabla, como se muestra a continuación.
numero cuadrado cubo
0     0     0
1     1     1
2     4     8
3     9     27
4     16    64
5     25    125
6     36    216
7     49    343
8     64    512
9     81    729
10    100   1000
 */

package ejercicios.capitulo2;

public class Ejercicio_31 {
    public static void main(String[] args) {

        System.out.printf("0\t\t\t%d\t\t\t%d%n", 0, 0);

        System.out.printf("1\t\t\t%d\t\t\t%d%n", 1, 1);

        System.out.printf("2\t\t\t%d\t\t\t%d%n", 2 * 2, 2 * 2 * 2);

        System.out.printf("3\t\t\t%d\t\t\t%d%n", 3 * 3, 3 * 3 * 3);

        System.out.printf("4\t\t\t%d\t\t\t%d%n", 4 * 4, 4 * 4 * 4);

        System.out.printf("5\t\t\t%d\t\t\t%d%n", 5 * 5, 5 * 5 * 5);

        System.out.printf("6\t\t\t%d\t\t\t%d%n", 6 * 6, 6 * 6 * 6);

        System.out.printf("7\t\t\t%d\t\t\t%d%n", 7 * 7, 7 * 7 * 7);

        System.out.printf("8\t\t\t%d\t\t\t%d%n", 8 * 8, 8 * 8 * 8);

        System.out.printf("9\t\t\t%d\t\t\t%d%n", 9 * 9, 9 * 9 * 9);

        System.out.printf("10\t\t\t%d\t\t\t%d%n", 10 * 10, 10 * 10 * 10);
    }
}
