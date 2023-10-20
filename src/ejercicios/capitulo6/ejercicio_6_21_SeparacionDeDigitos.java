/*
6.21 (Separación de dígitos) Escriba métodos que realicen cada una de las siguientes tareas:
a) Calcular la parte entera del cociente, cuando el entero a se divide entre el entero b.
b) Calcular el residuo entero cuando el entero a se divide entre el entero b.
c) Utilizar los métodos desarrollados en los incisos (a) y (b) para escribir un método llamado mostrarDigitos, que
 reciba un entero entre 1 y 99999, y que lo muestre como una secuencia de dígitos, separando cada
par de dígitos por dos espacios. Por ejemplo, el entero 4562 debe aparecer como
 4 5 6 2
Incorpore los métodos en una aplicación que reciba como entrada un entero y que llame al método mostrarDigitos,pasándole
el entero introducido. Muestre los resultados.
*/

package ejercicios.capitulo6;

import java.util.Scanner;

public class ejercicio_6_21_SeparacionDeDigitos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escriba un número entero(entre 1-99999): ");
        int numero = entrada.nextInt();

        while (numero < 1 || numero > 99999) {
            System.out.println("Error. El número ingresado es incorrecto.");

            System.out.print("Escriba un número entero(entre 1-99999): ");
            numero = entrada.nextInt();
        }

        mostrarDigitos(numero);
    }

    public static void mostrarDigitos(int numero) {
        int digito1 = calcularCociente(numero, 10000);
        int digito2 = calcularResiduo(calcularCociente(numero, 1000), 10);
        int digito3 = calcularResiduo(calcularCociente(numero, 100), 10);
        int digito4 = calcularResiduo(calcularCociente(numero, 10), 10);
        int digito5 = calcularResiduo(numero, 10);

        if (numero >= 10000 && numero <= 99999) {
            System.out.printf("%d  %d  %d  %d  %d", digito1, digito2, digito3, digito4, digito5);
        } else if (numero >= 1000 && numero <= 9999) {
            System.out.printf("%d  %d  %d  %d", digito2, digito3, digito4, digito5);
        } else if (numero >= 100 && numero <= 999) {
            System.out.printf("%d  %d  %d", digito3, digito4, digito5);
        } else if (numero >= 10 && numero <= 99) {
            System.out.printf("%d  %d", digito4, digito5);
        } else if (numero >= 1 && numero <= 9) {
            System.out.printf("%d", digito5);
        }
    }

    public static int calcularCociente(int numero1, int numero2) {
        return numero1 / numero2;
    }

    public static int calcularResiduo(int numero1, int numeroResiduo) {
        return numero1 % numeroResiduo;
    }
}