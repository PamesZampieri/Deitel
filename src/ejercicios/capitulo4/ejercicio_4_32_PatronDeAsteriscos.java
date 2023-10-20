/*
4.32 (Patrón de asteriscos en forma de tablero de damas) Escriba una aplicación que utilice sólo las instrucciones
de salida
 System.out.print(“* “);
 System.out.print(“ “);
 System.out.println();
para mostrar el patrón de tablero de damas que se muestra a continuación. Observe que una llamada al método
System.out.println sin argumentos hace que el programa imprima un solo carácter de nueva línea. [Sugerencia:
se requieren estructuras de repetición].

* * * * * * * *
 * * * * * * * *
* * * * * * * *
 * * * * * * * *
* * * * * * * *
 * * * * * * * *
* * * * * * * *
 * * * * * * * *

 */

package ejercicios.capitulo4;

public class ejercicio_4_32_PatronDeAsteriscos {
    public static void main(String[] args) {
        //Solución 1:
        int lado = 8;
        int fila = 0;
        System.out.println();

        while (fila < lado) {
            int columna = 0;

            if (fila % 2 == 1) {
                System.out.print(" ");
            }

            System.out.print("*");

            while (columna < lado - 1) {
                System.out.print(" ");
                System.out.print("*");

                columna++;
            }
            System.out.println();
            fila++;
        }

        //Solución 2:
        fila = 0;
        System.out.println();

        while (fila < 8) {
            int columna = 0;

            if (fila % 2 == 1) {
                System.out.print(" ");
            }

            while (columna < 8) {
                System.out.print("*");
                System.out.print(" ");
                columna++;
            }

            fila++;
            System.out.println();
        }
    }
}