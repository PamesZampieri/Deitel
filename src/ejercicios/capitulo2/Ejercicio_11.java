/*
¿Cuáles de las siguientes instrucciones de Java contienen variables, cuyos valores se modifican?
a) p = i + j + k + 7;
b) System.out.println(“variables cuyos valores se modifican”);
c) System.out.println(“a = 5”);
d) valor = entrada.nextInt();
 */

package ejercicios.capitulo2;

public class Ejercicio_11 {
    public static void main(String[] args) {
        int p = 1;
        int i = 0;
        int j = 2;
        int k = 1;

        //p = i + j + k + 7;

        System.out.printf("p = %d%n", p);
        System.out.printf("i = %d%n", i);
        System.out.printf("j = %d%n", j);
        System.out.printf("k = %d%n", k);
    }
}