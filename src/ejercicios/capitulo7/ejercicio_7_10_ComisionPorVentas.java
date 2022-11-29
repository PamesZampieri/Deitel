/*
7.10 (Comisión por ventas) Utilice un arreglo unidimensional para resolver el siguiente problema: una compañía
paga a sus vendedores por comisión. Los vendedores reciben $200 por semana más el 9% de sus ventas totales de esa
semana. Por ejemplo, un vendedor que acumule $5,000 en ventas en una semana, recibirá $200 más el 9% de $5,000,
o un total de $650. Escriba una aplicación (utilizando un arreglo de contadores) que determine cuántos vendedores
recibieron salarios en cada uno de los siguientes rangos (suponga que el salario de cada vendedor se trunca a una
cantidad entera):
a) $200-299
b) $300-399
c) $400-499
d) $500-599
e) $600-699
f) $700-799
g) $800-899
h) $900-999
i) $1,000 en adelante
Sintetice los resultados en formato tabular.
*/

package ejercicios.capitulo7;

import java.util.Scanner;

public class ejercicio_7_10_ComisionPorVentas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escriba su venta total semanal o (-1) para terminar: ");
        double venta = entrada.nextDouble();
        int[] frecuencias = new int[9];

        while (venta != -1) {
            double salario = calcularSalario(venta);

            if (salario >= 200 && salario < 300) {
                frecuencias[0]++;
            } else if (salario >= 300 && salario < 400) {
                frecuencias[1]++;
            } else if (salario >= 400 && salario < 500) {
                frecuencias[2]++;
            } else if (salario >= 500 && salario < 600) {
                frecuencias[3]++;
            } else if (salario >= 600 && salario < 700) {
                frecuencias[4]++;
            } else if (salario >= 700 && salario < 800) {
                frecuencias[5]++;
            } else if (salario >= 800 && salario < 900) {
                frecuencias[6]++;
            } else if (salario >= 900 && salario < 1000) {
                frecuencias[7]++;
            } else {
                frecuencias[8]++;
            }

            System.out.printf("Su salario total es: $%.2f%n", salario);

            System.out.print("Escriba su Venta total semanal o (-1) para terminar: ");
            venta = entrada.nextDouble();
        }

        System.out.println("\nDISTRIBUCIÓN DE SALARIOS POR VENTAS SEMANALES:\n");
        System.out.printf("%10s%22s%n", "RANGO DE SALARIOS", "VENDEDORES");
        imprimirVentas(frecuencias);
    }

    public static double calcularSalario(double venta) {
        int salarioVentasSemanal = 200;
        double coeficienteVentasSemanal = 0.09 * venta;

        return salarioVentasSemanal + coeficienteVentasSemanal;
    }

    public static void imprimirVentas(int[] frecuencias) {
        int aumento = 200;

        for (int i = 0; i < frecuencias.length; i++) {
            if (i == 8) {
                System.out.printf("$%d o más: %17d", 1000, frecuencias[i]);
            } else {
                System.out.printf("$%d-%d: %20d", aumento, aumento + 99, frecuencias[i]);
            }

            aumento += 100;
            System.out.println();
        }
    }
}