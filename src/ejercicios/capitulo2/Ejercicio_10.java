/*
Suponiendo que x = 2 y y = 3, ¿qué muestra cada una de las siguientes instrucciones?
a) System.out.printf(“x = %d%n”, x);
b) System.out.printf(“El valor de %d + %d es %d%n”, x, x, (x + x));
c) System.out.printf(“x =”);
d) System.out.printf(“%d = %d%n”, (x + y), (y + x));
 */

package ejercicios.capitulo2;

public class Ejercicio_10 {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;
        
        System.out.printf("x = %d%n", x);
        System.out.printf("El valor de %d + %d es %d%n", x, x, x + x);
        System.out.printf("x =");
        System.out.println();
        System.out.printf("%d = %d%n", (x + y), (y + x));
    }
}
