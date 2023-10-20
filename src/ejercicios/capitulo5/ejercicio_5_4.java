/*
  5.4 Encuentre el error en cada uno de los siguientes segmentos de código, y explique cómo corregirlo:
*/

package ejercicios.capitulo5;

public class ejercicio_5_4 {
    public static void main(String[] args) {
        /*
        a) i = 1;
        while (i <= 10);
         ++i;
        }
         */
        int i = 1;

        while (i <= 10) {
            System.out.printf("%d ", i);
            ++i;
        }
        System.out.println();

        /*
        b) for (k = 0.1; k != 1.0; k += 0.1)
                System.out.println (k);
         */

        for (double k = 1; k != 10; k++) {
            System.out.println((double) k / 10);
        }
        System.out.println();

        /*
        c) switch (n)
           {
            case 1:
            System.out.println(“El número es 1”);
            case 2:
            System.out.println(“El número es 2”);
            break;
            default:
             System.out.println(“El número no es 1 ni 2”);
            break;
             }
        */

        int n = 1;

        switch (n) {
            case 1:
                System.out.println("El número es 1");
                break;
            case 2:
                System.out.println("El número es 2");
                break;
            default:
                System.out.println("El número no es 1 ni 2");
        }
        System.out.println();

        /*
        d) El siguiente código debe imprimir los valores 1 a 10:
            n = 1;
            while (n < 10)
             System.out.println(n++);
         */

        i = 1;
        while (i <= 10) {
            System.out.printf("%d ", i++);;
        }
    }
}