/*
3.14 (La clase Fecha) Cree una clase llamada Fecha, que incluya tres variables de instancia: un mes (tipo int), un
día (tipo int) y un año (tipo int). Su clase debe tener un constructor que inicialice las tres variables de instancia, y
debe asumir que los valores que se proporcionan son correctos. Proporcione un método establecer y un método obtener para
cada variable de instancia. Proporcione un método mostrarFecha, que muestre el mes, día y año, separados
por barras diagonales (/). Escriba una aplicación de prueba llamada PruebaFecha, que demuestre las capacidades de
la clase Fecha.
 */

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