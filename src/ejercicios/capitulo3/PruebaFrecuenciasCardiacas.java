/*
3.16 (Calculadora de la frecuencia cardiaca esperada) Mientras se ejercita, puede usar un monitor de frecuencia cardiaca
para ver que su corazón permanezca dentro de un rango seguro sugerido por sus entrenadores y doctores.
De acuerdo con la Asociación Estadounidense del Corazón (AHA) (www.americanheart.org/presenter.
jhtml?identifier=4736), la fórmula para calcular su frecuencia cardiaca máxima en pulsos por minuto es 220
menos su edad en años. Su frecuencia cardiaca esperada tiene un rango que está entre el 50 y el 85% de su frecuencia
cardiaca máxima. [Nota: estas fórmulas son estimaciones proporcionadas por la AHA. Las frecuencias cardiacas
máxima y esperada pueden variar con base en la salud, condición física y sexo del individuo. Siempre debe consultar
un médico o a un profesional de la salud antes de empezar o modificar un programa de ejercicios]. Cree una
clase llamada FrecuenciasCardiacas. Los atributos de la clase deben incluir el primer nombre de la persona, su apellido
y fecha de nacimiento (la cual debe consistir de atributos independientes para el mes, día y año de nacimiento).
Su clase debe tener un constructor que reciba estos datos como parámetros. Para cada atributo debe proveer métodos
establecer y obtener. La clase también debe incluir un método que calcule y devuelva la edad de la persona (en años),
un método que calcule y devuelva la frecuencia cardiaca máxima de esa persona, y otro método que calcule y devuelva
la frecuencia cardiaca esperada de la persona. Escriba una aplicación de Java que pida la información de la persona,
cree una instancia de un objeto de la clase FrecuenciasCardiacas e imprima la información a partir de ese objeto
(incluyendo el primer nombre de la persona, su apellido y fecha de nacimiento), y que después calcule e imprima la
edad de la persona en (años), frecuencia cardiaca máxima y rango de frecuencia cardiaca esperada.
 */

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