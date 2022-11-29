package Unidad5;

public class Interes {
    public static void main(String[] args) {

        double monto;
        double capital = 1000.0;
        double tasa = 0.05;

        System.out.printf("%s%20s%n", "Año", "Monto en Depósito");

        for (int year = 1; year <= 10; ++year) {
            monto = capital * Math.pow(1.0 + tasa, year);

            System.out.printf("%3d%,20.2f%n", year, monto);
        }
    }
}
