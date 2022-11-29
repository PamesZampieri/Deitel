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
        int numero1 = entrada.nextInt();

        mostrarDigitos(numero1);
    }

    public static void mostrarDigitos(int numero1) {
        int digito1 = calcularResiduo(calcularCociente(numero1, 10000), 10);
        int digito2 = calcularResiduo(calcularCociente(numero1, 1000), 10);
        int digito3 = calcularResiduo(calcularCociente(numero1, 100), 10);
        int digito4 = calcularResiduo(calcularCociente(numero1, 10), 10);
        int digito5 = calcularResiduo(numero1, 10);

        if (numero1 >= 10000 && numero1 <= 99999) {
            System.out.printf("%d  %d  %d  %d  %d", digito1, digito2, digito3, digito4, digito5);
        } else if (numero1 >= 1000 && numero1 <= 9999) {
            System.out.printf("%d  %d  %d  %d", digito2, digito3, digito4, digito5);
        } else if (numero1 >= 100 && numero1 <= 999) {
            System.out.printf("%d  %d  %d", digito3, digito4, digito5);
        } else if (numero1 >= 10 && numero1 <= 99) {
            System.out.printf("%d  %d", digito4, digito5);
        } else if (numero1 >= 1 && numero1 <= 9) {
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
