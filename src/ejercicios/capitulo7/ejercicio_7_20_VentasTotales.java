/*
7.20 (Ventas totales) Use un arreglo bidimensional para resolver el siguiente problema: una compañía tiene cuatro
vendedores (1 a 4) que venden cinco productos distintos (1 a 5). Una vez al día, cada vendedor pasa una nota por cada
tipo de producto vendido. Cada nota contiene lo siguiente:
a) El número del vendedor
b) El número del producto
c) El valor total en dólares de ese producto vendido en ese día
Así, cada vendedor pasa entre 0 y 5 notas de venta por día. Suponga que está disponible la información sobre todas las
notas del mes pasado. Escriba una aplicación que lea toda esta información para las ventas del último mes y que resuma
las ventas totales por vendedor, y por producto. Todos los totales deben guardarse en el arreglo bidimensional ventas.
Después de procesar toda la información del mes pasado, muestre los resultados en formato tabular, en donde cada columna
represente a un vendedor específico y cada fila simbolice un producto. Saque el total de cada fila para obtener las
ventas totales de cada producto durante el último mes. Calcule el total de cada columna para sacar las ventas totales de
cada vendedor durante el último mes. Su impresión tabular debe incluir estos totales cruzados a la derecha de las filas
totalizadas, y en la parte inferior de las columnas totalizadas.
*/

package ejercicios.capitulo7;

import java.security.SecureRandom;

public class ejercicio_7_20_VentasTotales {
    private static final SecureRandom numerosAleatorios = new SecureRandom();
    private static final double[][] ventas = new double[5][4];

    public static void main(String[] args) {
        ventasTotalesMesAnterior();

        System.out.printf("%-25s%8s%30s%30s%30s%40s%n", "PRODUCTO", "VENDEDOR 1", "VENDEDOR 2", "VENDEDOR 3",
                "VENDEDOR 4", "TOTAL POR PRODUCTO: ");

        double totalFila = 0.0;
        for (int i = 0; i < ventas.length; i++) {
            System.out.printf("%-25d", i + 1);

            for (int j = 0; j < ventas[i].length; j++) {
                System.out.printf("U$D %,12.2f              ", ventas[i][j]);
                totalFila += ventas[i][j];
            }

            System.out.printf("U$D %,10.2f", totalFila);
            totalFila = 0.0;

            System.out.println();
        }

        System.out.printf("%-25s", "TOTAL POR VENDEDOR: ");

        double totalColumna = 0.0;
        for (int i = 0; i < ventas[0].length; i++) {
            for (int j = 0; j < ventas.length; j++) {
                totalColumna += ventas[j][i];
            }

            System.out.printf("U$D %,12.2f              ", totalColumna);
            totalColumna = 0.0;
        }
    }

    public static void ventasTotalesMesAnterior() {
        for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas[i].length; j++) {
                ventas[i][j] = ventasPorProductoPorVendedor();

                System.out.printf("Número de Vendedor: %d%nNúmero de Producto: %d%nValor por Producto: %,.2f%n%n",
                        j + 1, i + 1, ventas[i][j]);
            }
        }
    }

    public static int ventasPorProductoPorVendedor() {
        return 10_000 + numerosAleatorios.nextInt(500_000);
    }
}