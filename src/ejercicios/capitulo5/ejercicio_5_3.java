/*
Escriba una instrucción o un conjunto de instrucciones en Java, para realizar cada una de las siguientes
tareas:
 */

package ejercicios.capitulo5;

public class ejercicio_5_3 {
    public static void main(String[] args) {
        /*
        a) Sumar los enteros impares entre 1 y 99, utilizando una instrucción for. Suponga que se han declarado las
        variables enteras cuenta y suma.
         */

        int suma = 0;

        for (int cuenta = 1; cuenta <= 99; cuenta += 2) {
            suma += cuenta;
        }

        System.out.printf("El total de la suma de los enteros impares del 1 al 99 es %d.%n", suma);

        /*
        b) Calcular el valor de 2.5 elevado a la potencia de 3, mediante el método pow.
         */

        System.out.printf("El valor de 2,5 elevado al cubo es: %.2f%n", Math.pow(2.5, 3));
        System.out.println();

        /*
        c) Imprimir los enteros del 1 al 20, utilizando un ciclo while y la variable contador i. Suponga que
        la variable i se ha declarado, pero no se ha inicializado. Imprima solamente cinco enteros por línea.
        [Sugerencia: use el cálculo i % 5. Cuando el valor de esta expresión sea 0, imprima un carácter de
        nueva línea; de lo contrario, imprima un carácter de tabulación. Suponga que este código es una aplicación.
        Utilice el método System.out.println() para producir el carácter de nueva línea, y el método
        System.out.print(‘\t’) para producir el carácter de tabulación].


        int i = 1;

        while (i <= 20) {
            System.out.printf("%d", i);

            if (i % 5 == 0) {
                System.out.println();
            } else {
                System.out.print('\t');
            }

            i++;
        }

        d) Repita la parte (c), usando una instrucción for.
         */

        for (int i = 1; i <= 20; i++) {
            System.out.printf("%d", i);

            if (i % 5 == 0) {
                System.out.println();
            } else {
                System.out.print('\t');
            }
        }
    }
}
