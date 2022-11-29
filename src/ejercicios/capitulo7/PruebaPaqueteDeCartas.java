/*
7.30 (Barajar y repartir cartas) Modifique la aplicación de la figura 7.11 para repartir una mano de póquer de
cinco cartas. Después modifique la clase PaqueteDeCartas de la figura 7.10 para incluir métodos que determinen si
una mano contiene
a) un par
b) dos pares
c) una tercia (como tres reinas)
d) un póquer (como cuatro ases)
e) una corrida (es decir, las cinco cartas del mismo palo)
f) una escalera (es decir, cinco cartas de valor consecutivo de la misma cara)
g) “full house” (es decir, dos cartas de un valor de la misma cara y tres cartas de otro valor de la misma cara)
[Sugerencia: agregue los métodos obtenerCara y obtenerPalo a la clase Carta de la figura 7.9].

7.31 (Barajar y repartir cartas) Use los métodos desarrollados en el ejercicio 7.30 para escribir una aplicación
que reparta dos manos de póquer de cinco cartas, que evalúe cada mano y determine cuál de las dos es mejor.
*/

package ejercicios.capitulo7;

public class PruebaPaqueteDeCartas {
    public static void main(String[] args) {
        PaqueteDeCartas miPaqueteDeCartas = new PaqueteDeCartas();
        miPaqueteDeCartas.barajar();

        Carta[] mano1 = new Carta[5];
        Carta[] mano2 = new Carta[5];

        for (int i = 0; i < 5; i++) {
            mano1[i] = miPaqueteDeCartas.repartirCarta();
            mano2[i] = miPaqueteDeCartas.repartirCarta();
        }

        System.out.println("MANO 1:");
        for (Carta carta : mano1) {
            System.out.println(carta);
        }

        System.out.println("\nMANO 2:");
        for (Carta carta : mano2) {
            System.out.println(carta);
        }
        System.out.println();

        int puntajeMano1 = calcularPuntaje(mano1, miPaqueteDeCartas);
        int puntajeMano2 = calcularPuntaje(mano2, miPaqueteDeCartas);

        if (puntajeMano1 > puntajeMano2) {
            System.out.println("La mano ganadora es la 1!");
        } else if (puntajeMano2 > puntajeMano1) {
            System.out.println("La mano ganadora es la 2!");
        } else {
            puntajeMano1 = PaqueteDeCartas.getMayorValorPorCara(mano1);
            puntajeMano2 = PaqueteDeCartas.getMayorValorPorCara(mano2);

            if (puntajeMano1 > puntajeMano2) {
                System.out.println("La mano ganadora es la 1!");
                System.out.printf("Tiene la carta más alta, su puntaje es: %d.%n", puntajeMano1);
            } else {
                System.out.println("La mano ganadora es la 2!");
                System.out.printf("Tiene la carta más alta, su puntaje es: %d.%n", puntajeMano2);
            }
        }
    }

    public static int calcularPuntaje(Carta[] mano, PaqueteDeCartas miPaqueteDeCartas) {
        int puntaje = 0;

        if (miPaqueteDeCartas.hayPoquer(mano)) {
            puntaje = 20;
        }
        if (miPaqueteDeCartas.hayFullHouse(mano)) {
            puntaje = 19;
        }
        if (miPaqueteDeCartas.hayCorrida(mano)) {
            puntaje = 18;
        }
        if (miPaqueteDeCartas.hayEscalera(mano)) {
            puntaje = 17;
        }
        if (miPaqueteDeCartas.hayTercia(mano)) {
            puntaje = 16;
        }
        if (miPaqueteDeCartas.hayDosPares(mano)) {
            puntaje = 15;
        }
        if (miPaqueteDeCartas.hayPar(mano)) {
            puntaje = 14;
        }

        return puntaje;
    }
}