/*
 Escriba una aplicación que muestre los números del 1 al 4 en la misma línea, con cada par de números adyacentes
 separado por un espacio. Use las siguientes técnicas:
a) Mediante una instrucción System.out.println.
b) Mediante cuatro instrucciones System.out.print.
c) Mediante una instrucción System.out.printf.
 */

package ejercicios.capitulo2;

public class Ejercicio_14 {
    public static void main (String[] args) {
        System.out.println("1 2 3 4");
        System.out.print("1 2 3 4\n");
        System.out.printf("%d %d %d %d%n",1,2,3,4);
    }
}
