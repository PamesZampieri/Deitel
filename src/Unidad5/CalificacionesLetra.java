package Unidad5;

import java.util.Scanner;

public class CalificacionesLetra {
    public static void main(String[] args) {
        int total = 0;
        int contadorCalif = 0;
        int aCuenta = 0;
        int bCuenta = 0;
        int cCuenta = 0;
        int dCuenta = 0;
        int fCuenta = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.printf("%s%n%s%n %s%n %s%n",
                "Introduzca las calificaciones en el rango de 0-100.",
                "Escriba el indicador de fin de archivo para terminar la entrada:",
                "En UNIX/Linux/Mac OS X escriba <Ctrl> d y oprima Intro",
                "En Windows escriba <Ctrl> z y oprima Intro");

        while (entrada.hasNext()) {
            int calificacion = entrada.nextInt();
            total += calificacion;
            ++contadorCalif;

            switch (calificacion / 10) {
                case 9:
                case 10:
                    ++aCuenta;
                    break;

                case 8:
                    ++bCuenta;
                    break;

                case 7:
                    ++cCuenta;
                    break;

                case 6:
                    ++dCuenta;
                    break;

                default:
                    ++fCuenta;
                    break;
            }
        }

        System.out.printf("%nReporte de calificaciones:%n");

        if (contadorCalif != 0) {
            double promedio = (double) total / contadorCalif;
            System.out.printf("El total de las %d calificaciones introducidas es %d%n", contadorCalif, total);
            System.out.printf("El promedio de la clase es %.2f%n", promedio);
            System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
                    "Numero de estudiantes que recibieron cada calificacion:",
                    "A: ", aCuenta,
                    "B: ", bCuenta,
                    "C: ", cCuenta,
                    "D: ", dCuenta,
                    "F: ", fCuenta);
        } else {
            System.out.println("No se introdujeron calificaciones");
        }
    }
}
