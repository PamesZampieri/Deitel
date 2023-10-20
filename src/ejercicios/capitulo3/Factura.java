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

public class Factura {
    private String numeroDePieza;
    private String descripcionDeLaPieza;
    private int cantidadDeArticulos;
    private double precioPorArticulo;

    public Factura(String numeroDePieza, String descripcionDeLaPieza, int cantidadDeArticulos, double precioPorArticulo) {
        this.numeroDePieza = numeroDePieza;
        this.descripcionDeLaPieza = descripcionDeLaPieza;

        this.cantidadDeArticulos = cantidadDeArticulos;
        if (cantidadDeArticulos < 0) {
            this.cantidadDeArticulos = 0;
        }

        this.precioPorArticulo = precioPorArticulo;
        if (precioPorArticulo < 0) {
            this.precioPorArticulo = 0.0;
        }
    }

    public String getNumeroDePieza() {
        return numeroDePieza;
    }

    public String getDescripcionDeLaPieza() {
        return descripcionDeLaPieza;
    }

    public int getCantidadDeArticulos() {
        return cantidadDeArticulos;
    }

    public double getPrecioPorArticulo() {
        return precioPorArticulo;
    }

    public void setNumeroDePieza(String numeroDePieza) {
        this.numeroDePieza = numeroDePieza;
    }

    public void setDescripcionDeLaPieza(String descripcionDeLaPieza) {
        this.descripcionDeLaPieza = descripcionDeLaPieza;
    }

    public void setCantidadDeArticulos(int cantidadDeArticulos) {
        if (cantidadDeArticulos >= 0) {
            this.cantidadDeArticulos = cantidadDeArticulos;
        }
        if (cantidadDeArticulos < 0) {
            this.cantidadDeArticulos = 0;
        }
    }

    public void setPrecioPorArticulo(double precioPorArticulo) {
        if (precioPorArticulo >= 0) {
            this.precioPorArticulo = precioPorArticulo;
        }
        if (precioPorArticulo < 0) {
            this.precioPorArticulo = 0.0;
        }
    }

    public double getCalcularMonto() {
        return cantidadDeArticulos * precioPorArticulo;
    }

    /*
    Si se quisieran ignorar valores negativos, los setters serían así:
    public void setCantidadDeArticulos(int cantidadDeArticulos) {
        if (cantidadDeArticulos >= 0) {
            this.cantidadDeArticulos = cantidadDeArticulos;
        }
    }
     */
}