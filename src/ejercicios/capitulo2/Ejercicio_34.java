/*
(Calculadora del crecimiento de la población mundial) Use Web para determinar la población mundial
actual y la tasa de crecimiento anual de la población mundial. Escriba una aplicación que reciba estos valores como
entrada y luego muestre la población mundial estimada después de uno, dos, tres, cuatro y cinco años.
 */

package ejercicios.capitulo2;

import java.util.Scanner;

public class Ejercicio_34 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escriba la Población Mundial Actual: ");
        double poblacionMundial = entrada.nextDouble();

        System.out.print("Escriba la Tasa de Crecimiento Anual de la Población Mundial: ");
        double tasaDeCrecimiento = entrada.nextDouble();
        System.out.println();

        double poblacionMundialInicial = poblacionMundial;
        double coeficiente = tasaDeCrecimiento / 100 + 1;

        poblacionMundial *= coeficiente;
        System.out.printf("La Población Mundial estimada en un año es: %.2f%n", poblacionMundial);

        poblacionMundial *= coeficiente;
        System.out.printf("La Población Mundial estimada en dos años es: %.2f%n", poblacionMundial);

        poblacionMundial *= coeficiente;
        System.out.printf("La Población Mundial estimada en tres años es: %.2f%n", poblacionMundial);

        poblacionMundial *= coeficiente;
        System.out.printf("La Población Mundial estimada en cuatro años es: %.2f%n", poblacionMundial);

        poblacionMundial *= coeficiente;
        System.out.printf("La Población Mundial estimada en cinco años es: %.2f%n", poblacionMundial);
        System.out.println();

        System.out.printf("La diferencia entre la inicial y la que hay dentro de 5 años es %.2f%n", poblacionMundial -
                poblacionMundialInicial);
        System.out.printf("La diferencia entre calcularlo bien y solo multiplicar por 5 es %.2f%n", poblacionMundial -
                (poblacionMundialInicial + (poblacionMundialInicial * tasaDeCrecimiento / 100) * 5));
    }
}
