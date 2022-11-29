/*
5.15 (Programa para imprimir un triángulo) Escriba una aplicación que muestre los siguientes patrones por
separado, uno debajo del otro. Use ciclos for para generar los patrones. Todos los asteriscos (*) deben imprimirse
mediante una sola instrucción de la forma System.out.print(‘*’);, la cual hace que los asteriscos se impriman uno
al lado del otro. Puede utilizar una instrucción de la forma System.out.println(); para posicionarse en la siguiente
línea. Puede usar una instrucción de la forma System.out.print(‘ ‘); para mostrar un espacio para los últimos dos
patrones. No debe haber ninguna otra instrucción de salida en el programa. [Sugerencia: los últimos dos patrones
requieren que cada línea empiece con un número apropiado de espacios en blanco].

(a)(c)      (b)        (d)

* ********** ********** *
** ********* ********* **
*** ******** ******** ***
**** ******* ******* ****
***** ****** ****** *****
****** ***** ***** ******
******* **** **** *******
******** *** *** ********
********* ** ** *********
********** * * **********

 */

package ejercicios.capitulo5;

public class ejercicio_5_15_ImprimirUnTriangulo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            for (int j = 10; j > i; j--) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(' ');
            }
            for (int j = 10; j > i; j--) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            for (int j = 9; j > i; j--) {
                System.out.print(' ');
            }
            for (int j = 0; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}



