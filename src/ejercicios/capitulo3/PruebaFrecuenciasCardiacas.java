package ejercicios.capitulo3;

import java.util.Scanner;

public class PruebaFrecuenciasCardiacas {
    public static void main(String[] args) {
        FrecuenciasCardiacas frecuencia1 = new FrecuenciasCardiacas("Pamela", "Zampieri", 16,
                12, 1987);

        System.out.println("Los datos de la persona analizada son: ");
        System.out.printf("Primer Nombre: %s%n", frecuencia1.getPrimerNombre());
        System.out.printf("Apellido: %s%n", frecuencia1.getApellido());
        System.out.printf("Fecha de Nacimiento: %d/%d/%d%n", frecuencia1.getDay(), frecuencia1.getMonth(), frecuencia1.getYear());
        System.out.printf("Edad: %s años%n", frecuencia1.calcularEdad());
        System.out.printf("Frecuencia Cardíaca Máxima: %d%n", frecuencia1.calcularFrecuenciaCardiacaMaxima());
        System.out.printf("Frecuencia Cardíaca Mínima esperada: %.2f%n", frecuencia1.calcularFrecuenciaCardiacaMinimaEsperada());
        System.out.printf("Frecuencia Cardíaca Máxima esperada: %.2f%n", frecuencia1.calcularFrecuenciaCardiacaMaximaEsperada());
        System.out.println();

        Scanner entrada = new Scanner(System.in);
        System.out.print("Escriba su Primer Nombre: ");
        String nombre = entrada.nextLine();

        System.out.print("Escriba su Apellido: ");
        String apellido = entrada.nextLine();

        System.out.print("Escriba su Día de Nacimiento: ");
        int day = entrada.nextInt();

        System.out.print("Escriba su Mes de Nacimiento: ");
        int month = entrada.nextInt();

        System.out.print("Escriba su Año de Nacimiento: ");
        int year = entrada.nextInt();
        System.out.println();

        FrecuenciasCardiacas frecuencia2 = new FrecuenciasCardiacas(nombre, apellido, day, month, year);

        System.out.println("Los datos de la persona analizada son: ");
        System.out.printf("Primer Nombre: %s%n", frecuencia2.getPrimerNombre());
        System.out.printf("Apellido: %s%n", frecuencia2.getApellido());
        System.out.printf("Fecha de Nacimiento: %d/%d/%d%n", frecuencia2.getDay(), frecuencia2.getMonth(), frecuencia2.getYear());
        System.out.printf("Edad: %s años%n", frecuencia2.calcularEdad());
        System.out.printf("Frecuencia Cardíaca Máxima: %d%n", frecuencia2.calcularFrecuenciaCardiacaMaxima());
        System.out.printf("Frecuencia Cardíaca Mínima esperada: %.2f%n", frecuencia2.calcularFrecuenciaCardiacaMinimaEsperada());
        System.out.printf("Frecuencia Cardíaca Máxima esperada: %.2f%n", frecuencia2.calcularFrecuenciaCardiacaMaximaEsperada());
        System.out.println();
    }
}
