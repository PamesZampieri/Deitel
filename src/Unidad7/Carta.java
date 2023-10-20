package Unidad7;

public class Carta {
    private final String cara; // cara de la carta (“As”, “Dos”, ...)
    private final String palo;  // palo de la carta (“Corazones”, “Diamantes”, ...)

    // el constructor de dos argumentos inicializa la cara y el palo de la carta
    public Carta(String cara, String palo) {
        this.cara = cara;
        this.palo = palo;
    }

    // devuelve representación String de Carta
    public String toString() {
        return cara + " de " + palo;
    }
}