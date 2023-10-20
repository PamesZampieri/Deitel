/*
6.36 (Instrucción asistida por computadora: reducción de la fatiga de los estudiantes) Un problema que se desarrolla en
los entornos CAI es la fatiga de los estudiantes. Este problema puede eliminarse si se varían las contestaciones de la
computadora para mantener la atención del estudiante. Modifique el programa del ejercicio 6.35 de manera que se muestren
diversos comentarios para cada respuesta, de la siguiente manera:
Posibles contestaciones a una respuesta correcta:
 ¡Muy bien!
 ¡Excelente!
 ¡Buen trabajo!
 ¡Sigue así!
Posibles contestaciones a una respuesta incorrecta:
 No. Por favor intenta de nuevo.
 Incorrecto. Intenta una vez más.
 ¡No te rindas!
 No. Sigue intentando.
Use la generación de números aleatorios para elegir un número entre 1 y 4 que se utilice para seleccionar una de las
cuatro contestaciones apropiadas a cada respuesta correcta o incorrecta. Use una instrucción switch para emitir las
contestaciones.
*/

package ejercicios.capitulo6;

import java.security.SecureRandom;
import java.util.Scanner;

public class ejercicio_6_36_CAI_ReduccionDeLaFatiga {
    private static final SecureRandom numerosAleatorios = new SecureRandom();
    private static int respuestaCorrecta;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Este programa le ayudará a practicar operaciones de multiplicación.");
        System.out.println();
        System.out.println(multiplicar());
        System.out.print("Escriba a continuación su respuesta o (-1) para terminar: ");
        int respuesta = entrada.nextInt();

        while (respuesta != -1) {
            if (respuesta == respuestaCorrecta) {
                System.out.println(getMensajeRespuestaCorrecta());
                System.out.println(multiplicar());
            } else {
                System.out.println(getMensajeRespuestaIncorrecta());
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

    public static String getMensajeRespuestaCorrecta() {
        int comentarios = 1 + numerosAleatorios.nextInt(4);

        switch (comentarios) {
            case 1:
                return "¡Muy Bien!";
            case 2:
                return "¡Excelente!";
            case 3:
                return "¡Buen trabajo!";
            default:
                return "¡Sigue así!";
        }
    }

    public static String getMensajeRespuestaIncorrecta() {
        int comentarios = 1 + numerosAleatorios.nextInt(4);

        switch (comentarios) {
            case 1:
                return "No es correcto. Por favor, intenta de nuevo.";
            case 2:
                return "Incorrecto. Intenta una vez más.";
            case 3:
                return "¡No te rindas!";
            default:
                return "No es correcto. Sigue Intentando.";
        }
    }
}