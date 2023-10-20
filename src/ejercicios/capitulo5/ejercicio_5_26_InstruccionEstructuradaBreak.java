/*
5.26 Una crítica de las instrucciones break y continue es que ninguna es estructurada. En realidad, estas instrucciones
pueden reemplazarse entodo momento por instrucciones estructuradas, aunque hacerlo podría ser inadecuado.
Describa, en general, cómo eliminaría las instrucciones break de un ciclo en un programa, para reemplazarlas con
alguna de las instrucciones estructuradas equivalentes. [Sugerencia: La instrucción break se sale de un ciclo desde el
cuerpo de éste. La otra forma de salir es que falle la prueba de continuación de ciclo. Considere utilizar en la prueba
de continuación de ciclo una segunda prueba que indique una “salida anticipada debido a una condición de interrupción”].
Use la técnica que desarrolló aquí para eliminar la instrucción break de la aplicación de la figura 5.13.
 */

package ejercicios.capitulo5;

public class ejercicio_5_26_InstruccionEstructuradaBreak {
    public static void main(String[] args) {
        int cuenta;

        for (cuenta = 1; cuenta <= 10; cuenta++) {
            if (cuenta == 5) {
                break;
            }
            System.out.printf("%d ", cuenta);
        }
        System.out.printf("%nSalió del ciclo en cuenta = %d%n", cuenta);
        System.out.println();

        //Ejemplo equivalente reemplazando break:
        for (cuenta = 1; cuenta < 5; cuenta++) {
            System.out.printf("%d ", cuenta);
        }
        System.out.printf("%nSalió del ciclo en cuenta = %d%n", cuenta);
    }
}