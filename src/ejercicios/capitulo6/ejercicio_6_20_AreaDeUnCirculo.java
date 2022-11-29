/*
6.20 (Área de un círculo) Escriba una aplicación que pida al usuario el radio de un círculo y que utilice un método
llamado circuloArea para calcular e imprimir el área.
*/

package ejercicios.capitulo6;

import java.util.Scanner;

public class ejercicio_6_20_AreaDeUnCirculo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escriba el radio de un circulo: ");
        double radio = entrada.nextInt();
        System.out.printf("El área del circulo es: %.2f", circuloArea(radio));
    }

    public static double circuloArea(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }
}
