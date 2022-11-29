/*
4.7 Determine el valor de las variables en la instrucción producto *= x++;, después de realizar el cálculo.
Suponga que todas las variables son de tipo int y tienen el valor 5.
 */

package ejercicios.capitulo4;

public class ejercicio_4_7 {
    public static void main(String[] args) {
        int producto = 5;
        int x = 5;

        producto *= x++;

        System.out.printf("El valor de producto es: %d%n", producto);
        System.out.printf("El valor actual de x es: %d%n", x);
    }
}
