/*
6.24 (Números perfectos) Se dice que un número entero es un número perfecto si sus factores, incluyendo 1 (pero
no el propio número), al sumarse dan como resultado el número entero. Por ejemplo, 6 es un número perfecto ya que es
6 = 1 + 2 + 3.
Escriba un método llamado esPerfecto que determine si el parámetro numero es un número perfecto.
Use este método en una aplicación que muestre todos los números perfectos entre 1 y 1,000. Muestre en pantalla los
factores de cada número perfecto para confirmar que el número sea realmente perfecto. Ponga a prueba el poder de su
computadora: evalué números más grandes que 1,000. Muestre los resultados.
*/

package ejercicios.capitulo6;

public class ejercicio_6_24_NumerosPerfectos {
    public static void main(String[] args) {
        System.out.println("NÚMEROS PERFECTOS:\t\tFACTORES:");

        for (int numero = 1; numero <= 1000; numero++) {
            if (esPerfecto(numero)) {
                System.out.printf("%d\t\t\t\t\t\t%s%n", numero, getFactores(numero));
            }
        }
    }

    public static boolean esPerfecto(int numero) {
        int sumaDeFactores = 0;

        for (int i = 1; i <= numero / 2 && sumaDeFactores <= numero; i++) {
            if (numero % i == 0) {
                sumaDeFactores += i;
            }
        }

        return numero == sumaDeFactores;
    }

    public static String getFactores(int numero) {
        String resultado = " ";

        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                resultado = resultado + i + " ";
            }
        }

        return resultado;
    }
}