/*
En esta clase voy a hacer mi propia implementación de funciones del paquete Math.
 */

package ejercicios.capitulo6;

public class FuncionesMatematicas {
    public static void main(String[] args) {
        System.out.printf("Cateto 1 = 3, cateto 2 = 4, hipotenusa = %.2f%n", hypot(3, 4));
        System.out.printf("Cateto 1 = 0, cateto 2 = 4, hipotenusa = %.2f%n", hypot(0, 4));
        System.out.printf("3 ^ 0 = %.2f%n", pow(3, 0));
        System.out.printf("3 ^ 1 = %.2f%n", pow(3, 1));
        System.out.printf("3 ^ 2 = %.2f%n", pow(3, 2));
        System.out.printf("3 ^ 3 = %.2f%n", pow(3, 3));
        System.out.printf("3 ^ 4 = %.2f%n", pow(3, 4));
        System.out.printf("3 ^ 5 = %.2f%n", pow(3, 5));
    }

    public static double hypot(double x, double y) {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public static double pow(double base, int exponente) {
        if (exponente == 0) {
            return 1;
        }

        double result = base;

        for (int i = 0; i < exponente - 1; i++) {
            result *= base;
        }

        return result;
    }
}