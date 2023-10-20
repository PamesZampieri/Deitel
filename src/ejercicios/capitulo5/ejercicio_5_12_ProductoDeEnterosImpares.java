/*
5.12 (Calcular el producto de enteros impares) Escriba una aplicación que calcule el producto de los enteros
impares del 1 al 15.
*/

package ejercicios.capitulo5;

public class ejercicio_5_12_ProductoDeEnterosImpares {
    public static void main(String[] args) {
        int producto = 1;

        for (int i = 1; i <= 15; i += 2) {
            producto *= i;
        }

        System.out.printf("El producto de los enteros impares del 1 al 15 es: %d%n", producto);
    }
}