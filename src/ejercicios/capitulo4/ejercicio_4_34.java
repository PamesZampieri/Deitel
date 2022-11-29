/*
4.34 (¿Qué está mal en este código?) ¿Qué está mal en la siguiente instrucción? Proporcione la instrucción correcta para
 sumar uno a la suma de x y y.
System.out.println(++(x + y));
 */

package ejercicios.capitulo4;

public class ejercicio_4_34 {
    public static void main(String[] args) {
        int x = 501;
        int y = 607;

        System.out.println(++x + y);
    }
}
