/*
4.28 (Otro problema de else suelto) Modifique el código dado para producir la salida que se muestra en cada
parte del problema. Utilice las técnicas de sangría apropiadas. No haga modificaciones en el código, sólo inserte llaves
o modifique la sangría del código. El compilador ignora la sangría en un programa en Java. Hemos eliminado la sangría
en el código dado, para hacer el problema más retador. [Nota: es posible que no se requieran modificaciones en algunas
de las partes].
if (y == 8)
if (x == 5)
System.out.println(“@@@@@”);
else
System.out.println(“#####”);
System.out.println(“$$$$$”);
System.out.println(“&&&&&”);
 */

package ejercicios.capitulo4;

public class ejercicio_4_28_OtroProblemaDelElseSuelto {
    public static void main(String[] args) {
    /*
    a) Suponiendo que x = 5 y y = 8, se produce la siguiente salida:
    @@@@@
    $$$$$
    &&&&&
    */
        int x = 5;
        int y = 8;

        if (y == 8) {
            if (x == 5) {
                System.out.println("@@@@");
            } else {
                System.out.println("#####");
            }
        }
        System.out.println("$$$$$");
        System.out.println("&&&&&");

        System.out.println();

    /*
    b) Suponiendo que x = 5 y y = 8, se produce la siguiente salida:
    @@@@@
    $$$$$
    Está mal la consigna del libro. No se puede imprimir el resultado sólo con mover las llaves, siempre imprime "&&&&&"
    */
        if (y == 8) {
            if (x == 5) {
                System.out.println("@@@@");
            } else {
                System.out.println("#####");
            }
            System.out.println("$$$$$");
        }
        System.out.println("&&&&&");

        System.out.println();

    /*
    c) Suponiendo que x = 5 y y = 8, se produce la siguiente salida:
    @@@@@
    */

        if (y == 8) {
            if (x == 5) {
                System.out.println("@@@@");
            } else {
                System.out.println("#####");
                System.out.println("$$$$$");
                System.out.println("&&&&&");
            }
        }

        System.out.println();

    /*
    d) Suponiendo que x = 5 y y = 7, se produce la siguiente salida. [Nota: las tres últimas instrucciones de salida
    después del else forman parte de un bloque].
    #####
    $$$$$
    &&&&&
    */
        x = 5;
        y = 7;

        if (y == 8) {
            if (x == 5) {
                System.out.println("@@@@");
            }
        } else {
            System.out.println("#####");
            System.out.println("$$$$$");
            System.out.println("&&&&&");
        }
    }
}