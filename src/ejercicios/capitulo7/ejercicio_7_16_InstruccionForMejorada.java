/*
7.16 (Uso de la instrucción for mejorada) Escriba una aplicación que utilice una instrucción for mejorada para sumar los
valores double que se pasan mediante los argumentos de línea de comandos. [Sugerencia: use el método static parseDouble
de la clase Double para convertir un String en un valor double].
*/

package ejercicios.capitulo7;

public class ejercicio_7_16_InstruccionForMejorada {
    public static void main(String[] args) {
        double total = 0;

        for (String arg : args) {
            total += Double.parseDouble(arg);
        }

        System.out.printf("La suma de los argumentos es: %.2f", total);
    }
}