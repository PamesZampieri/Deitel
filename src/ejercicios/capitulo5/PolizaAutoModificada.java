/*
5.30 (Clase PolizaAuto modificada) Modifique la clase PolizaAuto de la figura 5.11 para validar los códigos de
estado de dos letras para los estados del noreste. Los códigos son: CT para Connecticut, MA para Massachusetts, ME
para Maine, NH para Nuevo Hampshire, NJ para Nueva Jersey, NY para Nueva York, PA para Pensilvania y VT para
Vermont. En el método establecerEstado de PolizaAuto, use el operador OR lógico (||) (sección 5.9) para crear
una condición compuesta en una instrucción if...else que compare el argumento del método con cada código de
dos letras. Si el código es incorrecto, la parte else de la instrucción if...else debe mostrar un mensaje de error. En
capítulos posteriores aprenderá a usar el manejo de excepciones para indicar que un método recibió un valor que no
es válido
*/

package ejercicios.capitulo5;

public class PolizaAutoModificada {
    private int numeroCuenta;
    private String marcaYmodelo;
    private String estado;

    public PolizaAutoModificada(int numeroCuenta, String marcaYmodelo, String estado) {
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
        if ("CT".equals(estado) || "MA".equals(estado) || "ME".equals(estado) || "NH".equals(estado) ||
                "NJ".equals(estado) || "NY".equals(estado) || "PA".equals(estado) || "VT".equals(estado)) {
            this.estado = estado;
        } else {
            System.out.println("El código ingresado para los estados del noreste de Estados Unidos es incorrecto.");
        }
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