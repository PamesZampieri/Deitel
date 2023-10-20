/*
7.12 (Eliminación de duplicados) Use un arreglo unidimensional para resolver el siguiente problema: escriba una
aplicación que reciba como entrada cinco números, cada uno de los cuales debe estar entre 10 y 100, inclusive.
A medida que se lea cada número, muéstrelo solamente si no es un duplicado de un número que ya se haya leído.
Prepárese para el “peor caso”, en el que los cinco números son diferentes. Use el arreglo más pequeño que sea posible
para resolver este problema. Muestre el conjunto completo de valores únicos introducidos, después de que el usuario
introduzca cada nuevo valor.
*/

package ejercicios.capitulo7;

import java.util.Scanner;

public class ejercicio_7_12_EliminacionDeDuplicados {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escriba cinco números enteros entre 10 y 100 inclusive:  ");
        int[] numerosUnicos = new int[5];
        int indice = 0;

        for (int i = 0; i < numerosUnicos.length; i++) {
            System.out.print("Escriba un número: ");
            int numero = entrada.nextInt();

            if (!contieneNumero(numerosUnicos, numero)) {
                numerosUnicos[indice] = numero;
                indice++;
            }

            System.out.print("Valor/es únicos introducidos: ");
            imprimir(numerosUnicos);
        }
    }

    public static boolean contieneNumero(int[] arreglo, int numero) {
        boolean contiene = false;

        for (int i = 0; i < arreglo.length; i++) {
            if (numero == arreglo[i]) {
                contiene = true;
                break;
            }
        }

        return contiene;
    }

    public static void imprimir(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] != 0) {
                System.out.printf("%d ", arreglo[i]);
            }
        }

        System.out.println();
    }
}