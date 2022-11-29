package Unidad2;

import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numero1,
            numero2,
            suma;

        System.out.print("Escriba el primer entero: ");
        numero1 = in.nextInt();

        System.out.print("Escriba el segundo entero: ");
        numero2 = in.nextInt();

        suma = numero1 + numero2;

        System.out.printf("La suma es %d%n", numero1 + numero2);
    }
}
