package Unidad4;

import java.util.Scanner;

public class Bloques {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int calificacion;

        System.out.print("Escriba la calificación del estudiante: ");
        calificacion = entrada.nextInt();

        if (calificacion >= 60) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
            System.out.println("Debe tomar este curso otra vez.");
        }
    }
}