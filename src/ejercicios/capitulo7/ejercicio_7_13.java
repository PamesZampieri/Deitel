/*
7.13 Etiquete los elementos del arreglo bidimensional ventas de tres por cinco, para indicar el orden en el que se
establecen en cero, mediante el siguiente fragmento de programa:
for (int fila = 0; fila < ventas.length; fila++)
{
for (int col = 0; col < ventas[fila].length; col++)
 {
 ventas[fila][col] = 0;
 }
}
*/

package ejercicios.capitulo7;

public class ejercicio_7_13 {
    public static void main(String[] args) {
        int[][] ventas = new int[3][5];
        int orden = 1;
        System.out.printf("%s%25s%n", "ARREGLO", "ORDEN");

        for (int fila = 0; fila < ventas.length; fila++) {
            for (int col = 0; col < ventas[fila].length; col++) {
                ventas[fila][col] = 0;

                System.out.printf("ventas[%d][%d]%20d%n", fila, col, orden);
                orden++;
            }
        }
    }
}