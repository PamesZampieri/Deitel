/*
5.23 (Leyes de De Morgan) En este capítulo, hemos hablado sobre los operadores lógicos &&, &, ||, |, ^ y !. Algunas
veces, las leyes de De Morgan pueden hacer que sea más conveniente para nosotros expresar una expresión lógica.
Estas leyes establecen que la expresión !(condición1 && condición2) es lógicamente equivalente a la expresión
(!condición1 || !condición2). También establecen que la expresión !(condición1 || condición2) es lógicamente equivalente
 a la expresión (!condición1 && !condición2). Use las leyes de De Morgan para escribir expresiones equivalentes para
 cada una de las siguientes expresiones, luego escriba una aplicación que demuestre que, tanto la expresión original
como la nueva expresión, producen en cada caso el mismo valor:
a) !(x < 5) && !(y >= 7)
b) !(a == b) || !(g != 5)
c) !((x <= 8) && (y > 4))
d) !((i > 4) || (j <= 6))
*/

package ejercicios.capitulo5;

public class ejercicio_5_23_LeyesDeMorgan {
    public static void main(String[] args) {
        //a)
        System.out.println("!(x < 5) && !(y >= 7)\t\t!((x < 5) || (y >= 7))");
        System.out.printf("%b\t\t\t\t\t\t%b%n", !(false) && !(false), !((false) || (false)));
        System.out.printf("%b\t\t\t\t\t\t%b%n", !(false) && !(true), !((false) || (true)));
        System.out.printf("%b\t\t\t\t\t\t%b%n", !(true) && !(false), !((true) || (false)));
        System.out.printf("%b\t\t\t\t\t\t%b%n", !(true) && !(true), !((true) || (true)));
        System.out.println();

        //b)
        System.out.println("!(a == b) || !(g != 5)\t\t!((a == b) && (g != 5))");
        System.out.printf("%b\t\t\t\t\t\t%b%n", !(false) || !(false), !((false) && (false)));
        System.out.printf("%b\t\t\t\t\t\t%b%n", !(false) || !(true), !((false) && (true)));
        System.out.printf("%b\t\t\t\t\t\t%b%n", !(true) || !(false), !((true) && (false)));
        System.out.printf("%b\t\t\t\t\t\t%b%n", !(true) || !(true), !((true) && (true)));
        System.out.println();

        //c)
        System.out.println("!((x <= 8) && (y > 4))\t\t!(x <= 8) || !(y > 4)");
        System.out.printf("%b\t\t\t\t\t\t%b%n", !((false) && (false)), !(false) || !(false));
        System.out.printf("%b\t\t\t\t\t\t%b%n", !((false) && (true)), !(false) || !(true));
        System.out.printf("%b\t\t\t\t\t\t%b%n", !((true) && (false)), !(true) || !(false));
        System.out.printf("%b\t\t\t\t\t\t%b%n", !((true) && (true)), !(true) || !(true));
        System.out.println();

        //d)
        System.out.println("!((i > 4) || (j <= 6))\t\t!(i > 4) && !(j <= 6)");
        System.out.printf("%b\t\t\t\t\t\t%b%n", !((false) || (false)), !(false) && !(false));
        System.out.printf("%b\t\t\t\t\t\t%b%n", !((false) || (true)), !(false) && !(true));
        System.out.printf("%b\t\t\t\t\t\t%b%n", !((true) || (false)), !(true) && !(false));
        System.out.printf("%b\t\t\t\t\t\t%b%n", !((true) || (true)), !(true) && !(true));
    }
}