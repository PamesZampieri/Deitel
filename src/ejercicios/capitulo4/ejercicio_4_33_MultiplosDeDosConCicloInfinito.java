/* 4.33 (Múltiplos de 2 con un ciclo infinito) Escriba una aplicación que muestre en la ventana de comandos las
potencias del entero 2 (es decir, 2, 4, 8, 16, 32, 64, etcétera). Su ciclo no debe terminar (es decir, debe crear un
ciclo infinito). ¿Qué ocurre cuando ejecuta este programa?
 */

package ejercicios.capitulo4;

public class ejercicio_4_33_MultiplosDeDosConCicloInfinito {
    public static void main(String[] args) {
        int numero = 2;

        while (numero >= 0) {
            System.out.printf("%d%n", numero);
            numero *= 2;
        }

        System.out.printf("%d%n", numero);
    }
}