/*
4.37 (Factorial) El factorial de un entero n no negativo se escribe como n! (se pronuncia “factorial de n”) y se define
de la siguiente manera:
n! = n ∙ (n – 1) ∙ (n – 2) ∙ ... ∙ 1 (para valores de n mayores o iguales a 1)
y
n! = 1 (para n = 0)
Por ejemplo, 5! = 5 ∙ 4 ∙ 3 ∙ 2 ∙ 1, que es 120
 */

package ejercicios.capitulo4;

import java.util.Scanner;

public class ejercicio_4_37_Factorial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // a) Escriba una aplicación que lea un entero no negativo, y calcule e imprima su factorial.

        System.out.print("Escriba un número entero positivo: ");
        int numero = entrada.nextInt();
        int resultado = numero;
        numero--;


        while (numero != 0) {
            resultado *= numero;
            numero--;
        }
        System.out.printf("El factorial del número ingresado es: %d%n", resultado);

        /*
        b) Escriba una aplicación que estime el valor de la constante matemática e, utilizando la siguiente fórmula.
       Deje que el usuario introduzca el número de términos a calcular.
       e = 1 + 1 + 1 + 1 + ...
               1!  2!  3!

       "Se asume que el usuario ingresa números 1 - n."
       */

        System.out.print("Escriba un número mayor a 0: ");
        double num = entrada.nextDouble();
        double e = 1;
        double i = 1;
        double factorial = 1;
        num--;

        while (num > 0) {
            e += 1 / factorial;
            factorial *= ++i;
            num--;
        }
        System.out.printf("El valor de la constante e, usando la cantidad de términos ingresados es: %.4f%n", e);

       /*
        c)Escriba una aplicación que calcule el valor de ex, utilizando la siguiente fórmula. Deje que el usuario
        introduzca el número de términos a calcular.

        ex = 1 + x + x2 + x3 + ...
                 1!  2!   3!

        "Se asume que el usuario ingresa números 1 - n."
        */

        System.out.print("Escriba un número mayor a 0: ");
        num = entrada.nextDouble();
        System.out.print("Escriba el valor exponencial: ");
        int x = entrada.nextInt();

        e = 1;
        i = 1;
        factorial = 1;
        int numerador = x;
        num--;

        while (num > 0) {
            e += numerador / factorial;
            numerador *= x;
            factorial *= ++i;
            num--;
        }
        System.out.printf("El valor de la constante e exponencial de x, usando los términos ingresados es: %.4f%n", e);
    }
}