/*
5.22 (Programa modificado para imprimir triángulos) Modifique el ejercicio 5.15 para combinar su código de
los cuatro triángulos de asteriscos, de manera que los cuatro patrones se impriman uno al lado del otro. [Sugerencia:
utilice astutamente los ciclos for anidados].
 */


package ejercicios.capitulo5;

public class ejercicio_5_22_ImprimirUnTrianguloModificado {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print('*');
            }
            for (int j = 10; j > i; j--) {
                System.out.print(' ');
            }

            for (int j = 10; j > i; j--) {
                System.out.print('*');
            }
            for (int j = 0; j < i; j++) {
                System.out.print(' ');
            }
            System.out.print(' ');

            for (int j = 0; j < i; j++) {
                System.out.print(' ');
            }
            for (int j = 10; j > i; j--) {
                System.out.print('*');
            }
            System.out.print(' ');

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










