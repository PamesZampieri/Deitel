/*
5.20 (Calcular el valor de π) Calcule el valor de π a partir de la serie infinita
π = 4 – 4 + 4 + 4 + 4 + 4 + ... IMPORTANTE: "La Fórmula del libro no da el valor correcto de π: 3.14159"
        3   5   7   9   11

Imprima una tabla que muestre el valor aproximado de π, calculando los primeros 200,000 términos de esta serie.
¿Cuántos términos tiene que utilizar para obtener un valor que comience con 3.14159?
3 términos.
 */

package ejercicios.capitulo5;

public class ejercicio_5_20_CalcularElValorDePi {
    public static void main(String[] args) {
        System.out.printf("%8s%20s%n", "TERMINO", "VALOR DE π");
        System.out.printf("%8d%20d%n", 1, 4);

        double j = 3;
        double pi = 4 - (4 / j);
        System.out.printf("%8d%20.5f%n", 2, pi);

        for (int i = 3; i <= 100; i++) {
            j += 2;
            pi += 4 / j;

            System.out.printf("%8d%20.5f%n", i, pi);
        }
    }
}