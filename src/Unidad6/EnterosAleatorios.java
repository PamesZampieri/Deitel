package Unidad6;

import java.security.SecureRandom;

public class EnterosAleatorios {
    public static void main(String[] args) {
        SecureRandom numerosAleatorios = new SecureRandom();

        for (int contador = 1; contador <= 20; contador++) {
            int cara = 1 + numerosAleatorios.nextInt(6);
            System.out.printf("%d ", cara);

            if (contador % 5 == 0) {
                System.out.println();
            }
        }
    }
}
