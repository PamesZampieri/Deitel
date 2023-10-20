/*
4.25 ¿Qué es lo que imprime el siguiente programa?
 */

package ejercicios.capitulo4;

public class ejercicio_4_25 {
    public static void main(String[] args) {
        int cuenta = 1;

        while (cuenta <= 10) {
            System.out.println(cuenta % 2 == 1 ? "****" : "++++++++");
            cuenta++;
        }
    }
}