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

7.34 (Proyecto: barajar y repartir cartas) Modifique la aplicación de las figuras 7.9 a 7.11 para usar los tipos enum
Cara y Palo que representen las caras y los palos de las cartas. Declare cada uno de estos tipos enum como un tipo
public en su propio archivo de código fuente. Cada Carta debe tener las variables de instancia Cara y Palo. Éstas se
deben inicializar mediante el constructor de Carta. En la clase PaqueteDeCartas, cree un arreglo de objetos Cara que se
inicialice con los nombres de las constantes en el tipo enum Cara, y un arreglo de objetos Palo que se inicialice con
los nombres de las constantes en el tipo enum Palo. [Nota: al imprimir en pantalla una constante enum como un valor
String, se muestra el nombre de la constante].
 */

package ejercicios.capitulo7;

public class Carta {
    private final Cara cara; // cara de la carta (“As”, “Dos”, ...)
    private final Palo palo; // palo de la carta (“Corazones”, “Diamantes”, ...)
    private final int valor;

    public Carta(Cara caraCarta, Palo paloCarta) {
        this.cara = caraCarta;
        this.palo = paloCarta;
        this.valor = calcularValor(caraCarta);
    }

    public Cara getCara() {
        return cara;
    }

    public Palo getPalo() {
        return palo;
    }

    public int getValor() {
        return valor;
    }

    // devuelve representación String de Carta
    public String toString() {
        return cara + " de " + palo;
    }

    private int calcularValor(Cara cara) {
        switch (cara) {
            case DOS:
                return 1;
            case TRES:
                return 2;
            case CUATRO:
                return 3;
            case CINCO:
                return 4;
            case SEIS:
                return 5;
            case SIETE:
                return 6;
            case OCHO:
                return 7;
            case NUEVE:
                return 8;
            case DIEZ:
                return 9;
            case JOKER:
                return 10;
            case REINA:
                return 11;
            case REY:
                return 12;
        }

        return 13;
    }
}