/*
7.30 (Barajar y repartir cartas) Modifique la aplicación de la figura 7.11 para repartir una mano de póquer de cinco
cartas. Después modifique la clase PaqueteDeCartas de la figura 7.10 para incluir métodos que determinen siuna mano
contiene
a) un par
b) dos pares
c) una tercia (como tres reinas)
d) un póquer (como cuatro ases)
e) una corrida (es decir, las cinco cartas del mismo palo)
f) una escalera (es decir, cinco cartas de valor consecutivo de la misma cara)
g) “full house” (es decir, dos cartas de un valor de la misma cara y tres cartas de otro valor de la misma cara)
[Sugerencia: agregue los métodos obtenerCara y obtenerPalo a la clase Carta de la figura 7.9].

7.31 (Barajar y repartir cartas) Use los métodos desarrollados en el ejercicio 7.30 para escribir una aplicación que
reparta dos manos de póquer de cinco cartas, que evalúe cada mano y determine cuál de las dos es mejor.

7.34 (Proyecto: barajar y repartir cartas) Modifique la aplicación de las figuras 7.9 a 7.11 para usar los tipos enum
Cara y Palo que representen las caras y los palos de las cartas. Declare cada uno de estos tipos enum como un tipo
public en su propio archivo de código fuente. Cada Carta debe tener las variables de instancia Cara y Palo. Éstas se
deben inicializar mediante el constructor de Carta. En la clase PaqueteDeCartas, cree un arreglo de objetos Cara que se
inicialice con los nombres de las constantes en el tipo enum Cara, y un arreglo de objetos Palo que se inicialice con
los nombres de las constantes en el tipo enum Palo. [Nota: al imprimir en pantalla una constante enum como un valor
String, se muestra el nombre de la constante].

7.35 (Algoritmo para barajar cartas Fisher-Yates) Investigue en línea el algoritmo para barajar cartas FisherYates y
úselo para reimplementar el método barajar en la figura 7.10.
*/

package ejercicios.capitulo7;

import java.security.SecureRandom;

public class PaqueteDeCartas {
    private final Carta[] paquete; // arreglo de objetos Carta
    private int cartaActual; // índice de la siguiente Carta a repartir (0 a 51)
    private static final int NUMERO_DE_CARTAS = 52; // número constante de Cartas
    private static final SecureRandom numerosAleatorios = new SecureRandom();

    // el constructor llena el paquete de Cartas
    public PaqueteDeCartas() {
        Cara[] caras = {Cara.AS, Cara.DOS, Cara.TRES, Cara.CUATRO, Cara.CINCO, Cara.SEIS,
                Cara.SIETE, Cara.OCHO, Cara.NUEVE, Cara.DIEZ, Cara.JOKER, Cara.REINA, Cara.REY};
        Palo[] palos = {Palo.CORAZONES, Palo.DIAMANTES, Palo.TREBOLES, Palo.ESPADAS};

        paquete = new Carta[NUMERO_DE_CARTAS];
        // crea arreglo de objetos Carta
        cartaActual = 0; // la primera Carta repartida será paquete[0]

        // llena el paquete con objetos Carta
        for (int i = 0; i < paquete.length; i++) {
            //(caras[i % 13] produce un valor de 0 a 12 (13 caras) y palos[i / 13] produce un valor de 0 a 3 (4 palos)
            paquete[i] = new Carta(caras[i % 13], palos[i / 13]);
        }
    }

    // baraja el paquete de Cartas con algoritmo de una pasada
    public void barajar() {
        // la siguiente llamada al método repartirCarta debe empezar en paquete[0] otra vez
        cartaActual = 0;

        for (int i = paquete.length - 1; i > 0; i--) {
            int numeroAleatorio = numerosAleatorios.nextInt(i);

            Carta aux = paquete[i];
            paquete[i] = paquete[numeroAleatorio];
            paquete[numeroAleatorio] = aux;
        }
    }

    // reparte una Carta
    public Carta repartirCarta() {
        if (cartaActual < paquete.length) {
            return paquete[cartaActual++];
        } else {
            return null;
        }
    }

    public boolean hayPar(Carta[] mano) {
        int[] frecuenciasPorCara = getFrecuenciasPorCara(mano);

        int cantidadPares = 0;
        for (int i : frecuenciasPorCara) {
            if (i == 2) {
                cantidadPares++;
            }
        }

        return cantidadPares == 1;
    }

