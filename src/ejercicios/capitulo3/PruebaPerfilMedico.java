package ejercicios.capitulo3;

import java.util.Scanner;

public class PruebaPerfilMedico {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escriba su Primer Nombre: ");
        String primerNombre = entrada.nextLine();

        System.out.print("Escriba su Apellido: ");
        String apellido = entrada.nextLine();

        System.out.print("Escriba su Sexo: ");
        String sexo = entrada.nextLine();

        System.out.print("Escriba su Día de Nacimiento: ");
        int day = entrada.nextInt();

        System.out.print("Escriba su Mes de Nacimiento: ");
        int month = entrada.nextInt();

        System.out.print("Escriba su Año de Nacimiento: ");
        int year = entrada.nextInt();

        System.out.print("Escriba su altura (m): ");
        double altura = entrada.nextDouble();

        System.out.print("Escriba su peso (Kg): ");
        double peso = entrada.nextDouble();
        System.out.println();

        PerfilMedico perfilMedico1 = new PerfilMedico(primerNombre, apellido, sexo, day, month, year, altura, peso);

        System.out.println("Los datos de la persona analizada son: ");
        System.out.printf("Primer Nombre: %s%n", perfilMedico1.getPrimerNombre());
        System.out.printf("Apellido: %s%n", perfilMedico1.getApellido());
        System.out.printf("Fecha de Nacimiento: %d/%d/%d%n", perfilMedico1.getDay(), perfilMedico1.getMonth(), perfilMedico1.getYear());
        System.out.printf("Edad: %s años%n", perfilMedico1.calcularEdad());
        System.out.printf("Frecuencia Cardíaca Máxima: %d%n", perfilMedico1.calcularFrecuenciaCardiacaMaxima());
        System.out.printf("Frecuencia Cardíaca Mínima esperada: %.2f%n", perfilMedico1.calcularFrecuenciaCardiacaMinimaEsperada());
        System.out.printf("Frecuencia Cardíaca Máxima esperada: %.2f%n", perfilMedico1.calcularFrecuenciaCardiacaMaximaEsperada());
        System.out.printf("Indice de Masa Corporal: %.2f%n", perfilMedico1.calcularIndiceDeMasaCorporal());
        System.out.println();
        perfilMedico1.mostrarValoresDeReferenciaBMI();
    }
}
