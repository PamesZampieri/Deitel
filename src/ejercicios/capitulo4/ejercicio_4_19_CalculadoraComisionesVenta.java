/*
4.19 (Calculadora de comisiones de ventas) Una empresa grande paga a sus vendedores mediante comisiones.
Los vendedores reciben $200 por semana, más el 9% de sus ventas brutas durante esa semana. Por ejemplo, un
vendedor que vende $5 000 de mercancía en una semana, recibe $200 más el 9% de 5 000, o un total de $650.
Usted acaba de recibir una lista de los artículos vendidos por cada vendedor. Los valores de estos artículos son los
siguientes:
Artículo Valor
1 239.99
2 129.75
3 99.95
4 350.89
Desarrolle una aplicación en Java que reciba como entrada los artículos vendidos por un comerciante durante la última
semana, y que calcule y muestre los ingresos de ese vendedor. No hay límite en cuanto al número de artículos que
un representante puede vender.
 */

package ejercicios.capitulo4;

import java.util.Scanner;

public class ejercicio_4_19_CalculadoraComisionesVenta {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escriba el número de vendedor o (-1) para terminar:  ");
        int sellerID = entrada.nextInt();

        if (sellerID != -1) {
            System.out.print("Escriba el valor del artículo vendido o (-1) para terminar:  ");
            double valorArticuloVendido = entrada.nextDouble();

            double totalArticulosVendidos = 0;
            double gananciaFija = 200;
            double coeficientePorVentas = 0.09;

            while (valorArticuloVendido != -1) {
                totalArticulosVendidos += valorArticuloVendido;

                System.out.print("Escriba el valor del artículo vendido o (-1) para terminar:  ");
                valorArticuloVendido = entrada.nextDouble();
            }

            double comisionPorVentas = totalArticulosVendidos * coeficientePorVentas;
            double gananciaFinal = gananciaFija + comisionPorVentas;
            System.out.printf("El ingreso total del vendedor %d es de: %.2f%n", sellerID, gananciaFinal);
        }
    }
}