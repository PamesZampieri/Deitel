/*
4.27 (Problema del else suelto) Determine la salida de cada uno de los siguientes conjuntos de código, cuando x
es 9 y y es 11, y cuando x es 11 y y es 9. Observe que el compilador ignora la sangría en un programa en Java. Además,
el compilador de Java siempre asocia un else con el if que le precede inmediatamente, a menos que se le indique de
otra forma mediante la colocación de llaves ({ }). A primera vista, el programador tal vez no esté seguro de cuál if
corresponde a cuál else; esta situación se conoce como el “problema del else suelto”. Hemos eliminado la sangría del
siguiente código para hacer el problema más retador. [Sugerencia: Aplique las convenciones de sangría que ha aprendido].
 */

package ejercicios.capitulo4;

public class ejercicio_4_27_ProblemaDelElseSuelto {
    public static void main(String[] args) {
        int x = 9; // Se prueba también con valor x = 11, y = 9;
        int y = 11;

        /*
        a) if (x < 10)
        if (y > 10)
        System.out.println(“*****”);
        else
        System.out.println(“#####”);
        System.out.println(“$$$$$”);
         */
        if (x < 10)
            if (y > 10)
                System.out.println("*****");
            else
                System.out.println("#####");
        System.out.println("$$$$$");

        /*
        b) if (x < 10)
        {
            if (y > 10)
                System.out.println(“*****”);
        }
        else
        {
            System.out.println(“#####”);
            System.out.println(“$$$$$”);
        }
         */
        if (x < 10) {
            if (y > 10)
                System.out.println("*****");
        } else {
            System.out.println("#####");
            System.out.println("$$$$$");
        }
    }
}