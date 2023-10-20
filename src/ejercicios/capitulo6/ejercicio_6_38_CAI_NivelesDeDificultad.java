/*
6.38 (Instrucción asistida por computadora: niveles de dificultad) En los ejercicios 6.35 al 6.37 se desarrolló un
programa de instrucción asistida por computadora para enseñar a un estudiante de escuela primara cómo multiplicar.
Modifique el programa para que permita al usuario introducir un nivel de dificultad. Un nivel de 1 significa que el
programa debe usar sólo números de un dígito en los problemas; un nivel 2 significa que el programa debe utilizar
números de dos dígitos máximo, y así en lo sucesivo.
*/

package ejercicios.capitulo6;

import java.security.SecureRandom;
import java.util.Scanner;

public class ejercicio_6_38_CAI_NivelesDeDificultad {
    private static final SecureRandom numerosAleatorios = new SecureRandom();
    private static int respuestaCorrecta;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cantidadDePreguntas = 10;
        double porcentajeAprobacion = 0.75;
        int continuar = 1;

        System.out.println("Este programa le ayudará a practicar operaciones de multiplicación.");
        System.out.println();

        while (continuar == 1) {
            int respuestasCorrectas = 0;

            System.out.println("Seleccione el Nivel de dificultad: 1 - 2 - 3 - etc...");
            System.out.print("Tenga en cuenta que 1 es para multiplicaciones por una cifra, 2 para multiplicaciones " +
                    "por dos cifras y así sucesivamente: ");
            int nivelDificultad = entrada.nextInt();

            for (int i = 0; i < cantidadDePreguntas; i++) {
                System.out.println(multiplicar(nivelDificultad));
                System.out.print("Escriba a continuación su respuesta: ");
                int respuesta = entrada.nextInt();

                if (respuesta == respuestaCorrecta) {
                    respuestasCorrectas++;
                    System.out.println(getMensajeRespuestaCorrecta());
                } else {
                    System.out.println(getMensajeRespuestaIncorrecta());
                }
            }

            if ((double) respuestasCorrectas / cantidadDePreguntas >= porcentajeAprobacion) {
                System.out.println("¡Felicidades, estás listo para pasar al siguiente nivel!");
            } else {
                System.out.println("Por favor, pide ayuda adicional a tu instructor.");
            }

            System.out.print("\n¿Desea realizar otro intento? 1 (SI) o 2 (NO): ");
            continuar = entrada.nextInt();
        }
    }

    public static String multiplicar(int cantidadDigitos) {
        int numero1 = numerosAleatorios.nextInt((int) Math.pow(10, cantidadDigitos));
        int numero2 = numerosAleatorios.nextInt((int) Math.pow(10, cantidadDigitos));

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
                return "No es correcto. Sigue Intentando";
        }
    }
}