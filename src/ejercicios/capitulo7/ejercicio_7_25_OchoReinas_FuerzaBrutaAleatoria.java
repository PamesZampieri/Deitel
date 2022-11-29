/*
7.25 (Ocho reinas: métodos de fuerza bruta) En este ejercicio usted desarrollará varios métodos de fuerza bruta para
resolver el problema de las Ocho reinas que presentamos en el ejercicio 7.24.
a) Utilice la técnica de la fuerza bruta aleatoria desarrollada en el ejercicio 7.23, para resolver el problema de las
Ocho reinas.
b) Utilice una técnica exhaustiva (es decir, pruebe todas las combinaciones posibles de las ocho reinas en el tablero)
para resolver el problema.
c) ¿Por qué el método de la fuerza bruta exhaustiva podría no ser apropiado para resolver el problema del Paseo del
caballo?
d) Compare y contraste el método de la fuerza bruta aleatoria con el de la fuerza bruta exhaustiva.
*/

package ejercicios.capitulo7;

import java.util.Random;

public class ejercicio_7_25_OchoReinas_FuerzaBrutaAleatoria {
    private static final Random numerosAleatorios = new Random();
    private static int[][] tablero;
    private static int filaReina = 0;
    private static int columnaReina = 0;
    private static int numeroDeMovimientos;

    public static void main(String[] args) {
        for (int i = 0; i < 1_000_000; i++) {
            tablero = new int[8][8];
            numeroDeMovimientos = 0;

            for (int j = 0; j < 8; j++) {
                ponerReina();
            }

            if (numeroDeMovimientos == 8) {
                System.out.printf("Cantidad de intentos para posicionar las 8 reinas: %d%n", i + 1);
                break;
            }
        }

        imprimirTablero(tablero);
        System.out.println();
    }

    public static void ponerReina() {
        for (int i = 0; i < 50; i++) {
            int indiceFila = numerosAleatorios.nextInt(8);
            int indiceColumna = numerosAleatorios.nextInt(8);

            if (tablero[indiceFila][indiceColumna] == 0) {
                filaReina = indiceFila;
                columnaReina = indiceColumna;

                numeroDeMovimientos++;
                break;
            }
        }

        tablero[filaReina][columnaReina] = 1;

        ocuparCasillerosArriba();
        ocuparCasillerosArribaDerecha();
        ocuparCasillerosDerecha();
        ocuparCasillerosAbajoDerecha();
        ocuparCasillerosAbajo();
        ocuparCasillerosAbajoIzquierda();
        ocuparCasillerosIzquierda();
        ocuparCasillerosArribaIzquierda();
    }

    public static void ocuparCasillerosArriba() {
        for (int i = filaReina - 1; i >= 0; i--) {
            tablero[i][columnaReina] = 2;
        }
    }

    public static void ocuparCasillerosArribaDerecha() {
        for (int i = filaReina - 1, j = columnaReina + 1; i >= 0 && j < tablero[filaReina].length; i--, j++) {
            tablero[i][j] = 2;
        }
    }

    public static void ocuparCasillerosDerecha() {
        for (int i = columnaReina + 1; i < tablero[filaReina].length; i++) {
            tablero[filaReina][i] = 2;
        }
    }

    public static void ocuparCasillerosAbajoDerecha() {
        for (int i = filaReina + 1, j = columnaReina + 1; i < tablero.length && j < tablero[filaReina].length; i++, j++) {
            tablero[i][j] = 2;
        }
    }

    public static void ocuparCasillerosAbajo() {
        for (int i = filaReina + 1; i < tablero.length; i++) {
            tablero[i][columnaReina] = 2;
        }
    }

    public static void ocuparCasillerosAbajoIzquierda() {
        for (int i = filaReina + 1, j = columnaReina - 1; i < tablero.length && j >= 0; i++, j--) {
            tablero[i][j] = 2;
        }
    }

    public static void ocuparCasillerosIzquierda() {
        for (int i = columnaReina - 1; i >= 0; i--) {
            tablero[filaReina][i] = 2;
        }
    }

    public static void ocuparCasillerosArribaIzquierda() {
        for (int i = filaReina - 1, j = columnaReina - 1; i >= 0 && j >= 0; i--, j--) {
            tablero[i][j] = 2;
        }
    }

    public static void imprimirTablero(int[][] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                if (arreglo[i][j] == 0) {
                    System.out.print(' ');
                } else if (arreglo[i][j] == 1) {
                    System.out.print('*');
                } else {
                    System.out.print('@');
                }
            }
            System.out.println();
        }
    }
}