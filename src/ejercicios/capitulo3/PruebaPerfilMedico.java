/*
3.17 (Computarización de los registros médicos) Un tema relacionado con la salud que ha estado últimamente
en las noticias es la computarización de los registros médicos. Esta posibilidad se está tratando con mucho cuidado,
debido a las delicadas cuestiones de privacidad y seguridad, entre otras cosas. [Trataremos esas cuestiones en ejercicios
posteriores]. La computarización de los registros médicos puede facilitar a los pacientes el proceso de compartir sus
perfiles e historiales médicos con los diversos profesionales de la salud que consulten. Esto podría mejorar la calidad
del servicio médico, ayudar a evitar conflictos de fármacos y prescripciones erróneas, reducir los costos y, en
emergencias, podría ayudar a salvar vidas. En este ejercicio usted diseñará una clase “inicial” llamada PerfilMedico para
una persona. Los atributos de la clase deben incluir el primer nombre de la persona, su apellido, sexo, fecha de nacimiento
(que debe consistir de atributos separados para el día, mes y año de nacimiento), altura (en centímetros) y peso (en
kilogramos). Su clase debe tener un constructor que reciba estos datos. Para cada atributo, debe proveer los métodos
establecer y obtener. La clase también debe incluir métodos que calculen y devuelvan la edad del usuario en años, la
frecuencia cardiaca máxima y el rango de frecuencia cardiaca esperada (vea el ejercicio 3.16), además del índice de masa
corporal (BMI; vea el ejercicio 2.33). Escriba una aplicación de Java que pida la información de la persona, cree una
instancia de un objeto de la clase PerfilMedico para esa persona e imprima la información de ese objeto (incluyendo
el primer nombre de la persona, apellido, sexo, fecha de nacimiento, altura y peso), y que después calcule e imprima
la edad de esa persona en años, junto con el BMI, la frecuencia cardiaca máxima y el rango de frecuencia cardiaca esperada.
También debe mostrar la tabla de valores del BMI del ejercicio 2.33.
 */

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