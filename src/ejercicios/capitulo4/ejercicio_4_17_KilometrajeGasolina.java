/*
4.17 (Kilometraje de gasolina) Los conductores se preocupan por el kilometraje de sus automóviles. Un conductor ha
llevado el registro de varios reabastecimientos de combustible, registrando los kilómetros conducidos y
los litros usados en cada tanque lleno. Desarrolle una aplicación en Java que reciba como entrada los kilómetros
conducidos y los litros usados (ambos como enteros) por cada viaje. El programa debe calcular y mostrar los kilómetros
por litro obtenidos en cada viaje, y debe imprimir el total de kilómetros por litro obtenidos en todos los
viajes hasta este punto. Todos los cálculos del promedio deben producir resultados en números de punto flotante.
Use la clase Scanner y la repetición controlada por centinela para obtener los datos del usuario.
 */

package ejercicios.capitulo4;

import java.util.Scanner;

public class ejercicio_4_17_KilometrajeGasolina {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escriba los Kilómetros conducidos de su viaje: ");
        int kilometros = entrada.nextInt();
        System.out.print("Escriba los litros utilizados en su viaje: ");
        int litros = entrada.nextInt();

        int totalKilometros = 0;
        int totalLitros = 0;
        double kilometrosXlitro;

        while (kilometros != -1) {
            kilometrosXlitro = (double) kilometros / litros;
            System.out.printf("Este viaje tuvo el siguiente consumo de kilometros por litro: %.2f%n", kilometrosXlitro);
            System.out.println();

            totalKilometros += kilometros;
            totalLitros += litros;

            System.out.print("Escriba los Kilómetros conducidos de su viaje: ");
            kilometros = entrada.nextInt();
            System.out.print("Escriba los litros utilizados en su viaje: ");
            litros = entrada.nextInt();
        }

        kilometrosXlitro = (double) totalKilometros / totalLitros;
        System.out.printf("El promedio de kilometros por litro de todos los viajes introducidos es: %.2f%n",
                kilometrosXlitro);
    }
}
