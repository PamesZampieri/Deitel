/*
6.19 (Mostrar un cuadrado de cualquier carácter) Modifique el método creado en el ejercicio 6.18 para que
reciba un segundo parámetro de tipo char, llamado caracterRelleno. Para formar el cuadrado, utilice el char que se
proporciona como argumento. Por ejemplo, si lado es 5 y caracterRelleno es #, el método debe imprimir
#####
#####
#####
#####
#####
Use la siguiente instrucción (en donde entrada es un objeto Scanner) para leer un carácter del usuario mediante el
teclado:
char relleno = entrada.next().charAt(0);
*/

package ejercicios.capitulo6;

import java.util.Scanner;

public class ejercicio_6_19_MostrarCuadradoDeCaracteres {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Este programa imprime un cuadrado de caracteres.");
        System.out.print("Escriba un numero entero para el lado: ");
        int lado = entrada.nextInt();
        System.out.print("Escriba el caracter deseado: ");
        char relleno = entrada.next().charAt(0);

        imprimirCuadradoDeCaracteres(lado, relleno);
    }

    public static void imprimirCuadradoDeCaracteres(int lado, char caracterRelleno) {
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                System.out.print(caracterRelleno);
            }

            System.out.println();
        }
    }
}