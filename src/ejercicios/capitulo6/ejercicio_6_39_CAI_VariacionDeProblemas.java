/*
6.39 (Instrucción asistida por computadora: variación de los tipos de problemas) Modifique el programa del
ejercicio 6.38 para permitir al usuario que elija el tipo de problemas aritméticos que desea estudiar. Una opción de 1
significa problemas de suma solamente, 2 problemas de resta, 3 problemas de multiplicación, 4 problemas de división
y 5 significa una mezcla aleatoria de problemas de todos estos tipos.
*/

package ejercicios.capitulo6;

import java.security.SecureRandom;
import java.util.Scanner;

public class ejercicio_6_39_CAI_VariacionDeProblemas {
    private static final SecureRandom numerosAleatorios = new SecureRandom();
    private static int respuestaCorrecta;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cantidadDePreguntas = 10;
        double porcentajeAprobacion = 0.75;

        System.out.println("Este programa le ayudará a practicar distintos problemas aritméticos.");

        int continuar = 1;

        while (continuar == 1) {
            int respuestasCorrectas = 0;

            System.out.print("Seleccione 1 para Suma, 2 para Resta, 3 para Multiplicación, 4 para División o 5 para " +
                    "Operaciones Aritméticas Aleatorias: ");
            int opcion = entrada.nextInt();

            for (int i = 0; i < cantidadDePreguntas; i++) {
                switch (opcion) {
                    case 1:
                        System.out.println(suma());
                        break;
                    case 2:
                        System.out.println(resta());
                        break;
                    case 3:
                        System.out.println(multiplicacion());
                        break;
                    case 4:
                        System.out.println(division());
                        break;
                    default:
                        System.out.println(operacionesAritmeticasAleatorias());
                }

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

    public static String suma() {
        int numero1 = numerosAleatorios.nextInt(10);
        int numero2 = numerosAleatorios.nextInt(10);

        respuestaCorrecta = numero1 + numero2;

        return "¿Cuánto es " + numero1 + " + " + numero2 + " ?";
    }

    public static String resta() {
        int numero1 = numerosAleatorios.nextInt(10);
        int numero2 = numerosAleatorios.nextInt(10);

        respuestaCorrecta = numero1 - numero2;

        return "¿Cuánto es " + numero1 + " - " + numero2 + " ?";
    }

    public static String multiplicacion() {
        int numero1 = numerosAleatorios.nextInt(10);
        int numero2 = numerosAleatorios.nextInt(10);

        respuestaCorrecta = numero1 * numero2;

        return "¿Cuánto es " + numero1 + " x " + numero2 + " ?";
    }

    public static String division() {
        int numero1 = numerosAleatorios.nextInt(10);
        int numero2 = numerosAleatorios.nextInt(10);

        respuestaCorrecta = numero1 / numero2;

        return "¿Cuánto es " + numero1 + " / " + numero2 + " ?";
    }

    public static String operacionesAritmeticasAleatorias() {
        int operaciones = 1 + numerosAleatorios.nextInt(4);

        switch (operaciones) {
            case 1:
                return suma();
            case 2:
                return resta();
            case 3:
                return multiplicacion();
            default:
                return division();
        }
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
