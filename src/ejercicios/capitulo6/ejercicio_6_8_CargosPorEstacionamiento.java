/*
6.8 (Cargos por estacionamiento) Un estacionamiento cobra una cuota mínima de $2.00 por estacionarse hasta tres horas.
El estacionamiento cobra $0.50 adicionales por cada hora o fracción que se pase de tres horas. El cargo
máximo para cualquier periodo dado de 24 horas es de $10.00. Suponga que ningún auto se estaciona durante más
de 24 horas seguidas. Escriba una aplicación que calcule y muestre los cargos por estacionamiento para cada cliente
que se haya estacionado ayer. Debe introducir las horas de estacionamiento para cada cliente. El programa debe mostrar
el cargo para el cliente actual así como calcular y mostrar el total corriente de los recibos de ayer. El programa debe
utilizar el método calcularCargos para determinar el cargo para cada cliente.
 */

package ejercicios.capitulo6;

import java.util.Scanner;

public class ejercicio_6_8_CargosPorEstacionamiento {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escriba la cantidad de horas de estacionamiento utilizadas por el cliente: ");
        double horasDeEstacionamiento = entrada.nextDouble();
        horasDeEstacionamiento = Math.ceil(horasDeEstacionamiento);

        double totalHorasDeEstacionamiento = 0;
        double totalCargosDeEstacionamiento = 0;

        while (horasDeEstacionamiento != -1) {
            System.out.printf("El cargo a abonar es de: $%.2f%n",
                    calcularCargos(horasDeEstacionamiento));

            totalHorasDeEstacionamiento += horasDeEstacionamiento;
            totalCargosDeEstacionamiento += calcularCargos(horasDeEstacionamiento);

            System.out.printf("El cargo por el total de %d horas de estacionamiento para el día hasta el momento es de:" +
                    " $%.2f%n%n", (int) totalHorasDeEstacionamiento, totalCargosDeEstacionamiento);

            System.out.print("Escriba la cantidad de horas de estacionamiento utilizadas por el cliente: ");
            horasDeEstacionamiento = entrada.nextDouble();
            horasDeEstacionamiento = Math.ceil(horasDeEstacionamiento);
        }
    }

    public static double calcularCargos(double horasDeEstacionamiento) {
        double cargosDeEstacionamiento = 2;
        int horasPrecioMinimo = 3;
        int precioMaximo = 10;
        double precioHora = 0.5;

        if (horasDeEstacionamiento > horasPrecioMinimo) {
            cargosDeEstacionamiento += (horasDeEstacionamiento - horasPrecioMinimo) * precioHora;
        }

        if (cargosDeEstacionamiento > precioMaximo) {
            cargosDeEstacionamiento = precioMaximo;
        }

        return cargosDeEstacionamiento;
    }
}
