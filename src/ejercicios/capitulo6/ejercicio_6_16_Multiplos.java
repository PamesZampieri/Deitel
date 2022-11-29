/*
6.16 (Múltiplos) Escriba un método llamado esMultiplo que determine si el segundo número de un par de enteros es
múltiplo del primero. El método debe tomar dos argumentos enteros y devolver true si el segundo es múltiplo
del primero, y false en caso contrario. [Sugerencia: utilice el operador residuo]. Incorpore este método en una
aplicación que reciba como entrada una serie de pares de enteros (un par a la vez) y determine si el segundo valor en
cada par es un múltiplo del primero.
*/

package ejercicios.capitulo6;

import java.util.Scanner;

public class ejercicio_6_16_Multiplos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escriba un número entero (presione -1 para terminar): ");
        int numero1 = entrada.nextInt();
        System.out.print("Escriba otro número entero (presione -1 para terminar): ");
        int numero2 = entrada.nextInt();

        while (numero1 != -1) {
            System.out.print(esMultiplo(numero1, numero2) ? "Es múltiplo." : "No es múltiplo.");
            System.out.println();

            System.out.print("Escriba un número entero (presione -1 para terminar): ");
            numero1 = entrada.nextInt();
            System.out.print("Escriba otro número entero (presione -1 para terminar): ");
            numero2 = entrada.nextInt();
        }
    }

    public static boolean esMultiplo(int numero1, int numero2) {
        return numero2 % numero1 == 0;
    }
}
