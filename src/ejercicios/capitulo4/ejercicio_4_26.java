/*
4.26 ¿Qué es lo que imprime el siguiente programa?
 */

package ejercicios.capitulo4;

public class ejercicio_4_26 {
    public static void main(String[] arg) {
        int fila = 10;

        while (fila >= 1) {
            int columna = 1;

            while (columna <= 10) {
                System.out.print(fila % 2 == 1 ? "<" : ">");
                columna++;
            }

            fila--;
            System.out.println();
        }
    }
}