/*
5.17 (Calcular las ventas) Un vendedor minorista en línea vende cinco productos cuyos precios de venta son los
siguientes: producto 1, $2.98; producto 2, $4.50; producto 3, $9.98; producto 4, $4.49 y producto 5, $6.87. Escriba
una aplicación que lea una serie de pares de números, como se muestra a continuación:
a) número del producto;
b) cantidad vendida.
Su programa debe utilizar una instrucción switch para determinar el precio de venta de cada producto. Debe calcular
y mostrar el valor total de venta de todos los productos vendidos. Use un ciclo controlado por centinela para determinar
cuándo debe el programa dejar de iterar para mostrar los resultados finales.
*/

package ejercicios.capitulo5;

import java.util.Scanner;

public class ejercicio_5_17_CalcularVentas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escriba el número del producto vendido (1-2-3-4-5) o (-1) para terminar: ");
        int producto = entrada.nextInt();

        System.out.print("Escriba la cantidad vendida o (-1) para terminar: ");
        int cantidad = entrada.nextInt();

        double total = 0;

        if (producto != -1 && cantidad != -1) {
            while (producto != -1 && cantidad != -1) {
                switch (producto) {
                    case 1:
                        total += cantidad * 2.98;
                        break;
                    case 2:
                        total += cantidad * 4.50;
                        break;
                    case 3:
                        total += cantidad * 9.98;
                        break;
                    case 4:
                        total += cantidad * 4.49;
                        break;
                    case 5:
                        total += cantidad * 6.87;
                        break;
                    default:
                        System.out.print("Error. Escriba un número de producto correcto.");
                        System.out.println();
                }

                System.out.println();
                System.out.print("Escriba el número del producto vendido (1-2-3-4-5) o (-1) para terminar: ");
                producto = entrada.nextInt();
                System.out.print("Escriba la cantidad vendida o (-1) para terminar: ");
                cantidad = entrada.nextInt();
            }
        }

        System.out.println();
        System.out.printf("El total de los productos vendidos es: $%.2f%n", total);
    }
}