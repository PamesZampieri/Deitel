/*
5.24 (Programa para imprimir rombos) Escriba una aplicación que imprima la siguiente figura de rombo. Puede utilizar
instrucciones de salida que impriman un solo asterisco (*), un solo espacio o un solo carácter de nueva línea.
Maximice el uso de la repetición (con instrucciones for anidadas), y minimice el número de instrucciones de salida.
     *
    ***
   *****
  *******
 *********
  *******
   *****
    ***
     *
*/

package ejercicios.capitulo5;

public class ejercicio_5_24_ImprimirRombos {
    public static void main(String[] args) {
        int filas = 9;
        int cantidadDeAsteriscos = 1;
        int cantidadDeEspacios = filas / 2;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < cantidadDeEspacios; j++) {
                System.out.print(' ');
            }
            for (int j = 0; j < cantidadDeAsteriscos; j++) {
                System.out.print('*');
            }
            if (i < filas / 2) {
                cantidadDeEspacios--;
                cantidadDeAsteriscos += 2;
            } else {
                cantidadDeEspacios++;
                cantidadDeAsteriscos -= 2;
            }
            System.out.println();
        }
    }
}