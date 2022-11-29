package ejercicios.capitulo3;

public class PruebaFactura {
    public static void main(String[] args) {
        Factura factura1 = new Factura("Nmero de pieza 1", "Clavo", 10,
                10.00);
        Factura factura2 = new Factura("Numero de pieza 2", "Martillo", -1,
                50.00);
        Factura factura3 = new Factura("Numero de pieza 3", "Tuerca", 20,
                -10.00);


        System.out.printf("Para los siguientes articulos: %n%s%n%s%nCantidad:  %s%nPrecio: $%.2f%nEl monto total a pagar de la factura es: $%.2f%n",
                factura1.getNumeroDePieza(), factura1.getDescripcionDeLaPieza(), factura1.getCantidadDeArticulos(),
                factura1.getPrecioPorArticulo(), factura1.getCalcularMonto());
        System.out.println();

        System.out.printf("Para los siguientes articulos: %n%s%n%s%nCantidad:  %s%nPrecio: $%.2f%nEl monto total a pagar de la factura es: $%.2f%n",
                factura2.getNumeroDePieza(), factura2.getDescripcionDeLaPieza(), factura2.getCantidadDeArticulos(),
                factura2.getPrecioPorArticulo(), factura2.getCalcularMonto());
        System.out.println();

        System.out.printf("Para los siguientes articulos: %n%s%n%s%nCantidad:  %s%nPrecio: $%.2f%nEl monto total a pagar de la factura es: $%.2f%n",
                factura3.getNumeroDePieza(), factura3.getDescripcionDeLaPieza(), factura3.getCantidadDeArticulos(),
                factura3.getPrecioPorArticulo(), factura3.getCalcularMonto());
    }
}
