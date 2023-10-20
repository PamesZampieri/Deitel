package Unidad7;

import java.security.SecureRandom;

public class PaqueteDeCartas {
    private final Carta[] paquete; // arreglo de objetos Carta
    private int cartaActual; // índice de la siguiente Carta a repartir (0 a 51)
    private static final int NUMERO_DE_CARTAS = 52; // número constante de Cartas

    private static final SecureRandom numerosAleatorios = new SecureRandom();

    // el constructor llena el paquete de Cartas
    public PaqueteDeCartas() {
        String[] caras = {"As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez", "Jocker",
                "Reina", "Rey"};
        String[] palos = {"Corazones", "Diamantes", "Tréboles", "Espadas"};

        paquete = new Carta[NUMERO_DE_CARTAS];
        // crea arreglo de objetos Carta
        cartaActual = 0; // la primera Carta repartida será paquete[0]

        // llena el paquete con objetos Carta
        for (int cuenta = 0; cuenta < paquete.length; cuenta++) {
            //(caras[i % 13] produce un valor de 0 a 12 (13 caras) y palos[i / 13] produce un valor de 0 a 3 (4 palos)
            paquete[cuenta] = new Carta(caras[cuenta % 13], palos[cuenta / 13]);
        }
    }

    // baraja el paquete de Cartas con algoritmo de una pasada
    public void barajar() {
        // la siguiente llamada al método repartirCarta debe empezar en paquete[0] otra vez
        cartaActual = 0;

        // para cada Carta, selecciona otra Carta aleatoria (0 a 51) y las intercambia
        for (int primera = 0; primera < paquete.length; primera++) {
            // selecciona un número aleatorio entre 0 y 51
            int segunda = numerosAleatorios.nextInt(NUMERO_DE_CARTAS);

            // intercambia Carta actual con la Carta seleccionada al azar
            Carta temp = paquete[primera];
            paquete[primera] = paquete[segunda];
            paquete[segunda] = temp;
        }
    }

    // reparte una Carta
    public Carta repartirCarta() {
        // determina si quedan Cartas por repartir
        if (cartaActual < paquete.length) {
            return paquete[cartaActual++];  // devuelve la Carta actual en el arreglo
        } else {
            return null;  // devuelve null para indicar que se repartieron todas las Cartas
        }
    }
}