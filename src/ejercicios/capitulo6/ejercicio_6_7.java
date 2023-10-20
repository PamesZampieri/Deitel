/*
6.7 ¿Cuál es el valor de x después de que se ejecuta cada una de las siguientes instrucciones?
*/

package ejercicios.capitulo6;

public class ejercicio_6_7 {
    public static void main(String[] args) {
        //a) x = Math.abs(7.5);
        System.out.printf("El valor de x es: %.1f%n", Math.abs(7.5));

        //b) x = Math.floor(7.5);
        System.out.printf("El valor de x es: %.1f%n", Math.floor(7.5));

        //c) x = Math.abs(0.0);
        System.out.printf("El valor de x es: %.1f%n", Math.abs(0.0));

        //d) x = Math.ceil(0.0);
        System.out.printf("El valor de x es: %.1f%n", Math.ceil(0.0));

        //e) x = Math.abs(-6.4);
        System.out.printf("El valor de x es: %.1f%n", Math.abs(-6.4));

        //f) x = Math.ceil(-6.4);
        System.out.printf("El valor de x es: %.1f%n", Math.ceil(-6.4));

        //g) x = Math.ceil(-Math.abs(-8 + Math.floor(-5.5)));
        System.out.printf("El valor de x es: %.1f%n", Math.ceil(-Math.abs(-8 + Math.floor(-5.5))));
    }
}