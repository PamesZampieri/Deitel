package Unidad5;

public class PolizaAuto {
    private int numeroCuenta;
    private String marcaYmodelo;
    private String estado;

    public PolizaAuto(int numeroCuenta, String marcaYmodelo, String estado) {
        this.numeroCuenta = numeroCuenta;
        this.marcaYmodelo = marcaYmodelo;
        this.estado = estado;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setMarcaYmodelo(String marcaYmodelo) {
        this.marcaYmodelo = marcaYmodelo;
    }

    public String getMarcaYmodelo() {
        return marcaYmodelo;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public boolean esEstadoSinCulpa() {
        boolean estadoSinCulpa;

        switch (getEstado()) {
            case "MA":
            case "NJ":
            case "NY":
            case "PA":
                estadoSinCulpa = true;
                break;
            default:
                estadoSinCulpa = false;
                break;
        }

        return estadoSinCulpa;
    }
}