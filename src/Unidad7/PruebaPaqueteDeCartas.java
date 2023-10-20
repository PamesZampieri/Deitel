package Unidad7;

public class PruebaPaqueteDeCartas {
    public static void main(String[] args) {
        PaqueteDeCartas miPaqueteDeCartas = new PaqueteDeCartas();
        miPaqueteDeCartas.barajar(); // coloca las Cartas en orden aleatorio

        // imprime las 52 Cartas en el orden en el que se reparten
        for (int i = 1; i <= 52; i++) {
            // reparte e imprime una Carta
            System.out.printf("%-20s", miPaqueteDeCartas.repartirCarta());

            if (i % 4 == 0) { // imprime una nueva línea después de cada cuatro cartas
                System.out.println();
            }
        }
    }
}