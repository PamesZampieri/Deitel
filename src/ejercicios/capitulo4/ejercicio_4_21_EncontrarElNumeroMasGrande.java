/*
4.21 (Encontrar el número más grande) El proceso de encontrar el valor más grande se utiliza con frecuencia en
aplicaciones de computadora. Por ejemplo, un programa para determinar el ganador de un concurso de ventas recibe
como entrada el número de unidades vendidas por cada vendedor. El vendedor que haya vendido más unidades es el
que gana el concurso. Escriba un programa en seudocódigo y después una aplicación en Java que reciba como entrada
una serie de 10 números enteros, y que determine e imprima el mayor de los números. Su programa debe utilizar
cuando menos las siguientes tres variables:
a) contador: un contador para contar hasta 10 (para llevar el registro de cuántos números se han introducido, y para
determinar cuando se hayan procesado los 10 números).
b) numero: el entero más reciente introducido por el usuario.
c) mayor: el número más grande encontrado hasta ahora.
 */

package ejercicios.capitulo4;

import java.util.Scanner;

public class ejercicio_4_21_EncontrarElNumeroMasGrande {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escriba un número entero: ");
        int numero = entrada.nextInt();

        int mayor = numero;
        int i = 1;

        while (i < 10) {
            System.out.print("Escriba un número entero: ");
            numero = entrada.nextInt();

            if (numero > mayor) {
                mayor = numero;
            }

            i++;
        }

        System.out.printf("El número %d es el mayor%n", mayor);
    }
}