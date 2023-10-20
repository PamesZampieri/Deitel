/*
6.22 (Conversiones de temperatura) Implemente los siguientes métodos enteros:
a) El método centigrados que devuelve la equivalencia en grados Centígrados de una temperatura en grados
Fahrenheit, mediante el cálculo
 centigrados = 5.0 / 9.0 * (fahrenheit – 32);
b) El método fahrenheit que devuelve la equivalencia en grados Fahrenheit de una temperatura en grados
Centígrados, con el cálculo
 fahrenheit = 9.0 / 5.0 * centigrados + 32;
c) Utilice los métodos de los incisos (a) y (b) para escribir una aplicación que permita al usuario, ya sea escribir una
temperatura en grados Fahrenheit y mostrar su equivalente en Centígrados, o escribir una
temperatura en grados Centígrados y mostrar su equivalente en grados Fahrenheit.
*/

package ejercicios.capitulo6;

import java.util.Scanner;

public class ejercicio_6_22_ConversionesDeTemperatura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escriba 1 para convertir la temperatura a °C (grados centígrados) o 2, para convertir a °F " +
                "(grados fahrenheit): ");
        int opcion = entrada.nextInt();

        while (opcion != 1 && opcion != 2) {
            System.out.println("Error. Escriba una opción correcta.");

            System.out.print("Escriba 1 para convertir la temperatura a °C (grados centígrados) o 2, para convertir a °F " +
                    "(grados fahrenheit): ");
            opcion = entrada.nextInt();
        }

        System.out.print("Escriba la temperatura a convertir: ");
        double temperatura = entrada.nextDouble();

        if (opcion == 1) {
            System.out.printf("El equivalente de la temperatura %.2f°F convertida a °C es: %.2f°C.", temperatura,
                    centigrados(temperatura));
        } else {
            System.out.printf("El equivalente de la temperatura %.2f°C convertida a °F es: %.2f°F.", temperatura,
                    fahrenheit(temperatura));
        }
    }

    public static double centigrados(double temperatura) {
        return 5.0 / 9.0 * (temperatura - 32);
    }

    public static double fahrenheit(double temperatura) {
        return 9.0 / 5.0 * temperatura + 32;
    }
}