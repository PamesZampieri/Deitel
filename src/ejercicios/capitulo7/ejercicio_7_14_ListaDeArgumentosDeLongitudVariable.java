/*
 7.14 (Lista de argumentos de longitud variable) Escriba una aplicación que calcule el producto de una serie de
enteros que se pasan al método producto; use una lista de argumentos de longitud variable. Pruebe su método con
varias llamadas, cada una con un número distinto de argumentos.
*/

package ejercicios.capitulo7;

public class ejercicio_7_14_ListaDeArgumentosDeLongitudVariable {
    public static int producto(int... numeros) {
        int total = 1;

        for (int numero : numeros) {
            total *= numero;
        }

        return total;
    }

    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 20;
        int numero3 = 30;
        int numero4 = 40;

        System.out.println("Número 1: " + numero1);
        System.out.println("Número 2: " + numero2);
        System.out.println("Número 3: " + numero3);
        System.out.println("Número 4: " + numero4);
        System.out.printf("El producto de %d es %d.%n", numero1, producto(numero1));
        System.out.printf("El producto de %d y %d es %d.%n", numero1, numero2, producto(numero1, numero2));
        System.out.printf("El producto de %d, %d y %d es %d.%n", numero1, numero2, numero3, producto(numero1, numero2,
                numero3));
        System.out.printf("El producto de %d, %d, %d y %d es %d.", numero1, numero2, numero3, numero4,
                producto(numero1, numero2, numero3, numero4));
    }
}