/*
7.23 (Paseo del caballo: métodos de fuerza bruta) En el inciso (c) del ejercicio 7.22, desarrollamos una solución al
problema del Paseo del caballo. El método utilizado, llamado “heurística de accesibilidad”, genera muchas soluciones y
se ejecuta con eficiencia.
A medida que se incremente de manera continua la potencia de las computadoras, seremos capaces de resolver más problemas
con menos potencia y algoritmos relativamente menos sofisticados. A éste le podemos llamar el método de la “fuerza bruta”
para resolver problemas.
a) Utilice la generación de números aleatorios para permitir que el caballo se desplace a lo largo del tablero (mediante
sus movimientos legítimos en L) en forma aleatoria. Su aplicación debe ejecutar un paseo e imprimir el tablero final.
¿Qué tan lejos llegó el caballo?
b) La mayoría de las veces, la aplicación de la parte (a) produce un paseo relativamente corto. Ahora modifique su
aplicación para intentar 1,000 paseos. Use un arreglo unidimensional para llevar el registro del número de paseos de
cada longitud. Cuando su programa termine de intentar los 1,000 paseos, deberá imprimir esta información en un formato
tabular ordenado. ¿Cuál fue el mejor resultado?
c) Es muy probable que la aplicación del inciso (b) le haya brindado algunos paseos “respetables”, pero no completos.
Ahora deje que su aplicación se ejecute hasta que produzca un paseo completo. [Precaución: esta versión del programa
podría ejecutarse durante horas en una computadora poderosa]. Una vez más, mantenga una tabla del número de paseos de
cada longitud e imprímala cuando se encuentre el primer paseo completo. ¿Cuántos paseos intentó su programa antes de
producir uno completo? ¿Cuánto tiempo se tomó?
d) Compare la versión de la fuerza bruta del Paseo del caballo con la versión heurística de accesibilidad. ¿Cuál requirió
un estudio más cuidadoso del problema? ¿Qué algoritmo fue más difícil de desarrollar? ¿Cuál necesitó más poder de
cómputo? ¿Podríamos tener la certeza (por adelantado) de obtener un paseo completo mediante el método de la heurística
de accesibilidad? ¿Podríamos tener la certeza (por adelantado) de obtener un paseo completo mediante el método de la
fuerza bruta? Argumente las ventajas y desventajas de solucionar el problema mediante la fuerza bruta en general.
*/

package ejercicios.capitulo7;

import java.util.Random;

public class ejercicio_7_23_PaseoDelCaballo_FuerzaBrutaAleatoria {
    private static final Random numerosAleatorios = new Random();
    private static int[][] tablero;
    private static final int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
    private static final int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};
    private static final int[] frecuenciasMovimientoCaballo = new int[65];
    private static int filaActual;
    private static int columnaActual;
    private static int numeroDeMovimientos = 1;
    private static int maximoMovimiento = 0;
    private static int cantidadDePaseos = 0;

    public static void main(String[] args) {
        for (int i = 0; i < 1_000_000; i++) {
            tablero = new int[8][8];
            numeroDeMovimientos = 1;

            filaActual = numerosAleatorios.nextInt(8);
            columnaActual = numerosAleatorios.nextInt(8);
            tablero[filaActual][columnaActual] = numeroDeMovimientos;

            for (int j = 0; j < 63; j++) {
                moverCaballo();
            }

            cantidadDePaseos++;
            frecuenciasMovimientoCaballo[numeroDeMovimientos]++;

            if (numeroDeMovimientos > maximoMovimiento) {
                maximoMovimiento = numeroDeMovimientos;
            }

            if (numeroDeMovimientos == 64) {
                break;
            }
        }

        imprimirFrecuenciasMovimientoCaballo();
        System.out.printf("%nMáximo movimiento del caballo: %d%n", maximoMovimiento);
    }

    public static void moverCaballo() {
        for (int i = 0; i < 50; i++) {
            int indice = numerosAleatorios.nextInt(8);

            if (estaDentroDeTablero(indice) && esCeldaVacia(indice)) {
                filaActual += vertical[indice];
                columnaActual += horizontal[indice];

                numeroDeMovimientos++;

                tablero[filaActual][columnaActual] = numeroDeMovimientos;
                break;
            }
        }
    }

    private static boolean estaDentroDeTablero(int movimiento) {
        return filaActual + vertical[movimiento] >= 0 && filaActual + vertical[movimiento] < 8 &&
                columnaActual + horizontal[movimiento] >= 0 && columnaActual + horizontal[movimiento] < 8;
    }

    private static boolean esCeldaVacia(int movimiento) {
        return tablero[filaActual + vertical[movimiento]][columnaActual + horizontal[movimiento]] == 0;
    }

    private static void imprimirFrecuenciasMovimientoCaballo() {
        System.out.printf("%-30s%s%n", "MOVIMIENTOS DEL CABALLO", "RESULTADOS");

        for (int i = 1; i < frecuenciasMovimientoCaballo.length; i++) {
            System.out.printf("%2d :  %34d", i, frecuenciasMovimientoCaballo[i]);
            System.out.println();
        }

        System.out.printf("%s%,34d%n", "TOTAL:", cantidadDePaseos);
    }
}