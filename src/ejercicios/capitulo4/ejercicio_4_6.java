/*
4.6 Combine las instrucciones que escribió en el ejercicio 4.5 para formar una aplicación en Java que calcule
e imprima la suma de los enteros del 1 al 10. Use una instrucción while para iterar a través de las instrucciones de
cálculo e incremento. El ciclo debe terminar cuando el valor de x se vuelva 11.
*/

package ejercicios.capitulo4;

public class ejercicio_4_6 {
    public static void main(String[] args) {
        int suma = 0;
        int x = 1;

        while (x <= 10) {
            suma += x;
            x++;
        }

        System.out.printf("El total de la suma es: %d%n", suma);
    }
}