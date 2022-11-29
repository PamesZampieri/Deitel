package ejercicios.capitulo3;

public class PruebaFecha {
    public static void main(String[] args) {
        Fecha fecha1 = new Fecha(12, 12, 2021);

        System.out.printf("El día de la fecha1 es: %s%n", fecha1.getDay());
        System.out.printf("El mes de la fecha1 es: %s%n", fecha1.getMonth());
        System.out.printf("El año de la fecha1 es: %s%n", fecha1.getYear());

        fecha1.setDay(14);
        fecha1.setMonth(2);
        fecha1.setYear(2022);
        System.out.println();

        fecha1.mostrarFecha();
        System.out.println();
    }
}
