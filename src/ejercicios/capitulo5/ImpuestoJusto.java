/*5.32 (Alternativas para el plan fiscal: el “impuesto justo”) Existen muchas propuestas para que los impuestos
sean más justos. Consulte la iniciativa FairTax de Estados Unidos en el sitio: www.fairtax.org. Investigue cómo funciona
la iniciativa FairTax que se propone. Nuestra sugerencia es eliminar los impuestos sobre los ingresos y otros más
a favor de un 23% de impuestos sobre el consumo en todos los productos y servicios que usted compre. Algunos
opositores a FairTax cuestionan la cifra del 23% y dicen que, debido a la forma en que se calculan los impuestos, sería
más preciso decir que la tasa sea del 30%; revise esto con cuidado. Escriba un programa que pida al usuario que
introduzca sus gastos en diversas categorías de gastos disponibles (por ejemplo, alojamiento, comida, ropa, transporte,
educación, servicios médicos, vacaciones), y que después imprima el impuesto FairTax estimado que esa persona
pagaría.
*/

package ejercicios.capitulo5;

import java.util.Scanner;

public class ImpuestoJusto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double coeficienteFairTax = 1.23;
        int continuar;

        do {
            System.out.println("Escriba el total de los gastos incurridos en las siguientes categorías: ");
            System.out.print("Categoría Alojamiento: $");
            double alojamiento = entrada.nextDouble();
            System.out.print("Categoría Alimentación: $");
            double alimentacion = entrada.nextDouble();
            System.out.print("Categoría Vestimenta: $");
            double vestimenta = entrada.nextDouble();
            System.out.print("Categoría Transporte: $");
            double transporte = entrada.nextDouble();
            System.out.print("Categoría Educación: $");
            double educacion = entrada.nextDouble();
            System.out.print("Categoría Servicios Médicos: $");
            double serviciosMedicos = entrada.nextDouble();
            System.out.print("Categoría Vacaciones: $");
            double vacaciones = entrada.nextDouble();
            System.out.println();

            double fairTax = (alojamiento + alimentacion + vestimenta + transporte + educacion + serviciosMedicos +
                    vacaciones) * coeficienteFairTax;

            System.out.printf("El Impuesto Fairtax estimado que usted abonaría por los gastos de todas las categorías " +
                    "introducidas es: $%.2f%n", fairTax);
            System.out.println();

            System.out.print("¿Desea calcular otros gastos? Presione 1 para continuar o 2 para finalizar: ");
            continuar = entrada.nextInt();

        }
        while (continuar != 2);
    }
}