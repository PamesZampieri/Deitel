/*
6.23 (Encuentre el mínimo) Escriba un método llamado minimo3 que devuelva el menor de tres números de punto flotante.
Use el método Math.min para implementar minimo3. Incorpore el método en una aplicación que reciba
como entrada tres valores por parte del usuario, determine el valor menor y muestre el resultado.
*/

package ejercicios.capitulo6;

import java.util.Scanner;

public class ejercicio_6_23_EncontarElMinimo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Este programa calcula el menor entre 3 números de punto flotante.");
        System.out.print("Escriba el primer número: ");
        double numero1 = entrada.nextDouble();
        System.out.print("Escriba el segundo número: ");
        double numero2 = entrada.nextDouble();
        System.out.print("Escriba el tercer número: ");
        double numero3 = entrada.nextDouble();

        System.out.printf("El menor de los tres números ingresados es: %.2f", minimo3(numero1, numero2, numero3));
    }

    public static double minimo3(double numero1, double numero2, double numero3) {
        return Math.min(numero1, Math.min(numero2, numero3));
    }
}
