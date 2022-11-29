/*
5.28 Describa, en general, cómo eliminaría las instrucciones continue de un ciclo en un programa, para reemplazarlas con
uno de sus equivalentes estructurados. Use la técnica que desarrolló aquí para eliminar la instrucción continue del
programa de la figura 5.14.
*/

package ejercicios.capitulo5;

public class ejercicio_5_28_InstruccionEstructuradaContinue {
    public static void main(String[] args) {
        for (int cuenta = 1; cuenta <= 10; cuenta++) {
            if (cuenta == 5) {
                continue;
            }
            System.out.printf("%d ", cuenta);
        }
        System.out.println("\nSe uso continue para evitar imprimir 5");
        System.out.println();

        //Ejemplo equivalente reemplazando continue:
        for (int cuenta = 1; cuenta <= 10; cuenta++) {
            if (cuenta != 5) {
                System.out.printf("%d ", cuenta);
            }
        }
        System.out.println("\nSe uso un if con operador lógico de negación para evitar imprimir 5");
    }

}
