/*
5.14 (Programa modificado del interés compuesto) Modifique la aplicación de interés compuesto de la figura
5.6, repitiendo sus pasos para las tasas de interés del 5, 6, 7, 8, 9 y 10%. Use un ciclo for para variar la tasa de
interés.
*/

package ejercicios.capitulo5;

public class ejercicio_5_14_InteresModificado {
    public static void main(String[] args) {
        double capital = 1000.0;

        System.out.printf("%4s%10s%10s%10s%10s%10s%10s%n", "Año", "Tasa 5%", "Tasa 6%", "Tasa 7%", "Tasa 8%", "Tasa 9%",
                "Tasa 10%");

        for (int i = 1; i <= 10; ++i) {
            System.out.printf("%4d", i);

            for (int j = 5; j <= 10; ++j) {
                double monto = capital * Math.pow(1.0 + ((double) j / 100), i);
                System.out.printf("%,10.2f", monto);
            }
            System.out.println();
        }
    }
}