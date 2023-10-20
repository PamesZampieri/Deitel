/*
6.31 (Modificación de adivine el número) Modifique el programa del ejercicio 6.30 para contar el número
de intentos que haga el jugador. Si el número es menor de 10, imprima el mensaje ¡O ya sabía usted el secreto,
o tuvo suerte! Si el jugador adivina el número en 10 intentos, muestre en pantalla el mensaje ¡Aja! ¡Sabía usted
el secreto! Si el jugador hace más de 10 intentos, muestre en pantalla ¡Deberia haberlo hecho mejor!.
¿Por qué no se deben requerir más de 10 intentos? Bueno, en cada “buen intento”, el jugador debe poder eliminar la mitad
de los números, después la mitad de los restantes, y así en lo sucesivo.
*/

package ejercicios.capitulo6;

import java.security.SecureRandom;
import java.util.Scanner;

public class ejercicio_6_31_AdivineElNumeroModificado {
    private static final SecureRandom numerosAleatorios = new SecureRandom();

    public static void main(String[] args) {
        int numeroGanador = 1 + numerosAleatorios.nextInt(1000);
        int opcion = 1;

        Scanner entrada = new Scanner(System.in);

        while (opcion != 2) {
            System.out.print("Adivine un número entero entre 1 y 1000: ");
            int numero = entrada.nextInt();
            int cantidadDeIntentos = 1;

            while (numero != numeroGanador) {
                if (numero > numeroGanador) {
                    System.out.println("Demasiado Alto! Intente de nuevo.");
                } else {
                    System.out.println("Demasiado Bajo! Intente de nuevo.");
                }

                System.out.print("Nuevo intento: ");
                numero = entrada.nextInt();
                cantidadDeIntentos++;
            }

            System.out.println("Felicidades! Adivinó el número!");

            if (cantidadDeIntentos < 10) {
                System.out.println("¡O ya sabía usted el secreto o tuvo suerte!");
            } else if (cantidadDeIntentos == 10) {
                System.out.println("¡Ajá! ¡sabía usted el secreto!");
            } else {
                System.out.println("¡Debería haberlo hecho mejor!");
            }

            System.out.print("¿Desea jugar otra vez? Presione 1 o presione 2 si desea terminar: ");
            opcion = entrada.nextInt();
        }
    }
}