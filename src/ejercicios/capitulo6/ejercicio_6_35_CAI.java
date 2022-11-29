/*
6.35 (Instrucción asistida por computadora) El uso de las computadoras en la educación se conoce como instrucción
asistida por computadora (CAI). Escriba un programa que ayude a un estudiante de escuela primaria a que aprenda a
multiplicar. Use un objeto SecureRandom para producir dos enteros positivos de un dígito. El programa debe
entonces mostrar una pregunta al usuario, como:
¿Cuánto es 6 por 7?
El estudiante entonces debe escribir la respuesta. Luego, el programa debe verificar la respuesta del estudiante. Si es
correcta, muestre el mensaje “¡Muy bien!” y haga otra pregunta de multiplicación. Si la respuesta es incorrecta, dibuje
la cadena “No. Por favor intenta de nuevo.” y deje que el estudiante intente la misma pregunta varias veces, hasta
que esté correcta. Debe utilizarse un método separado para generar cada pregunta nueva. Este método debe llamarse
una vez cuando la aplicación empiece a ejecutarse, y cada vez que el usuario responda correctamente a la pregunta.
*/

package ejercicios.capitulo6;

import java.security.SecureRandom;
import java.util.Scanner;

public class ejercicio_6_35_CAI {
    private static final SecureRandom numerosAleatorios = new SecureRandom();
    private static int respuestaCorrecta;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Este programa le ayudará a practicar operaciones de multiplicación.");
        System.out.println(multiplicar());
        System.out.print("Escriba a continuación su respuesta o (-1) para terminar: ");
        int respuesta = entrada.nextInt();

        while (respuesta != -1) {
            if (respuesta == respuestaCorrecta) {
                System.out.println("¡Muy Bien!");
                System.out.println(multiplicar());
            } else {
                System.out.println("La respuesta no es correcta. Por favor, intente de nuevo: ");
            }
            System.out.print("Escriba a continuación su respuesta o (-1) para terminar: ");
            respuesta = entrada.nextInt();
        }
    }

    public static String multiplicar() {
        int numero1 = numerosAleatorios.nextInt(10);
        int numero2 = numerosAleatorios.nextInt(10);

        respuestaCorrecta = numero1 * numero2;

        return "¿Cuánto es " + numero1 + " x " + numero2 + " ?";
    }
}
