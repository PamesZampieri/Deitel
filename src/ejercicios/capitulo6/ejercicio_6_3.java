/*
6.3 Escriba una aplicación que pruebe si los ejemplos de las llamadas a los métodos de la clase Math que se muestran en
la figura 6.2 realmente producen los resultados indicados.
*/

package ejercicios.capitulo6;

public class ejercicio_6_3 {
    public static void main(String[] args) {
        System.out.println("Vamos a controlar que los métodos de la clase Math den los resultados esperados con los " +
                "siguientes ejemplos: ");
        System.out.printf("Método Math.abs(23.7) = %.1f,el resultado esperado es = %.1f ok?. Es %b.%n", Math.abs(23.7),
                23.7, Math.abs(23.7) == 23.7);
        System.out.printf("Método Math.abs(0.0) = %.1f,el resultado esperado es = %.1f ok?. Es %b.%n", Math.abs(0.0),
                0.0, Math.abs(0.0) == 0.0);
        System.out.printf("Método Math.abs(-23.7) = %.1f,el resultado esperado es = %.1f ok?. Es %b.%n%n", Math.abs(-23.7),
                23.7, Math.abs(-23.7) == 23.7);

        System.out.printf("Método Math.ceil(9.2) = %.1f,el resultado esperado es = %.1f ok?. Es %b.%n", Math.ceil(9.2),
                10.0, Math.ceil(9.2) == 10.0);
        System.out.printf("Método Math.ceil(-9.8) = %.1f,el resultado esperado es = %.1f ok?. Es %b.%n%n", Math.ceil(-9.8),
                -9.0, Math.ceil(-9.8) == -9.0);

        System.out.printf("Método Math.cos(0.0) = %.1f,el resultado esperado es = %.1f ok?. Es %b.%n%n", Math.cos(0.0),
                1.0, Math.cos(0.0) == 1.0);

        System.out.printf("Método Math.exp(1.0) = %f,el resultado esperado es = %f ok?. Es %b.%n", Math.exp(1.0),
                2.718282, Math.exp(1.0) > 2.618282 && Math.exp(1.0) < 2.818282);
        System.out.printf("Método Math.exp(2.0) = %f,el resultado esperado es = %f ok?. Es %b.%n%n", Math.exp(2.0),
                7.389056, Math.exp(2.0) > 7.289056 && Math.exp(2.0) < 7.489056);

        System.out.printf("Método Math.floor(9.2) = %.1f,el resultado esperado es = %.1f ok?. Es %b.%n", Math.floor(9.2),
                9.0, Math.floor(9.2) == 9.0);
        System.out.printf("Método Math.floor(-9.8) = %.1f,el resultado esperado es = %.1f ok?. Es %b.%n%n", Math.floor(-9.8),
                -10.0, Math.floor(-9.8) == -10.0);

        System.out.printf("Método Math.log(Math.E) = %.1f,el resultado esperado es = %.1f ok?. Es %b.%n", Math.log(Math.E),
                1.0, Math.log(Math.E) == 1.0);
        System.out.printf("Método Math.log(Math.E * Math.E) = %.1f,el resultado esperado es = %.1f ok?. Es %b.%n%n",
                Math.log(Math.E * Math.E), 2.0, Math.log(Math.E * Math.E) == 2.0);

        System.out.printf("Método Math.max(2.3, 12.7) = %.1f,el resultado esperado es = %.1f ok?. Es %b.%n",
                Math.max(2.3, 12.7), 12.7, Math.max(2.3, 12.7) == 12.7);
        System.out.printf("Método Math.max(-2.3, -12.7) = %.1f,el resultado esperado es = %.1f ok?. Es %b.%n%n",
                Math.max(-2.3, -12.7), -2.3, Math.max(-2.3, -12.7) == -2.3);

        System.out.printf("Método Math.min(2.3, 12.7) = %.1f,el resultado esperado es = %.1f ok?. Es %b.%n",
                Math.min(2.3, 12.7), 2.3, Math.min(2.3, 12.7) == 2.3);
        System.out.printf("Método Math.min(-2.3, -12.7) = %.1f,el resultado esperado es = %.1f ok?. Es %b.%n%n",
                Math.min(-2.3, -12.7), -12.7, Math.min(-2.3, -12.7) == -12.7);

        System.out.printf("Método Math.pow(2.0, 7.0) = %.1f,el resultado esperado es = %.1f ok?. Es %b.%n",
                Math.pow(2.0, 7.0), 128.0, Math.pow(2.0, 7.0) == 128.0);
        System.out.printf("Método Math.pow(9.0, 0.5) = %.1f,el resultado esperado es = %.1f ok?. Es %b.%n%n",
                Math.pow(9.0, 0.5), 3.0, Math.pow(9.0, 0.5) == 3.0);

        System.out.printf("Método Math.sin(0.0) = %.1f,el resultado esperado es = %.1f ok?. Es %b.%n%n", Math.sin(0.0),
                0.0, Math.sin(0.0) == 0.0);

        System.out.printf("Método Math.sqrt(900.0) = %.1f,el resultado esperado es = %.1f ok?. Es %b.%n%n", Math.sqrt(900.0),
                30.0, Math.sqrt(900.0) == 30.0);

        System.out.printf("Método Math.tan(0.0) = %.1f,el resultado esperado es = %.1f ok?. Es %b.%n", Math.tan(0.0),
                0.0, Math.tan(0.0) == 0.0);
    }
}