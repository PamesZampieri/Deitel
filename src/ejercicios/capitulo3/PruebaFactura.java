/*
3.12 (La clase Factura) Cree una clase llamada Factura que una ferretería podría utilizar para representar una
factura para un artículo vendido en la tienda. Una Factura debe incluir cuatro piezas de información como variables
de instancia: un número de pieza (tipo String), la descripción de la pieza (tipo String), la cantidad de artículos de ese
tipo que se van a comprar (tipo int) y el precio por artículo (double). Su clase debe tener un constructor que inicialice
las cuatro variables de instancia. Proporcione un método establecer y un método obtener para cada variable de
instancia. Además, proporcione un método llamado obtenerMontoFactura, que calcule el monto de la factura (es
decir, que multiplique la cantidad de artículos por el precio de cada uno) y después devuelva ese monto como un valor
double. Si la cantidad no es positiva, debe establecerse en 0. Si el precio por artículo no es positivo, debe establecerse
en 0.0. Escriba una aplicación de prueba llamada PruebaFactura, que demuestre las capacidades de la clase Factura.
 */

package ejercicios.capitulo3;

public class PruebaFactura {
    public static void main(String[] args) {
        Factura factura1 = new Factura("Nmero de pieza 1", "Clavo", 10,
                10.00);
        Factura factura2 = new Factura("Numero de pieza 2", "Martillo", -1,
                50.00);
        Factura factura3 = new Factura("Numero de pieza 3", "Tuerca", 20,
                -10.00);


        System.out.printf("Para los siguientes articulos: %n%s%n%s%nCantidad:  %s%nPrecio: $%.2f%nEl monto total a pagar" +
                        " de la factura es: $%.2f%n",
                factura1.getNumeroDePieza(), factura1.getDescripcionDeLaPieza(), factura1.getCantidadDeArticulos(),
                factura1.getPrecioPorArticulo(), factura1.getCalcularMonto());
        System.out.println();

        System.out.printf("Para los siguientes articulos: %n%s%n%s%nCantidad:  %s%nPrecio: $%.2f%nEl monto total a pagar" +
                        " de la factura es: $%.2f%n",
                factura2.getNumeroDePieza(), factura2.getDescripcionDeLaPieza(), factura2.getCantidadDeArticulos(),
                factura2.getPrecioPorArticulo(), factura2.getCalcularMonto());
        System.out.println();

        System.out.printf("Para los siguientes articulos: %n%s%n%s%nCantidad:  %s%nPrecio: $%.2f%nEl monto total a pagar " +
                        "de la factura es: $%.2f%n",
                factura3.getNumeroDePieza(), factura3.getDescripcionDeLaPieza(), factura3.getCantidadDeArticulos(),
                factura3.getPrecioPorArticulo(), factura3.getCalcularMonto());
    }
}