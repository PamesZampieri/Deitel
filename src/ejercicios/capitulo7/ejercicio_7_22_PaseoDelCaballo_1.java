/*
7.22 (Paseo del caballo) Un enigma interesante para los entusiastas del ajedrez es el problema del Paseo del caballo,
propuesto originalmente por el matemático Euler. ¿Puede la pieza de ajedrez, conocida como caballo, moverse alrededor de
un tablero de ajedrez vacío y tocar cada una de las 64 posiciones una y sólo una vez? A continuación estudiaremos este
intrigante problema con detalle.
El caballo realiza solamente movimientos en forma de L (dos espacios en una dirección y uno en una dirección
perpendicular). Por lo tanto, como se muestra en la figura 7.30, desde una posición cerca del centro de un tablero de
ajedrez vacío, el caballo (etiquetado como C) puede hacer ocho movimientos distintos (numerados del 0 al 7).
a) Dibuje un tablero de ajedrez de ocho por ocho en una hoja de papel, e intente realizar un Paseo del caballo en forma
manual. Ponga un 1 en la posición inicial, un 2 en la segunda posición, un 3 en la tercera y
así en lo sucesivo. Antes de empezar el paseo, estime qué tan lejos podrá avanzar, recuerde que un paseo
completo consta de 64 movimientos. ¿Qué tan lejos llegó? ¿Estuvo esto cerca de su estimación?
b) Ahora desarrollaremos una aplicación para mover el caballo alrededor de un tablero de ajedrez. El tablero
estará representado por un arreglo bidimensional de ocho por ocho, llamado tablero. Cada posición se
inicializa con cero. Describiremos cada uno de los ocho posibles movimientos en términos de sus componentes horizontales
y verticales. Por ejemplo, un movimiento de tipo 0, como se muestra en la figura 7.30,
consiste en mover dos posiciones en forma horizontal a la derecha y una posición vertical hacia arriba. Un
movimiento de tipo 2 consiste en mover una posición horizontalmente a la izquierda y dos posiciones
verticales hacia arriba. Los movimientos horizontal a la izquierda y vertical hacia arriba se indican con
números negativos.
Deje que las variables filaActual y columnaActual indiquen la fila y columna, respectivamente,
de la posición actual del caballo. Para hacer un movimiento de tipo numeroMovimiento, en donde numeroMovimiento puede
estar entre 0 y 7, su programa debe utilizar las instrucciones
filaActual += vertical[numeroMovimiento];
columnaActual += horizontal[numeroMovimiento];
Escriba una aplicación para mover el caballo alrededor del tablero de ajedrez. Utilice un contador
que varíe de 1 a 64. Registre la última cuenta en cada posición a la que se mueva el caballo. Evalúe cada
movimiento potencial para ver si el caballo ya visitó esa posición. Pruebe cada movimiento potencial para
asegurarse que el caballo no se salga del tablero de ajedrez. Ejecute la aplicación. ¿Cuántos movimientos
hizo el caballo?
*/

package ejercicios.capitulo7;

public class ejercicio_7_22_PaseoDelCaballo_1 {
    private static final int[][] tablero = new int[8][8];
    private static final int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
    private static final int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};
    private static int filaActual = 0;
    private static int columnaActual = 0;
    private static int numeroDeMovimientos = 1;

    public static void main(String[] args) {
        tablero[filaActual][columnaActual] = 1;

        for (int i = 0; i < 63; i++) {
            moverCaballo();
        }

        System.out.printf("Los movimientos que hizo el caballo son: %d%n%n", numeroDeMovimientos);

        imprimirMatriz(tablero);
    }

    public static void moverCaballo() {
        for (int i = 0; i < 8; i++) {
            if (filaActual + vertical[i] >= 0 && filaActual + vertical[i] < 8 && columnaActual + horizontal[i] >= 0 &&
                    columnaActual + horizontal[i] < 8) {
                if (tablero[filaActual + vertical[i]][columnaActual + horizontal[i]] == 0) {
                    filaActual += vertical[i];
                    columnaActual += horizontal[i];

                    numeroDeMovimientos++;

                    tablero[filaActual][columnaActual] = numeroDeMovimientos;
                    break;
                }
            }
        }
    }

    public static void imprimirMatriz(int[][] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {

                if (arreglo[i][j] == 0) {
                    System.out.print("00 ");
                } else {
                    System.out.printf("%2d ", arreglo[i][j]);
                }
            }
            System.out.println();
        }
    }
}