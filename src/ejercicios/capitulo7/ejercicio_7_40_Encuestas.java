/*
7.40 (Encuestas) Internet y Web permiten que cada vez haya más personas conectadas en red, unidas por una causa,
expresen sus opiniones, etcétera. Los candidatos presidenciales recientes usaron Internet en forma intensiva para
expresar sus mensajes y recaudar dinero para sus campañas. En este ejercicio, escribirá un pequeño programa de encuestas
que permite a los usuarios calificar cinco asuntos de conciencia social, desde 1 (menos importante) hasta 10 (más
importante). Elija cinco causas que sean importantes para usted (por ejemplo, temas políticos, sobre el medio ambiente).
Use un arreglo unidimensional llamado temas (de tipo String) para almacenar las cinco causas. Para sintetizar las
respuestas de la encuesta, use un arreglo bidimensional de 5 filas y 10 columnas llamado respuestas (de tipo int), en
donde cada fila corresponda a un elemento del arreglo temas. Cuando se ejecute el programa, debe pedir al usuario que
califique cada tema. Haga que sus amigos y familiares respondan a la encuesta. Después haga que el programa muestre un
resumen de los resultados, incluyendo:
a) Un informe tabular con los cinco temas del lado izquierdo y las 10 calificaciones en la parte superior, listando en
cada columna el número de calificaciones recibidas para cada tema.
b) A la derecha de cada fila, muestre el promedio de las calificaciones para cada tema específico.
c) ¿Qué tema recibió la mayor puntuación total? Muestre ambos, el asunto y la puntuación.
d) ¿Cuál obtuvo la menor puntuación total? Muestre tanto el tema como la puntuación total.
*/

package ejercicios.capitulo7;

import java.util.Scanner;

public class ejercicio_7_40_Encuestas {
    private static final String[] temas = {"Cuidado del Medioambiente", "Legalidad del Aborto", "Legalidad de la" +
            "Eutanasia en el pais", "Maternidad Subrogada", "Erradicación de la experimentación en animales"};
    private static final int[][] respuestas = new int[5][10];
    private static int cantidadEncuestados = 0;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("Escriba del 1 al 10 por cada de tema presentado, el nivel de importancia para usted.");
            System.out.println("Siendo 1 menos importante y 10 más importante.\n");

            for (int i = 0; i < temas.length; i++) {
                System.out.printf("%s: ", temas[i]);
                int respuesta = entrada.nextInt();

                respuestas[i][respuesta - 1]++;
            }
            System.out.println();

            cantidadEncuestados++;

            System.out.println("¿Desea continuar?. Coloque (1) para continuar o (-1) para terminar: ");
            opcion = entrada.nextInt();
        } while (opcion != -1);

        imprimirResultadosEncuesta();
    }

    private static void imprimirResultadosEncuesta() {
        System.out.printf("%-46s  %20s%20s%20s%20s%20s%20s%20s%20s%20s%20s%20s%n", "TEMAS:", "CALIFICACIÓN 1",
                "CALIFICACIÓN 2", "CALIFICACIÓN 3", "CALIFICACIÓN 4", "CALIFICACIÓN 5", "CALIFICACIÓN 6",
                "CALIFICACIÓN 7", "CALIFICACIÓN 8", "CALIFICACIÓN 9", "CALIFICACIÓN 10", "PROMEDIO:");

        int mayorPuntuacionTotal = 0;
        int menorPuntuacionTotal = Integer.MAX_VALUE;
        String temaConMayorPuntuacion = "";
        String temaConMenorPuntuacion = "";

        for (int i = 0; i < respuestas.length; i++) {
            System.out.printf("%-46s  ", temas[i]);

            int totalRespuestas = 0;

            for (int j = 0; j < respuestas[i].length; j++) {
                System.out.printf("%20d", respuestas[i][j]);

                totalRespuestas += respuestas[i][j] * (j + 1);
            }

            if (totalRespuestas > mayorPuntuacionTotal) {
                mayorPuntuacionTotal = totalRespuestas;
                temaConMayorPuntuacion = temas[i];
            }

            if (totalRespuestas < menorPuntuacionTotal) {
                menorPuntuacionTotal = totalRespuestas;
                temaConMenorPuntuacion = temas[i];
            }

            double promedio = (double) totalRespuestas / cantidadEncuestados;
            System.out.printf("%19.2f%n", promedio);
        }

        System.out.printf("%nEl tema que recibió la menor puntuación es: %s.%n" + "Puntuación total: %d.%n",
                temaConMenorPuntuacion, menorPuntuacionTotal);
        System.out.printf("%nEl tema que recibió la mayor puntuación es: %s.%n" + "Puntuación total: %d.",
                temaConMayorPuntuacion, mayorPuntuacionTotal);
    }
}