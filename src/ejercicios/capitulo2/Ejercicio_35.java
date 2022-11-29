/*
(Calculadora de ahorro por viajes compartidos en automóvil) Investigue varios sitios Web de viajes
compartidos en automóvil. Cree una aplicación que calcule su costo diario al conducir su automóvil, de modo que
pueda estimar cuánto dinero puede ahorrar si comparte los viajes en automóvil, lo cual también tiene otras ventajas,
como la reducción de las emisiones de carbono y la reducción de la congestión de tráfico. La aplicación debe
recibir como entrada la siguiente información y mostrar el costo por día para el usuario por conducir al trabajo:
a) Total de kilómetros conducidos por día.
b) Costo por litro de gasolina.
c) Promedio de kilómetros por litro.
d) Cuotas de estacionamiento por día.
e) Peaje por día.
 */

package ejercicios.capitulo2;

import java.util.Scanner;

//Calculadora de ahorro por viajes compartidos en automóvil
public class Ejercicio_35 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double kilometrosPorDia;
        double costoLitro;
        double kilometroLitro;
        double estacionamiento;
        double peaje;

        System.out.print("Escriba el Total de Kilometros conducidos por día: ");
        kilometrosPorDia = entrada.nextDouble();

        System.out.print("Escriba el Costo por Litro de gasolina: ");
        costoLitro = entrada.nextDouble();

        System.out.print("Escriba el Promedio de kilometros por litro: ");
        kilometroLitro = entrada.nextDouble();

        System.out.print("Escriba la cuota de estacionamiento por dia: ");
        estacionamiento = entrada.nextDouble();

        System.out.print("Escriba el peaje por dia: ");
        peaje = entrada.nextDouble();

        System.out.printf("El total del costo diario por conducir por día al trabajo es: %f%n", kilometrosPorDia / kilometroLitro * costoLitro + estacionamiento + peaje);
    }
}