    public boolean hayDosPares(Carta[] mano) {
        int[] frecuenciasPorCara = getFrecuenciasPorCara(mano);

        int cantidadPares = 0;
        for (int i : frecuenciasPorCara) {
            if (i == 2) {
                cantidadPares++;
            }
        }

        return cantidadPares == 2;
    }

    public boolean hayTercia(Carta[] mano) {
        int[] frecuenciasPorCara = getFrecuenciasPorCara(mano);

        int cantidadTercia = 0;
        for (int i : frecuenciasPorCara) {
            if (i == 3) {
                cantidadTercia++;
            }
        }

        return cantidadTercia == 1;
    }

    public boolean hayPoquer(Carta[] mano) {
        int[] frecuenciasPorCara = getFrecuenciasPorCara(mano);

        int cantidadPoquer = 0;
        for (int i : frecuenciasPorCara) {
            if (i == 4) {
                cantidadPoquer++;
            }
        }

        return cantidadPoquer == 1;
    }

    public boolean hayCorrida(Carta[] mano) {
        int[] frecuenciasPorPalo = getFrecuenciasPorPalo(mano);

        int cantidadCorrida = 0;
        for (int i : frecuenciasPorPalo) {
            if (i == 5) {
                cantidadCorrida++;
            }
        }

        return cantidadCorrida == 1;
    }

    public boolean hayEscalera(Carta[] mano) {
        int[] frecuenciasPorCara = getFrecuenciasPorCara(mano);

        for (int i = 0; i < frecuenciasPorCara.length; i++) {
            if (frecuenciasPorCara[i] == 1) {
                for (int j = i + 1; j < i + 5; j++) {
                    if (frecuenciasPorCara[j] != 1) {
                        return false;
                    }
                }

                return true;
            }
        }

        return false;
    }

    public boolean hayFullHouse(Carta[] mano) {
        int[] frecuenciasPorCara = getFrecuenciasPorCara(mano);

        int cantidadPares = 0;
        int cantidadTercia = 0;
        for (int i : frecuenciasPorCara) {
            if (i == 2) {
                cantidadPares++;
            }
            if (i == 3) {
                cantidadTercia++;
            }
        }

        return cantidadPares == 1 && cantidadTercia == 1;
    }

    private int[] getFrecuenciasPorCara(Carta[] mano) {
        int[] frecuenciasPorCara = new int[14];

        for (Carta carta : mano) {
            switch (carta.getCara()) {
                case AS:
                    frecuenciasPorCara[1]++;
                    break;
                case DOS:
                    frecuenciasPorCara[2]++;
                    break;
                case TRES:
                    frecuenciasPorCara[3]++;
                    break;
                case CUATRO:
                    frecuenciasPorCara[4]++;
                    break;
                case CINCO:
                    frecuenciasPorCara[5]++;
                    break;
                case SEIS:
                    frecuenciasPorCara[6]++;
                    break;
                case SIETE:
                    frecuenciasPorCara[7]++;
                    break;
                case OCHO:
                    frecuenciasPorCara[8]++;
                    break;
                case NUEVE:
                    frecuenciasPorCara[9]++;
                    break;
                case DIEZ:
                    frecuenciasPorCara[10]++;
                    break;
                case JOKER:
                    frecuenciasPorCara[11]++;
                    break;
                case REINA:
                    frecuenciasPorCara[12]++;
                    break;
                case REY:
                    frecuenciasPorCara[13]++;
            }
        }

        return frecuenciasPorCara;
    }

    private int[] getFrecuenciasPorPalo(Carta[] mano) {
        int[] frecuenciasPorPalo = new int[4];

        for (Carta carta : mano) {
            switch (carta.getPalo()) {
                case CORAZONES:
                    frecuenciasPorPalo[0]++;
                    break;
                case DIAMANTES:
                    frecuenciasPorPalo[1]++;
                    break;
                case TREBOLES:
                    frecuenciasPorPalo[2]++;
                    break;
                case ESPADAS:
                    frecuenciasPorPalo[3]++;
            }
        }

        return frecuenciasPorPalo;
    }

    public static int getMayorValorPorCara(Carta[] mano) {
        int mayorValorPorCara = 0;

        for (Carta carta : mano) {
            int valorActual = carta.getValor();

            if (valorActual > mayorValorPorCara) {
                mayorValorPorCara = valorActual;
            }
        }

        return mayorValorPorCara;
    }
}