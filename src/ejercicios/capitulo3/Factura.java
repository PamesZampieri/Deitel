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


