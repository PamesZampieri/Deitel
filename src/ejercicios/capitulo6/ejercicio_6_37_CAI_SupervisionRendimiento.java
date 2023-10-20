/*
6.37 (Instrucción asistida por computadora: supervisión del rendimiento de los estudiantes) Los sistemas de instrucción
asistida por computadora más sofisticados supervisan el rendimiento del estudiante durante cierto tiempo. La decisión de
empezar un nuevo tema se basa a menudo en el éxito del estudiante con los temas anteriores. Modifique el programa del
ejercicio 6.36 para contar el número de respuestas correctas e incorrectas introducidas por el estudiante. Una vez que
el estudiante escriba 10 respuestas, su programa debe calcular el porcentaje de respuestas correctas. Si éste es menor
del 75%, imprima “Por favor pide ayuda adicional a tu instructor” y reinicie el programa, para que otro estudiante pueda
probarlo. Si el porcentaje es del 75% o mayor,muestre el mensaje “¡Felicidades, estás listo para pasar al siguiente
nivel!” y luego reinicie el programa, para que otro estudiante pueda probarlo.
*/

package ejercicios.capitulo6;

import java.security.SecureRandom;
import java.util.Scanner;

public class ejercicio_6_37_CAI_SupervisionRendimiento {
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

            for (int i = 0; i < cantidadDePreguntas; i++) {
                System.out.println(multiplicar());
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
                return "No es correcto. Sigue Intentando";
        }
    }
}