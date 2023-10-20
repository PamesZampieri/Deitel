/*
6.6 Declare el método volumenEsfera para calcular y mostrar el volumen de la esfera. Utilice la siguiente instrucción
para calcular el volumen:
double volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3)
Escriba una aplicación en Java que pida al usuario el radio double de una esfera, que llame a volumenEsfera para
calcular el volumen y muestre el resultado en pantalla.
*/

package ejercicios.capitulo6;

import java.util.Scanner;

public class ejercicio_6_6_VolumenEsfera {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escriba el radio de una esfera (en punto flotante): ");
        double radio = entrada.nextDouble();

        System.out.printf("El volumen correspondiente para el radio introducido es: %.2f%n", volumenEsfera(radio));
    }

    public static double volumenEsfera(double radio) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
    }
}