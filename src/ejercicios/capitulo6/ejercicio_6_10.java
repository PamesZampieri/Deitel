/*
6.10 (Redondeo de números) Para redondear números a lugares decimales específicos, use una instrucción como
la siguiente:
 y = Math.floor(x * 10 + 0.5) / 10;
la cual redondea x en la posición de las décimas (es decir, la primera posición a la derecha del punto decimal), o:
 y = Math.floor(x * 100 + 0.5) / 100;
que redondea x en la posición de las centésimas (es decir, la segunda posición a la derecha del punto decimal). Escriba
una aplicación que defina cuatro métodos para redondear un número x en varias formas:
a) redondearAInteger(numero)
b) redondearADecimas(numero)
c) redondearACentesimas(numero)
d) redondearAMilesimas(numero)
Para cada valor leído, su programa debe mostrar el valor original, el número redondeado al entero más cercano, el
número redondeado a la décima más cercana, el número redondeado a la centésima más cercana y el número redondeado a la
milésima más cercana.
*/

package ejercicios.capitulo6;

import java.util.Scanner;

public class ejercicio_6_10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escriba número decimal (-1 para terminar): ");
        double numero = entrada.nextDouble();

        while (numero != -1) {
            System.out.printf("El número ingresado es %.2f%n" +
                            "Redondeado al entero más cercano es %.2f%n" +
                            "Redondeado a la décima más cercana es %.1f%n" +
                            "Redondeado a la centésima más cercana es %.2f%n" +
                            "Redondeado a la milésima más cercana es %.3f%n%n",
                    numero,
                    redondearAInteger(numero),
                    redondearADecimas(numero),
                    redondearACentesimas(numero),
                    redondearAMilesimas(numero));

            System.out.print("Escriba otro número decimal(-1 para terminar): ");
            numero = entrada.nextDouble();
        }
    }

    public static double redondearAInteger(double numero) {
        return Math.floor(numero + 0.5);
    }

    public static double redondearADecimas(double numero) {
        return Math.floor(numero * 10 + 0.5) / 10;
    }

    public static double redondearACentesimas(double numero) {
        return Math.floor(numero * 100 + 0.5) / 100;
    }

    public static double redondearAMilesimas(double numero) {
        return Math.floor(numero * 1000 + 0.5) / 1000;
    }
}
