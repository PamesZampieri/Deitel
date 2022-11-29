/*
5.27 ¿Qué hace el siguiente segmento de programa?
*/

package ejercicios.capitulo5;

public class ejercicio_5_27 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 3; j++) {
                for (int k = 1; k <= 4; k++)
                    System.out.print('*');

                System.out.println();
            }
            System.out.println();
        }
    }
}
