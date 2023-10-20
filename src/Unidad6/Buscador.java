package Unidad6;

public class Buscador {
    public static void main (String [] args) {
        double numero1 = 345.2;
        double numero2 = 45.6;
        double numero3 = 567.9;

        double resultado = BuscadorMaximo.maximo(numero1, numero2, numero3);

        System.out.println("El máximo es: " + resultado);
    }
}