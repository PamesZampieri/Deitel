/*
5.31 (Examen rápido sobre hechos del calentamiento global) La controversial cuestión del calentamiento global
obtuvo una gran publicidad gracias a la película “Una verdad incómoda” (An Inconvenient Truth) en la que aparece
el anterior vicepresidente Al Gore. El señor Gore y una red de científicos de Naciones Unidas,el Panel Intergubernamental
sobre el Cambio Climático, compartieron el Premio Nobel de la Paz de 2007 en reconocimiento por
“sus esfuerzos al generar y diseminar un mayor conocimiento sobre el cambio climatológico provocado por el hombre”.
Investigue en línea ambos lados de la cuestión del calentamiento global (tal vez quiera buscar frases como “escépticos
del calentamiento global”). Cree un examen rápido de opción múltiple con cinco preguntas sobre el calentamiento
global; cada pregunta debe tener cuatro posibles respuestas (enumeradas del 1 al 4). Sea objetivo y trate de representar
con imparcialidad ambas posturas sobre el tema. Después escriba una aplicación que administre el examen rápido,
calcule el número de respuestas correctas (de cero a cinco) y devuelva un mensaje al usuario. Si éste responde de manera
correcta a las cinco preguntas, imprima el mensaje “Excelente”; si responde a cuatro, imprima “Muy bien”; si
responde a tres o menos, imprima “Es tiempo de aprender más sobre el calentamiento global”, e incluya una lista de
algunos de los sitios Web en donde encontró esos hechos.
*/

package ejercicios.capitulo5;

import java.util.Scanner;

public class ExamenCalentamientoGlobal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int respuestasCorrectas = 0;

        System.out.println("Responda este pequeño examen sobre el Calentamiento Global, escriba el número 1, 2, 3 ó 4, " +
                "para indicar las respuesta que considera correcta: ");
        System.out.println("a- ¿Qué es el calentamiento global?: ");
        System.out.println("1- Aquel originado por procesos naturales internos o por forzamientos externos también " +
                "naturales, como la modulación en los ciclos solares o las erupciones volcánicas.");
        System.out.println("2- También llamado calentamiento mundial, es el aumento a largo plazo de la temperatura media " +
                "del sistema climático de la Tierra. Es un aspecto primordial del cambio climático actual, demostrado " +
                "por la medición directa de la temperatura y de varios efectos del calentamiento.");
        System.out.println("3- Es aquel  causado por cambios inducidos por el hombre de forma persistente en la " +
                "composición de la atmósfera.");
        System.out.println("4- Es el llamado cambio climático.");
        int respuesta = entrada.nextInt();
        System.out.println();

        if (respuesta == 2) {
            respuestasCorrectas++;
        }

        System.out.println("b- ¿Qué afirman los llamados escépticos del calentamiento global?: ");
        System.out.println("1- Afirman que el dióxido de carbono es la principal causa del calentamiento global.");
        System.out.println("2- Creen que hay otras causas más importantes, como la radiación solar o cósmica. Indican" +
                " que el mayor problema es que la ciencia del medio ambiente ya no responde a la curiosidad de entender " +
                "determinados procesos y relaciones con resultados abiertos, sino que muchos de sus campos han derivado " +
                "en una investigación orientada a la demanda pública y a los intereses políticos.");
        System.out.println("3- Indican que la teoría dice que la formación de nubes aumenta cuando la actividad solar " +
                "disminuye y la radiación galáctica llega en mayor cantidad a la Tierra.");
        System.out.println("4- La respuesta 2 y 3 son corectas.");
        respuesta = entrada.nextInt();
        System.out.println();

        if (respuesta == 4) {
            respuestasCorrectas++;
        }

        System.out.println("c- ¿Qué es el efecto invernadero?: ");
        System.out.println("1- Es un fenómeno natural por el que unos gases determinados que componen la atmósfera retienen" +
                " parte de la energía solar reflejada por el suelo, absorbiéndola y transformándola en un movimiento " +
                "molecular interno que produce un aumento de la temperatura.");
        System.out.println("2- Es un fenómeno natural sin el cual, la temperatura media en la superficie seria de 18°C " +
                "bajo cero, no haciendo posible la vida en el planeta.");
        System.out.println("3- Ha potenciado los casos de malaria, salmonelosis, diarreas causando deshidratación en los " +
                "niños y otras infecciones intestinales.");
        System.out.println("4- Todas las respuestas son correctas");
        respuesta = entrada.nextInt();
        System.out.println();

        if (respuesta == 4) {
            respuestasCorrectas++;
        }

        System.out.println("d- ¿Qué es el cambio climático?: ");
        System.out.println("1- Se refiere a una variación significativa en los componentes del clima cuando se comparan " +
                "períodos prolongados, pudiendo ser décadas o más. Por ejemplo, la temperatura media de la década del 50" +
                " con respecto a la temperatura media de la década del 90.");
        System.out.println("2- Incluye tanto el calentamiento global como sus efectos en el clima.");
        System.out.println("3- Las respuestas 1 y 2 son correctas.");
        System.out.println("4- Es es el incremento global en las temperaturas de superficie y su aumento proyectado causado" +
                " predominantemente por actividades humanas (antrópico).");
        respuesta = entrada.nextInt();
        System.out.println();

        if (respuesta == 3) {
            respuestasCorrectas++;
        }

        System.out.println("e- ¿Cuál de éstas acciones podrían contribuir a evitar el Calentamiento Global?: ");
        System.out.println("1- Usa menos tu coche y más el transporte colectivo. Si la topografía de tu localidad lo " +
                "permite, usa la bici para reducir las emisiones de CO2.");
        System.out.println("2- Utiliza electrodomésticos ahorradores de energía. Apágalos cuando no los uses y regula el" +
                " termostato de tu equipo calefactor o refrigerante.");
        System.out.println("3- Ahorra el agua. Cierra el grifo cuando no lo uses y realiza mantenimiento sobre el buen " +
                "funcionamiento del sistema.");
        System.out.println("4- Todas las respuestas son correctas.");
        respuesta = entrada.nextInt();
        System.out.println();

        if (respuesta == 4) {
            respuestasCorrectas++;
        }

        switch (respuestasCorrectas) {
            case 5:
                System.out.println("Excelente!\n");
                break;
            case 4:
                System.out.println("Muy Bien!\n");
                break;
            default:
                System.out.println("Es tiempo de aprender más sobre el Calentamiento Global =(\n");
        }

        System.out.print("Bibliografía:\n" +
                "https://www.dw.com/es/esc%C3%A9pticos-del-clima-el-calentamiento-global-divide-a-la-comunidad-cient%C3%ADfica/a-15811867#:~:text=Los%20cient%C3%ADficos%20del%20medio%20ambiente,la%20radiaci%C3%B3n%20solar%20o%20c%C3%B3smica.\n" +
                "https://www.bbva.com/es/sostenibilidad/que-es-el-calentamiento-global/\n" +
                "https://www.nationalgeographic.es/medio-ambiente/que-es-el-calentamiento-global\n" +
                "https://es.wikipedia.org/wiki/Calentamiento_global\n" +
                "https://www.iagua.es/respuestas/que-es-efecto-invernadero\n" +
                "https://www.argentina.gob.ar/ambiente/cambio-climatico/que-es-el-cambio-climatico\n" +
                "https://www.fundacionaquae.org/wiki/como-evitar-calentamiento-global/amp/\n");
    }
}