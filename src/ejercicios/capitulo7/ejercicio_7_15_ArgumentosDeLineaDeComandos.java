/*
7.15 (Argumentos de línea de comandos) Modifique la figura 7.2, de manera que el tamaño del arreglo se especifique
mediante el primer argumento de línea de comandos. Si no se suministra un argumento de línea de comandos,
use 10 como el valor predeterminado del arreglo.
*/

package ejercicios.capitulo7;

public class ejercicio_7_15_ArgumentosDeLineaDeComandos {
    public static void main(String[] args) {
        int longitudArreglo = 10;

        if (args.length != 0) {
            longitudArreglo = Integer.parseInt(args[0]);
        }

        int[] arreglo = new int[longitudArreglo];

        System.out.printf("%s%8s%n", "Indice", "Valor");

        for (int i = 0; i < arreglo.length; i++) {
            System.out.printf("%5d%8d%n", i, arreglo[i]);
        }
    }
}