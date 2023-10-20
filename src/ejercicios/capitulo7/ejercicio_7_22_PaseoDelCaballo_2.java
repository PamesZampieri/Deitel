/*
7.22 (Paseo del caballo):
Continuación:
c) Después de intentar escribir y ejecutar una aplicación de Paseo del caballo, probablemente haya desarrollado algunas
ideas valiosas. Utilizaremos estas ideas para desarrollar una heurística (o regla empírica) para mover el caballo. La
heurística no garantiza el triunfo, pero una heurística desarrollada con cuidado mejora de manera considerable la
probabilidad de tener éxito. Tal vez usted ya observó que las posiciones externas son más difíciles que las cercanas al
centro del tablero. De hecho, las posiciones más difíciles o inaccesibles son las cuatro esquinas. La intuición sugiere
que usted debe intentar mover primero el caballo a las posiciones más problemáticas y dejar pendientes aquellas a las que
sea más fácil llegar, de manera que cuando el tablero se congestione cerca del final del paseo, habrá una mayor
probabilidad de éxito.
Podríamos desarrollar una “heurística de accesibilidad” al clasificar cada una de las posiciones de acuerdo con qué tan
accesibles son y luego mover siempre el caballo (usando los movimientos en L) a la posición más inaccesible.
Etiquetaremos un arreglo bidimensional llamado accesibilidad con números que indiquen desde cuántas posiciones es
accesible una posición determinada.
En un tablero de ajedrez en blanco, cada una de las 16 posiciones más cercanas al centro se clasifican con 8; cada
posición en la esquina se clasifica con 2; y las demás posiciones tienen números de accesibilidad 3, 4 o 6.
Escriba una nueva versión del Paseo del caballo; use la heurística de accesibilidad. El caballo deberá moverse siempre
a la posición con el número de accesibilidad más bajo. En caso de un empate, el caballo podrá moverse a cualquiera de
las posiciones empatadas. Por lo tanto, el paseo puede empezar en cualquiera de las cuatro esquinas.
[Nota: al ir moviendo el caballo alrededor del tablero, su aplicación deberá reducir los números de accesibilidad a
medida que se vayan ocupando más posiciones. De esta manera y en cualquier momento dado durante el paseo, el número de
accesibilidad de cada una de las posiciones disponibles seguirá siendo igual al número preciso de posiciones desde las
que se puede llegar a esa posición].
Ejecute esta versión de su aplicación. ¿Logró completar el paseo? Modifique el programa para realizar 64 paseos, en
donde cada uno empiece desde una posición distinta en el tablero. ¿Cuántos paseos completos logró realizar?

d) Escriba una versión del programa del Paseo del caballo que, al encontrarse con un empate entre dos o más posiciones,
decida qué posición elegir, más adelante busque aquellas posiciones que se puedan alcanzar desde las posiciones
“empatadas”. Su aplicación debe mover el caballo a la posición empatada para la cual el siguiente movimiento lo lleve a
una posición con el número de accesibilidad más bajo.
*/

package ejercicios.capitulo7;

public class ejercicio_7_22_PaseoDelCaballo_2 {
    private static final int[][] tablero = new int[8][8];
    private static final int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
    private static final int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};
    private static int filaActual = 0;
    private static int columnaActual = 0;
    private static int numeroDeMovimientos = 1;
    private static final int[][] accesibilidad = {
            {2, 3, 4, 4, 4, 4, 3, 2},
            {3, 4, 6, 6, 6, 6, 4, 3},
            {4, 6, 8, 8, 8, 8, 6, 4},
            {4, 6, 8, 8, 8, 8, 6, 4},
            {4, 6, 8, 8, 8, 8, 6, 4},
            {4, 6, 8, 8, 8, 8, 6, 4},
            {3, 4, 6, 6, 6, 6, 4, 3},
            {2, 3, 4, 4, 4, 4, 3, 2}};

    public static void main(String[] args) {
        tablero[filaActual][columnaActual] = 1;

        for (int j = 0; j < 64; j++) {
            moverCaballo();
        }

        System.out.printf("Los movimientos que hizo el caballo son: %d%n%n", numeroDeMovimientos);

        imprimirMatriz(tablero);
        System.out.println();

        imprimirMatriz(accesibilidad);
        System.out.println();
    }

    private static void moverCaballo() {
        int menorAccesibilidad = 9; //bandera
        int movimientoPotencial = -1; //bandera

        for (int i = 0; i < 8; i++) {
            if (estaDentroDeTablero(i)) {
                if (esCeldaVacia(i)) {
                    int accesibilidadPotencial = accesibilidad[filaActual + vertical[i]][columnaActual + horizontal[i]];

                    if (accesibilidadPotencial < menorAccesibilidad) {
                        menorAccesibilidad = accesibilidadPotencial;
                        movimientoPotencial = i;
                    }
                }

                accesibilidad[filaActual + vertical[i]][columnaActual + horizontal[i]]--;
            }
        }

        if (movimientoPotencial != -1) {
            filaActual += vertical[movimientoPotencial];
            columnaActual += horizontal[movimientoPotencial];

            numeroDeMovimientos++;

            tablero[filaActual][columnaActual] = numeroDeMovimientos;
        }
    }

    private static boolean estaDentroDeTablero(int movimiento) {
        return filaActual + vertical[movimiento] >= 0 && filaActual + vertical[movimiento] < 8 &&
                columnaActual + horizontal[movimiento] >= 0 && columnaActual + horizontal[movimiento] < 8;
    }

    private static boolean esCeldaVacia(int movimiento) {
        return tablero[filaActual + vertical[movimiento]][columnaActual + horizontal[movimiento]] == 0;
    }

    private static void imprimirMatriz(int[][] matriz) {
        for (int[] filas : matriz) {
            for (int celda : filas) {
                if (celda == 0) {
                    System.out.print("00 ");
                } else {
                    System.out.printf("%2d ", celda);
                }
            }
            System.out.println();
        }
    }
}