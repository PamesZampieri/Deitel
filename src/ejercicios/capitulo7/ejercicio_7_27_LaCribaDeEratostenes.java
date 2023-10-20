/*
7.27 (La criba de Eratóstenes) Un número primo es cualquier entero mayor que 1, divisible sólo por sí mismo y por el
número 1. La Criba de Eratóstenes es un método para encontrar números primos, el cual opera de la siguiente manera:
a) Cree un arreglo del tipo primitivo boolean, con todos los elementos inicializados en true. Loselementos del arreglo
con índices primos permanecerán como true. Cualquier otro elemento del arreglo con el tiempo cambiará a false.
b) Empiece con el índice 2 del arreglo y determine si un elemento dado es true. De ser así, itere a través del resto del
arreglo y asigne false atodo elemento cuyo índice sea múltiplo del índice del elemento que tiene el valor true. Después
continúe el proceso con el siguiente elemento que tenga el valor true. Para el índice 2 del arreglo, todos los elementos
más allá del elemento 2 en el arreglo que tengan índices múltiplos de 2 (los índices 4, 6, 8, 10, etcétera) se
establecerán en false; para el índice 3 del arreglo, todos los elementos más allá del elemento 3 en el arreglo que tengan
índices múltiplos de 3 (los índices 6, 9, 12, 15, etcétera) se establecerán en false; y así en lo sucesivo.
Cuando este proceso termine, los elementos del arreglo que aún sean true indicarán que el índice es un número primo.
Estos índices pueden mostrarse. Escriba una aplicación que utilice un arreglo de 1,000 elementos para determinar e
imprimir los números primos entre 2 y 999. Ignore los elementos 0 y 1 del arreglo.
*/

package ejercicios.capitulo7;

import java.util.Arrays;

public class ejercicio_7_27_LaCribaDeEratostenes {
    private static final boolean[] numerosPrimos = new boolean[1000];

    public static void main(String[] args) {
        Arrays.fill(numerosPrimos, true);

        // Los números 0 y 1 no son primos por definición.
        numerosPrimos[0] = false;
        numerosPrimos[1] = false;

        for (int i = 2; i < numerosPrimos.length; i++) {
            if (numerosPrimos[i]) {
                for (int j = i * 2; j < numerosPrimos.length; j += i) {
                    numerosPrimos[j] = false;
                }
            }
        }

        System.out.println("Utilizando el método La criba de Eratóstenes, se puede saber que los siguientes " +
                "números hasta llegar a 1000, son primos: ");

        imprimirPrimos();
    }

    private static void imprimirPrimos() {
        for (int i = 2; i < numerosPrimos.length; i++) {
            if (numerosPrimos[i]) {
                System.out.printf("%d%n", i);
            }
        }
    }
}