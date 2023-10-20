/*
6.28 Escriba un método llamado puntosCalidad que reciba como entrada el promedio de un estudiante y devuelva 4 si el
promedio se encuentra entre 90 y 100, 3 si el promedio se encuentra entre 80 y 89, 2 si el promedio se encuentra entre
70 y 79, 1 si el promedio se encuentra entre 60 y 69, y 0 si el promedio es menor que 60. Incorpore el
método en una aplicación que reciba como entrada un valor del usuario y muestre el resultado.
*/

package ejercicios.capitulo6;

import java.util.Scanner;

public class ejercicio_6_28_Promedio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escriba el promedio del estudiante: ");
        int promedio = entrada.nextInt();

        System.out.printf("Los puntos por calidad del estudiante son: %d", puntosCalidad(promedio));
    }

    public static int puntosCalidad(int promedio) {
        if (promedio >= 90 && promedio <= 100) {
            return 4;
        } else if (promedio >= 80 && promedio < 90) {
            return 3;
        } else if (promedio >= 70 && promedio < 80) {
            return 2;
        } else if (promedio >= 60 && promedio < 70) {
            return 1;
        }
        return 0;
    }
}