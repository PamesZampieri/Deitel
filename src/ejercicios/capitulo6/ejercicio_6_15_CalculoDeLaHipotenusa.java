/*
6.15 (Cálculo de la hipotenusa) Defina un método llamado hipotenusa que calcule la longitud de la hipotenusa
de un triángulo rectángulo, cuando se proporcionen las longitudes de los otros dos lados. El método debe tomar dos
argumentos de tipo double y devolver la hipotenusa como un valor double. Incorpore este método en una aplicación
que lea los valores para lado1 y lado2, y que realice el cálculo con el método hipotenusa. Use los métodos pow y sqrt
de Math para determinar la longitud de la hipotenusa para cada uno de los triángulos de la figura 6.15. [Nota: la clase
Math también cuenta con el método hypot para realizar este cálculo].
Triángulo Lado 1 Lado 2
 1        3.0    4.0
 2        5.0    12.0
 3        8.0    15.0
 */

package ejercicios.capitulo6;

import java.util.Scanner;

public class ejercicio_6_15_CalculoDeLaHipotenusa {
    public static void main(String[] args) {
        double lado1 = 3.00;
        double lado2 = 4.00;

        System.out.println("TRIÁNGULO\t\tLADO1\t\tLADO2\t\tMI MÉTODO HIPOTENUSA \t\tHIPOTENUSA MÉTODO HYPOT");
        System.out.printf("\t\t%d\t\t%.2f\t\t%.2f\t\t%.2f\t\t\t\t\t\t%.2f%n", 1, lado1, lado2, hipotenusa(lado1, lado2),
                Math.hypot(lado1, lado2));

        lado1 = 5.00;
        lado2 = 12.00;
        System.out.printf("\t\t%d\t\t%.2f\t\t%.2f\t\t%.2f\t\t\t\t\t\t%.2f%n", 2, lado1, lado2, hipotenusa(lado1, lado2),
                Math.hypot(lado1, lado2));

        lado1 = 8.00;
        lado2 = 15.00;
        System.out.printf("\t\t%d\t\t%.2f\t\t%.2f\t\t%.2f\t\t\t\t\t\t%.2f%n%n", 3, lado1, lado2, hipotenusa(lado1, lado2),
                Math.hypot(lado1, lado2));

        Scanner entrada = new Scanner(System.in);
        System.out.print("Escriba el lado de un triángulo rectángulo: ");
        lado1 = entrada.nextDouble();
        System.out.print("Escriba el lado de un triángulo rectángulo: ");
        lado2 = entrada.nextDouble();

        System.out.printf("La hipotenusa del triángulo (Mi Método Hipotenusa) es: %.2f%n", hipotenusa(lado1, lado2));

        System.out.printf("La hipotenusa del triángulo (Método Hipotenusa de la clase Math) es: %.2f",
                Math.hypot(lado1, lado2));
    }

    public static double hipotenusa(double lado1, double lado2) {
        return Math.sqrt(Math.pow(lado1, 2) + Math.pow(lado2, 2));
    }
}
