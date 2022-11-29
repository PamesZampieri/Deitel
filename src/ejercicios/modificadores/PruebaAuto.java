package ejercicios.modificadores;

public class PruebaAuto {
    public static void main(String[] args) {
        final Auto auto1 = new Auto(100);
        Auto auto2 = new Auto(10);

        System.out.println("El número de serie del auto1 es: " + auto1.getNroDeSerie());
        System.out.println("El nivel de aceite del auto1 es: " + auto1.getNivelAceite());

        auto1.setNivelAceite(500);
        System.out.println("El número de serie del auto1 es: " + auto1.getNroDeSerie());
        System.out.println("El nivel de aceite del auto1 es: " + auto1.getNivelAceite());

        System.out.println("El número de serie del auto2 es: " + auto2.getNroDeSerie());
        System.out.println("El nivel de aceite del auto2 es: " + auto2.getNivelAceite());

        System.out.println("El número de serie de la clase Auto es: " + Auto.nroDeSerieActual);
        System.out.println("El número de serie de la clase Auto es: " + auto1.nroDeSerieActual);
        System.out.println("El número de serie de la clase Auto es: " + auto2.nroDeSerieActual);

        auto1.andar();
    }
}
