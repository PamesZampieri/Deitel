/*
4.39 (Crecimiento de la población mundial) La población mundial ha crecido de manera considerable a través
de los siglos. El crecimiento continuo podría, en un momento dado, desafiar los límites del aire respirable, el agua
potable, la tierra cultivable y otros recursos limitados. Hay evidencia de que el crecimiento se ha reducido en años
recientes, y que la población mundial podría llegar a su valor máximo en algún momento de este siglo, para luego
empezar a disminuir.
Para este ejercicio, investigue en Internet las cuestiones sobre el crecimiento de la población mundial. Asegúrese
de investigar varios puntos de vista. Obtenga estimaciones de la población mundial actual y de su tasa de crecimiento
(el porcentaje por el cual es probable que aumente este año). Escriba un programa que calcule el crecimiento anual de
la población mundial durante los siguientes 75 años, utilizando la suposición simplificada de que la tasa de crecimiento
actual permanecerá constante. Imprima los resultados en una tabla. La primera columna debe mostrar el año, desde el
año 1 hasta el año 75. La segunda columna debe mostrar la población mundial anticipada al final de ese año. La tercera
columna deberá mostrar el aumento numérico en la población mundial que ocurriría ese año. Use sus resultados para
determinar el año en el que el tamaño de la población será del doble del actual, si la tasa de crecimiento de este
año permaneciera.
 */

package ejercicios.capitulo4;

import java.util.Scanner;

public class ejercicio_4_39_CrecimientoDeLaPoblacionMundial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escriba la Población Mundial Actual: ");
        long poblacionMundial = entrada.nextLong();

        System.out.print("Escriba la Tasa de Crecimiento Anual de la Población Mundial: ");
        double tasaDeCrecimiento = entrada.nextDouble();

        double coeficiente = tasaDeCrecimiento / 100 + 1;
        int year = 1;
        long poblacionMundialActual = (long) (poblacionMundial * coeficiente);
        long aumentoNumericoDelaPoblacion = poblacionMundialActual - poblacionMundial;
        long poblacionAnterior;
        int yearDouble = 0;

        System.out.println("\nAÑO\t\t\tPOBLACIÓN MUNDIAL ANTICIPADA\t\t\tAUMENTO NUMÉRICO");
        System.out.printf("%d\t\t\t%d\t\t\t\t\t\t\t\t\t%d%n", year, poblacionMundialActual,
                aumentoNumericoDelaPoblacion);

        while (year < 75) {
            year++;
            poblacionAnterior = poblacionMundialActual;
            poblacionMundialActual = (long) (poblacionMundialActual * coeficiente);
            aumentoNumericoDelaPoblacion = poblacionMundialActual - poblacionAnterior;
            System.out.printf("%d\t\t\t%d\t\t\t\t\t\t\t\t\t%d%n", year, poblacionMundialActual,
                    aumentoNumericoDelaPoblacion);

            if (poblacionMundialActual > poblacionMundial * 2) {
                if (yearDouble == 0) {
                    yearDouble = year;
                }
            }
        }
        System.out.printf("%nDentro de %d años la población mundial será el doble de la actual.%n", yearDouble);
    }
}

