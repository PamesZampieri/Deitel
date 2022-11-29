/*
6.30 (Adivine el número) Escriba una aplicación que juegue a “adivinar el número” de la siguiente manera: su programa
elige el número a adivinar, para lo cual selecciona un entero aleatorio en el rango de 1 a 1000. La aplicación muestra
el indicador Adivine un número entre 1 y 1000. El jugador escribe su primer intento. Si la respuesta del jugador es
incorrecta, su programa debe mostrar el mensaje Demasiado alto. Intente de nuevo. o Demasiado bajo. Intente
de nuevo., para ayudar a que el jugador “se acerque” a la respuesta correcta. El programa debe pedir al usuario que
escriba su siguiente intento. Cuando el usuario escriba la respuesta correcta, muestre el mensaje Felicidades. Adivino
el numero! y permita que el usuario elija si desea jugar otra vez. [Nota: la técnica para adivinar empleada en este
problema es similar a una búsqueda binaria, que veremos en el capítulo 19, Búsqueda, ordenamiento y Big O]
*/

package ejercicios.capitulo6;

import java.security.SecureRandom;
import java.util.Scanner;

public class ejercicio_6_30_AdivineElNumero {
    private static final SecureRandom numerosAleatorios = new SecureRandom();

    public static void main(String[] args) {
        int numeroGanador = 1 + numerosAleatorios.nextInt(1000);

        Scanner entrada = new Scanner(System.in);

        System.out.print("Adivine un número entero entre 1 y 1000: ");
        int numero = entrada.nextInt();

        while (numero != numeroGanador) {
            if (numero > numeroGanador) {
                System.out.println("Demasiado Alto! Intente de nuevo.");
            } else {
                System.out.println("Demasiado Bajo! Intente de nuevo.");
            }

            System.out.print("Nuevo intento: ");
            numero = entrada.nextInt();
        }

        System.out.print("Felicidades! Adivinó el número!");
    }
}
