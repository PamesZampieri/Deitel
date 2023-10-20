/*
3.14 (La clase Fecha) Cree una clase llamada Fecha, que incluya tres variables de instancia: un mes (tipo int), un
día (tipo int) y un año (tipo int). Su clase debe tener un constructor que inicialice las tres variables de instancia, y
debe asumir que los valores que se proporcionan son correctos. Proporcione un método establecer y un método obtener para
cada variable de instancia. Proporcione un método mostrarFecha, que muestre el mes, día y año, separados
por barras diagonales (/). Escriba una aplicación de prueba llamada PruebaFecha, que demuestre las capacidades de
la clase Fecha.
 */

package ejercicios.capitulo3;

public class Fecha {
    private int day;
    private int month;
    private int year;

    public Fecha(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void mostrarFecha() {
        System.out.printf("%d/%d/%d", day, month, year);
    }
}