/*
6.18 (Mostrar un cuadrado de asteriscos) Escriba un método llamado cuadradoDeAsteriscos que muestre un
cuadrado relleno (el mismo número de filas y columnas) de asteriscos cuyo lado se especifique en el parámetro entero
lado. Por ejemplo, si lado es 4, el método debe mostrar:
****
****
****
****
Incorpore este método a una aplicación que lea un valor entero para el parámetro lado que introduzca el usuario, y
despliegue los asteriscos con el método cuadradoDeAsteriscos.
*/

package ejercicios.capitulo6;

import java.util.Scanner;

public class ejercicio_6_18_MostrarCuadradoDeAsteriscos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Este programa imprime un cuadrado de asteriscos una vez proporcionado un numero entero.");
        System.out.print("Escriba un numero para el lado: ");
        int lado = entrada.nextInt();

        cuadradoDeAsteriscos(lado);
    }

    public static void cuadradoDeAsteriscos(int lado) {
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                System.out.print('*');
            }

            System.out.println();
        }
    }
}

