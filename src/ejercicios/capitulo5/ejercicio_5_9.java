package ejercicios.capitulo5;

public class ejercicio_5_9 {
    public static void main(String[] args) {
        /*
        5.9 Encuentre y corrija los errores en cada uno de los siguientes fragmentos de código:

        a) For (i = 100, i >= 1, i++)
        System.out.println(i);
        */

        for (int i = 100; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println();

        /*
        b) El siguiente código debe imprimirse sin importar si el valor entero es par o impar:
        switch (value % 2)
        {
        case 0:
         System.out.println(“Entero par”);
         case 1:
         System.out.println(“Entero impar”);
         }
        */

        int value = 0;

        switch (value % 2) {
            case 0:
            case 1:
                System.out.println("Entero par");
                System.out.println("Entero impar");
        }
        System.out.println();

        /*
        c) El siguiente código debe imprimir los enteros impares del 19 al 1:
        for (i = 19; i >= 1; i += 2)
        System.out.println(i);
        */

        for (int i = 19; i >= 1; i -= 2) {
            System.out.println(i);
        }
        System.out.println();

        /*
        d) El siguiente código debe imprimir los enteros pares del 2 al 100:
         contador = 2;
        do
         {
         System.out.println(contador);
         contador += 2;
         } While (contador < 100);
         */

        int contador = 2;

        do {
            System.out.println(contador);
            contador += 2;
        } while (contador <= 100);
    }
}
