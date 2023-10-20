/*
4.16 ¿Qué es lo que imprime el siguiente programa?
 */

package ejercicios.capitulo4;

public class ejercicio_4_16_Misterio {
    public static void main(String[] args) {
        int x = 1;
        int total = 0;

        while (x <= 10) {
            int y = x * x;
            System.out.println(y);
            total += y;
            ++x;
        }
        System.out.printf("El total es %d%n", total);
    }
}