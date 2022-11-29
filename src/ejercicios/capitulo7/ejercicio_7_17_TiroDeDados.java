/*
7.17 (Tiro de dados) Escriba una aplicación para simular el tiro de dos dados. La aplicación debe utilizar un objeto de
la clase Random una vez para tirar el primer dado, y de nuevo para tirar el segundo. Después debe calcularse la
suma de los dos valores. Cada dado puede mostrar un valor entero del 1 al 6, por lo que la suma de los valores variará
del 2 al 12, siendo 7 la suma más frecuente, mientras que 2 y 12 serán las sumas menos frecuentes. En la figura 7.28
se muestran las 36 posibles combinaciones de los dos dados. Su aplicación debe tirar los dados 36,000,000 de veces.
Utilice un arreglo unidimensional para registrar el número de veces que aparezca cada una de las posibles sumas.
Muestre los resultados en formato tabular.
 */

package ejercicios.capitulo7;

import java.util.Random;

public class ejercicio_7_17_TiroDeDados {
    private static final Random numerosAleatorios = new Random();

    public static void main(String[] args) {
        int[] frecuencias = new int[11];

        for (int i = 0; i < 36_000_000; i++) {
            int resultado = tirarDados();
            frecuencias[resultado - 2]++;
        }

        int resultado = 2;

        for (int i = 0; i < frecuencias.length; i++) {
            System.out.printf("%-2d %,12d%n", resultado, frecuencias[i]);
            resultado++;
        }
    }

    public static int tirarDados() {
        int dado1 = 1 + numerosAleatorios.nextInt(6);
        int dado2 = 1 + numerosAleatorios.nextInt(6);

        return dado1 + dado2;
    }
}