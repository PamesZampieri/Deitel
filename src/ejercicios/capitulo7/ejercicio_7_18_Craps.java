/*
7.18 (Juego de Craps) Escriba una aplicación que ejecute 1,000,000 de juegos de Craps (figura 6.8) y responda a las
siguientes preguntas:
a) ¿Cuántos juegos se ganan en el primer tiro, en el segundo, …, en el vigésimo y después de éste? 1er tiro ganan
aprox. 222,982. En el 2do 77,493. En el 3ro 55,271 y así sucesivamente, van disminuyendo.
b) ¿Cuántos juegos se pierden en el primer tiro, en el segundo, …, en el vigésimo y después de éste? 1er tiro pierden
aprox. 111,473. En el 2do 110,983. En el 3ro 78,979 y así sucesivamente, van disminuyendo.
c) ¿Cuáles son las probabilidades de ganar en Craps? [Nota: debe descubrir que Craps es uno de los juegos de casino más
justos. ¿Qué cree usted que significa esto?]. Las probabilidades de ganar son 50/50.
d) ¿Cuál es la duración promedio de un juego de Craps? Es de 3.37 tiros.
e) ¿Las probabilidades de ganar mejoran con la duración del juego? No mejoran, hay más probabilidades de ganar en el 1er
tiro que en las sucesivas tiradas.
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

    private static final int RESTANTES_FRECUENCIAS = 21;// frecuencias de tiradas desde la vigésima primera (21) y subsiguientes.

    private static final int cantitadJuegos = 1000000;

    public static void main(String[] args) {
        int miPunto = 0;
        EstadoJuego estadoJuego;
        int[] frecuenciasGana = new int[22];
        int[] frecuenciasPierde = new int[22];

        for (int i = 0; i < cantitadJuegos; i++) {
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
                    frecuenciasGana[Math.min(tirada, RESTANTES_FRECUENCIAS)]++;
                } else {
                    if (sumaDeDados == SIETE) {
                        estadoJuego = EstadoJuego.PERDIO;
                        frecuenciasPierde[Math.min(tirada, RESTANTES_FRECUENCIAS)]++;
                    }
                }
            }
        }

        System.out.printf("%s%20s%n", "CANTIDAD DE TIROS", "GANA");
        imprimir(frecuenciasGana);

        System.out.printf("%n%s%20s%n", "CANTIDAD DE TIROS", "PIERDE");
        imprimir(frecuenciasPierde);

        double totalFrecuencias = 0;
        for (int i = 1; i < frecuenciasGana.length; i++) {
            totalFrecuencias += (frecuenciasGana[i] + frecuenciasPierde[i]) * i;
        }

        double promedioJuegoPonderado = totalFrecuencias / cantitadJuegos;

        System.out.printf("%nLa duración promedio de un juego de Craps es de %.2f tiros.", promedioJuegoPonderado);
    }

    public static int tirarDados() {
        int dado1 = 1 + numerosAleatorios.nextInt(6);
        int dado2 = 1 + numerosAleatorios.nextInt(6);

        return dado1 + dado2;
    }

    public static void imprimir(int[] arreglo) {
        int tirosJuego = 1;

        for (int i = 1; i < arreglo.length; i++) {
            System.out.printf("%-2d %,35d%n", tirosJuego, arreglo[i]);
            tirosJuego++;
        }
    }
}