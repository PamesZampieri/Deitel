/*
7.18 (Juego de Craps) Escriba una aplicación que ejecute 1,000,000 de juegos de Craps (figura 6.8) y responda a
las siguientes preguntas:
a) ¿Cuántos juegos se ganan en el primer tiro, en el segundo, …, en el vigésimo y después de éste?
b) ¿Cuántos juegos se pierden en el primer tiro, en el segundo, …, en el vigésimo y después de éste?
c) ¿Cuáles son las probabilidades de ganar en Craps? [Nota: debe descubrir que Craps es uno de los juegos
de casino más justos. ¿Qué cree usted que significa esto?].
d) ¿Cuál es la duración promedio de un juego de Craps?
e) ¿Las probabilidades de ganar mejoran con la duración del juego?
*/

package ejercicios.capitulo7;

import java.security.SecureRandom;

public class ejercicio_7_18_Craps {
    private static final SecureRandom numerosAleatorios = new SecureRandom();
    private enum EstadoJuego {CONTINUA, GANO, PERDIO}
    private static final int DOS_UNOS = 2;
    private static final int TRES = 3;
    private static final int SIETE = 7;
    private static final int ONCE = 11;
    private static final int DOCE = 12;

    public static void main(String[] args) {
        int miPunto = 0;
        EstadoJuego estadoJuego;
        int[] frecuenciasGana = new int[12];
        int[] frecuenciasPierde = new int[12];

        for (int i = 0; i < 1_000_000; i++) {
            int sumaDeDados = tirarDados();
            int tirada = 1;

            switch (sumaDeDados) {
                case SIETE:
                case ONCE:
                    estadoJuego = EstadoJuego.GANO;
                    frecuenciasGana[tirada]++;
                    break;
                case DOS_UNOS:
                case TRES:
                case DOCE:
                    estadoJuego = EstadoJuego.PERDIO;
                    frecuenciasPierde[tirada]++;
                    break;
                default:
                    estadoJuego = EstadoJuego.CONTINUA;
                    miPunto = sumaDeDados;
                    break;
            }

            while (estadoJuego == EstadoJuego.CONTINUA) {
                sumaDeDados = tirarDados();
                tirada++;

                if (sumaDeDados == miPunto) {
                    estadoJuego = EstadoJuego.GANO;
                    frecuenciasGana[Math.min(tirada, 11)]++;
                } else {
                    if (sumaDeDados == SIETE) {
                        estadoJuego = EstadoJuego.PERDIO;
                        frecuenciasPierde[Math.min(tirada, 11)]++;
                    }
                }
            }
        }

        System.out.printf("%s%20s%n", "CANTIDAD DE TIROS", "GANA");
        int tirosJuego = 1;
        for (int i = 1; i < frecuenciasGana.length; i++) {
            System.out.printf("%-2d %,35d%n", tirosJuego, frecuenciasGana[i]);
            tirosJuego++;
        }

        System.out.printf("%n%s%20s%n", "CANTIDAD DE TIROS", "PIERDE");
        tirosJuego = 1;
        for (int i = 1; i < frecuenciasPierde.length; i++) {
            System.out.printf("%-2d %,35d%n", tirosJuego, frecuenciasPierde[i]);
            tirosJuego++;
        }
    }

    public static int tirarDados() {
        int dado1 = 1 + numerosAleatorios.nextInt(6);
        int dado2 = 1 + numerosAleatorios.nextInt(6);

        return dado1 + dado2;
    }
}