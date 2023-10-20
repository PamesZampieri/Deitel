/*
7.28 (Simulación: La tortuga y la liebre) En este problema, usted recreará la clásica carrera de la tortuga y la liebre.
Utilizará la generación de números aleatorios para desarrollar una simulación de este memorable suceso. Nuestros
competidores empezarán la carrera en la posición 1 de 70 posiciones. Cada una representa a una posible posición a lo
largo del curso de la carrera. La línea de meta se encuentra en la 70. El primer competidor en llegar a la posición 70 o
más allá recibirá una cubeta llena con zanahorias y lechuga frescas. El recorrido se abre paso hasta la cima de una
resbalosa montaña, por lo que en ocasiones los competidores pierden terreno. Un reloj hace tictac una vez por segundo.
Con cada tic del reloj, su aplicación debe ajustar la posición de los animales de acuerdo con las reglas de la figura
7.32. Use variables para llevar el registro de las posiciones de los animales (los números son del 1 al 70). Empiece con
cada animal en la posición 1 (la “puerta de inicio”). Si un animal se resbala hacia la izquierda antes de la posición 1,
regréselo a la posición 1.
Genere los porcentajes en la figura 7.32 al producir un entero aleatorio i en el rango 1 ≤ i ≤ 10. Para la tortuga,
realice un “paso pesado rápido” cuando 1 ≤ i ≤ 5, un “resbalón” cuando 6 ≤ i ≤ 7 o un “paso pesado lento” cuando
8 ≤ i ≤ 10. Utilice una técnica similar para mover a la liebre.
Empiece la carrera imprimiendo el mensaje
PUM !!!!!
Y ARRANCAN !!!!!
Luego, para cada tic tac del reloj (es decir, cada repetición de un ciclo) imprima una línea de 70 posiciones, mostrando
la letra T en la posición de la tortuga y la letra H en la posición de la liebre. En ocasiones los competidores se
encontrarán en la misma posición. En este caso, la tortuga muerde a la liebre y su aplicación debe imprimir OUCH!!!
empezando en esa posición. Todas las posiciones de impresión distintas de la T, la H o el mensaje OUCH!!! (en caso de
un empate) deben estar en blanco.
Después de imprimir cada línea, compruebe si uno de los animales llegó o se pasó de la posición 70. De ser así, imprima
quién fue el ganador y termine la simulación. Si la tortuga gana, imprima LA TORTUGA GANA!!! YAY!!!
Si la liebre gana, imprima La liebre gana. Que mal. Si ambos animales ganan en el mismo tic tac del reloj, tal vez usted
quiera favorecer a la tortuga (la más débil) o tal vez quiera imprimir Es un empate. Si ninguno de los dos animales gana,
ejecute el ciclo de nuevo para simular el siguiente tic tac del reloj. Cuando esté listo para ejecutar
su aplicación, reúna a un grupo de aficionados para que vean la carrera. ¡Se sorprenderá al ver lo participativa que
puede ser su audiencia.
*/

package ejercicios.capitulo7;

import java.util.Arrays;
import java.util.Random;

public class ejercicio_7_28_SimulacionLaTortugaYLaLiebre {
    private static final Random numerosAleatorios = new Random();
    private static final char[] pista = new char[71];
    private static int posicionTortuga;
    private static int posicionLiebre;
    private static int cantidadDeCarreras = 1;

    public static void main(String[] args) {
        Arrays.fill(pista, ' ');

        while (posicionLiebre < 70 && posicionTortuga < 70) {
            posicionTortuga = 1;
            posicionLiebre = 1;

            System.out.printf("%s%n%s%d%s%n%n", "PUM!!!", "Y ARRANCA LA CARRERA ", cantidadDeCarreras, "!!!");
            System.out.printf("POSICIÓN INICIAL TORTUGA: %d%n", posicionTortuga);
            System.out.printf("POSICIÓN INICIAL LIEBRE: %d%n%n", posicionLiebre);

            for (int j = 0; j < 60; j++) {
                int ticReloj = 1 + numerosAleatorios.nextInt(10);
                System.out.printf("Ajustar las posiciones en %d para ambos!%n", ticReloj);

                moverTortuga(ticReloj);
                moverLiebre(ticReloj);

                imprimirPista();
                System.out.println();

                if (posicionLiebre == 70 || posicionTortuga == 70) {
                    break;
                }
            }

            if (posicionTortuga >= 70 && posicionLiebre >= 70) {
                System.out.println("Es un empate!!!");
            } else if (posicionTortuga >= 70) {
                System.out.println("LA TORTUGA GANA!!! YAY!!!");
            } else if (posicionLiebre >= 70) {
                System.out.println("La Liebre gana. Que mal!");
            }

            cantidadDeCarreras++;
        }
    }

    private static void moverTortuga(int opcion) {
        switch (opcion) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                posicionTortuga += 3;

                if (posicionTortuga > 70) {
                    posicionTortuga = 70;
                }
                break;
            case 6:
            case 7:
                posicionTortuga -= 6;

                if (posicionTortuga < 1) {
                    posicionTortuga = 1;
                }
                break;
            case 8:
            case 9:
            case 10:
                posicionTortuga++;

                if (posicionTortuga > 70) {
                    posicionTortuga = 70;
                }
                break;
        }
    }

    private static void moverLiebre(int opcion) {
        switch (opcion) {
            case 3:
            case 4:
                posicionLiebre += 9;

                if (posicionLiebre > 70) {
                    posicionLiebre = 70;
                }
                break;
            case 5:
                posicionLiebre -= 12;

                if (posicionLiebre < 1) {
                    posicionLiebre = 1;
                }
                break;
            case 6:
            case 7:
            case 8:
                posicionLiebre++;

                if (posicionLiebre > 70) {
                    posicionLiebre = 70;
                }
                break;
            case 9:
            case 10:
                posicionLiebre -= 2;

                if (posicionLiebre < 1) {
                    posicionLiebre = 1;
                }
                break;
            default:
        }
    }

    private static void imprimirPista() {
        pista[posicionTortuga] = 'T';
        pista[posicionLiebre] = 'H';

        if (posicionTortuga == posicionLiebre) {
            pista[posicionTortuga] = 'E';
        }

        System.out.print("|");
        for (int i = 1; i < pista.length; i++) {
            if (pista[i] == ' ') {
                System.out.print('_');
            } else if (pista[i] == 'E') {
                System.out.print("OUCH!!!");
            } else {
                System.out.printf("%c", pista[i]);
            }
        }
        System.out.print("|");
        System.out.println();

        pista[posicionTortuga] = ' ';
        pista[posicionLiebre] = ' ';
    }
}