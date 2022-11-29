/*
4.20 (Calculadora del salario) Desarrolle una aplicación en Java que determine el sueldo bruto para cada uno de
tres empleados. La empresa paga la cuota normal en las primeras 40 horas de trabajo de cada empleado, y cuota y
media en todas las horas trabajadas que excedan de 40. Usted recibe una lista de los empleados de la empresa, el número
de horas que trabajó cada uno la semana pasada y la tarifa por horas de cada empleado. Su programa debe recibir
como entrada esta información para cada empleado, para luego determinar y mostrar el sueldo bruto de cada trabajador.
Utilice la clase Scanner para introducir los datos.
 */

package ejercicios.capitulo4;

import java.util.Scanner;

public class ejercicio_4_20_CalculadoraSalario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escriba el Nombre Completo del Empleado: ");
        String nombreEmpleado = entrada.nextLine();
        System.out.print("Escriba el Número de Vendedor: ");
        int sellerID = entrada.nextInt();
        System.out.print("Escriba la Cantidad de Horas Trabajadas: ");
        double horasTrabajadas = entrada.nextDouble();
        System.out.print("Escriba la Tarifa para el Empleado por Horas Trabajadas: ");
        double tarifaPorHorasTrabajadas = entrada.nextDouble();

        double coeficientePorHorasExtras = 1.5;
        double ingresoBruto;

        while (sellerID != -1) {
            if (horasTrabajadas <= 40) {
                ingresoBruto = horasTrabajadas * tarifaPorHorasTrabajadas;
                System.out.printf("El Ingreso total del empleado %s es de: %.2f%n ", nombreEmpleado, ingresoBruto);
            } else {
                ingresoBruto = 40 * tarifaPorHorasTrabajadas +
                        (horasTrabajadas - 40) * tarifaPorHorasTrabajadas * coeficientePorHorasExtras;
                System.out.printf("El Ingreso total del empleado %s es de: %.2f%n", nombreEmpleado, ingresoBruto);
            }
            System.out.println();
            System.out.print("Escriba el Nombre Completo del Empleado: ");
            nombreEmpleado = entrada.nextLine();
            entrada.nextLine();
            System.out.print("Escriba el Número de Vendedor: ");
            sellerID = entrada.nextInt();
            System.out.print("Escriba la Cantidad de Horas Trabajadas: ");
            horasTrabajadas = entrada.nextDouble();
            System.out.print("Escriba la Tarifa para el Empleado por Horas Trabajadas: ");
            tarifaPorHorasTrabajadas = entrada.nextDouble();
        }
    }
}
