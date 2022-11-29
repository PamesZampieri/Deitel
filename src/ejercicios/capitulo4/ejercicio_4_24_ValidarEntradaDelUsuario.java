/*
4.24 (Validar la entrada del usuario) Modifique el programa de la figura 4.12 para validar sus entradas. Para
cualquier entrada, si el valor introducido es distinto de 1 o 2, debe seguir iterando hasta que el usuario introduzca un
valor correcto.
 */

package ejercicios.capitulo4;

import java.util.Scanner;

public class ejercicio_4_24_ValidarEntradaDelUsuario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int aprobados = 0;
        int reprobados = 0;
        int contadorEstudiantes = 0;

        while (contadorEstudiantes < 10) {
            System.out.print("Escriba el resultado (1 = aprobado, 2 = reprobado): ");
            int resultado = entrada.nextInt();

            if (resultado != 1) {
                if (resultado != 2) {
                    System.out.println("Error! Escriba el resultado 1 para aprobado y 2 para reprobado.");
                    System.out.println();
                }
            }

            if (resultado == 1) {
                aprobados++;
                contadorEstudiantes++;
            }

            if (resultado == 2) {
                reprobados++;
                contadorEstudiantes++;
            }
        }

        System.out.printf("Aprobados: %d%nReprobados: %d%n", aprobados, reprobados);

        if (aprobados > 8) {
            System.out.println("Bono para el instructor!");
        }
    }
}

