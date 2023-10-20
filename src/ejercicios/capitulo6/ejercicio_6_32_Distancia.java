/*
6.32 (Distancia entre puntos) Escriba un método llamado distancia para calcular la distancia entre dos puntos
(x1, y1) y (x2, y2). Todos los números y valores de retorno deben ser de tipo double. Incorpore este método en una
aplicación que permita al usuario introducir las coordenadas de los puntos.
*/

package ejercicios.capitulo6;

import java.util.Scanner;

public class ejercicio_6_32_Distancia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escriba la coordenada x1 para el punto inicial: ");
        double x1 = entrada.nextDouble();
        System.out.print("Escriba la coordenada y1 para el punto inicial: ");
        double y1 = entrada.nextDouble();
        System.out.print("Escriba la coordenada x2 para el punto final: ");
        double x2 = entrada.nextDouble();
        System.out.print("Escriba la coordenada y2 para el punto final: ");
        double y2 = entrada.nextDouble();

        System.out.printf("La distancia recorrida entre los 2 puntos es: %.2f%n", distancia(x1, x2, y1, y2));
    }

    public static double distancia(double x1, double x2, double y1, double y2) {
        return Math.hypot((x2 - x1), (y2 - y1));
    }
}