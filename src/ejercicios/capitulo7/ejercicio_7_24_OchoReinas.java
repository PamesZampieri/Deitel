/*
7.24 (Ocho reinas) Otro enigma para los entusiastas del ajedrez es el problema de las Ocho reinas, el cual pregunta lo
siguiente:¿es posible colocar ocho reinas en un tablero de ajedrez vacío, de tal manera que ninguna “ataque” a cualquier
otra (es decir, que no haya dos reinas en la misma fila, en la misma columna o a lo largo de la misma diagonal)?
Use la idea desarrollada en el ejercicio 7.22 para formular una heurística que resuelva el problema de las Ocho reinas.
Ejecute su aplicación. [Sugerencia: es posible asignar un valor a cada una de las posiciones en el tablero de ajedrez,
para indicar cuántas posiciones de un tablero vacío se “eliminan” si una reina se coloca en esa posición. A cada una de
las esquinas se le asignaría el valor 22, como se demuestra en la figura 7.31.Una vez que estos “números de eliminación”
se coloquen en las 64 posiciones, una heurística apropiada podría ser: coloque la siguiente reina en la posición con el
número de eliminación más pequeño. ¿Por qué esta estrategia es intuitivamente atractiva?].
*/

package ejercicios.capitulo7;

public class ejercicio_7_24_OchoReinas {
    private static final int[][] tablero = new int[8][8];
    private static final int[][] accesibilidad = {
            {22, 22, 22, 22, 22, 22, 22, 22},
            {22, 24, 24, 24, 24, 24, 24, 22},
            {22, 24, 26, 26, 26, 26, 24, 22},
            {22, 24, 26, 28, 28, 26, 24, 22},
            {22, 24, 26, 28, 28, 26, 24, 22},
            {22, 24, 26, 26, 26, 26, 24, 22},
            {22, 24, 24, 24, 24, 24, 24, 22},
            {22, 22, 22, 22, 22, 22, 22, 22}};
    private static int filaReina;
    private static int columnaReina;

    public static void main(String[] args) {
        for (int j = 0; j < 8; j++) {
            ponerReina();
        }

        imprimirTablero();
        System.out.println();

        imprimirMatriz();
    }

    private static void ponerReina() {
        int menorAccesibilidad = 29; //bandera
        int filaPotencial = -1; //bandera
        int columnaPotencial = -1; //bandera

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j] == 0) {
                    int accesibilidadCelda = accesibilidad[i][j];

                    if (accesibilidadCelda < menorAccesibilidad) {
                        menorAccesibilidad = accesibilidadCelda;

                        filaPotencial = i;
                        columnaPotencial = j;
                    }
                }
            }
        }

        if (filaPotencial != -1) {
            filaReina = filaPotencial;
            columnaReina = columnaPotencial;
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

    private static void ocuparCasillerosArriba() {
        for (int i = filaReina - 1; i >= 0; i--) {
            tablero[i][columnaReina] = 2; // Se asigna 2 a tablero[i][columnaReina] para marcar las celdas eliminadas.
        }
    }

    private static void ocuparCasillerosArribaDerecha() {
        for (int i = filaReina - 1, j = columnaReina + 1; i >= 0 && j < tablero[filaReina].length; i--, j++) {
            tablero[i][j] = 2;
        }
    }

    private static void ocuparCasillerosDerecha() {
        for (int i = columnaReina + 1; i < tablero[filaReina].length; i++) {
            tablero[filaReina][i] = 2;
        }
    }

    private static void ocuparCasillerosAbajoDerecha() {
        for (int i = filaReina + 1, j = columnaReina + 1; i < tablero.length && j < tablero[filaReina].length; i++, j++) {
            tablero[i][j] = 2;
        }
    }

    private static void ocuparCasillerosAbajo() {
        for (int i = filaReina + 1; i < tablero.length; i++) {
            tablero[i][columnaReina] = 2;
        }
    }

    private static void ocuparCasillerosAbajoIzquierda() {
        for (int i = filaReina + 1, j = columnaReina - 1; i < tablero.length && j >= 0; i++, j--) {
            tablero[i][j] = 2;
        }
    }

    private static void ocuparCasillerosIzquierda() {
        for (int i = columnaReina - 1; i >= 0; i--) {
            tablero[filaReina][i] = 2;
        }
    }

    private static void ocuparCasillerosArribaIzquierda() {
        for (int i = filaReina - 1, j = columnaReina - 1; i >= 0 && j >= 0; i--, j--) {
            tablero[i][j] = 2;
        }
    }

    private static void imprimirTablero() {
        for (int[] filas : tablero) {
            for (int celda : filas) {
                if (celda == 0) {
                    System.out.print(' ');
                } else if (celda == 1) {
                    System.out.print('*');
                } else {
                    System.out.print('@');
                }
            }
            System.out.println();
        }
    }

    private static void imprimirMatriz() {
        for (int[] filas : accesibilidad) {
            for (int celda : filas) {
                System.out.printf("%2d ", celda);
            }
            System.out.println();
        }
    }
}