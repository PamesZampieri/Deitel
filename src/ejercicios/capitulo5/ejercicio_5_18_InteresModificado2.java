/*
5.18 (Programa modificado del interés compuesto) Modifique la aplicación de la figura 5.6, de manera que
se utilicen sólo enteros para calcular el interés compuesto. [Sugerencia: trate todas las cantidades monetarias
como números enteros de centavos. Luego divida el resultado en su porción de dólares y su porción de centavos,
utilizando las operaciones de división y residuo, respectivamente. Inserte un punto entre las porciones de dólares y
centavos].
*/

package ejercicios.capitulo5;

public class ejercicio_5_18_InteresModificado2 {
    public static void main(String[] args) {

        int capital = 1000 * 100; //capital en centavos

        System.out.printf("%s%20s%n", "Año", "Monto en Depósito");

        for (int year = 1; year <= 10; ++year) {
            int monto = (int) (capital * Math.pow(1.05, year));

            System.out.printf("%3d%17d.%d%n", year, monto / 100, monto % 100);
        }
    }
}