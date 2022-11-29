package ejercicios.capitulo4;

import java.util.Scanner;

public class ejercicio_4_4 {
    public static void main(String[] args) {

        /*
        a) Usar una instrucción para asignar la suma de x y y a z, e incrementar x en 1 después del cálculo.

        int x = 8;
        int y = 5;

        int z = y + x++;

        System.out.printf("El valor de z es: %d%n", z);
        System.out.printf("El valor actual de x es: %d%n", x);
        System.out.printf("El valor actual de y es: %d%n", y);
        System.out.printf("El valor actual de z es: %d%n", x + y);

        b) Evaluar si la variable cuenta es mayor que 10. De ser así, imprimir “Cuenta es mayor que 10”.

        Scanner entrada = new Scanner(System.in);

        System.out.print("Escriba el valor de cuenta: ");
        int cuenta = entrada.nextInt();

        if (cuenta > 10) {
            System.out.println("Cuenta es mayor que 10.");
        }
        System.out.println();



        c) Usar una instrucción para decrementar la variable x en 1, luego restarla a la variable total y almacenar el
        resultado en la variable total.

         */
        int x = 30;
        int total = 50;

        total -= --x;

        System.out.printf("El valor de la Variable Total es: %d%n", total);
        System.out.println();


        /*d) Calcular el residuo después de dividir q entre divisor, y asignar el resultado a q. Escriba esta instrucción
        de dos maneras distintas

         */

        Scanner entrada = new Scanner(System.in);

        System.out.print("Escriba el dividendo: ");
        double q = entrada.nextDouble();
        System.out.println();

        System.out.print("Escriba el divisor: ");
        double divisor = entrada.nextDouble();

        q = q % divisor;
        System.out.printf("El valor de módulo o residuo es: %.2f%n", q);

        q %= divisor;
        System.out.printf("El valor de módulo o residuo es: %.2f%n", q);
    }
}
