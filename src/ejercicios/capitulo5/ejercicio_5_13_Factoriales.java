/*
5.13 (Factoriales) Los factoriales se utilizan con frecuencia en los problemas de probabilidad. El factorial de un
entero positivo n (se escribe como n! y se pronuncia “factorial de n”) es igual al producto de los enteros positivos del
1 a n. Escriba una aplicación que calcule los factoriales del 1 al 20. Use el tipo long. Muestre los resultados en
formato tabular. ¿Qué dificultad podría impedir que usted calculara el factorial de 100?
*/

package ejercicios.capitulo5;

public class ejercicio_5_13_Factoriales {
    public static void main(String[] args) {
        long factorial = 1;

        System.out.printf("%-10s%-25s%n", "NUMERO", "FACTORIAL");

        for (int i = 1; i <= 20; i++) {
            factorial *= i;

            System.out.printf("%-10d%-,25d%n", i, factorial);
        }
    }
}