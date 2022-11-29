package ejercicios.capitulo3;

public class Empleado {
    private String nombre;
    private String apellidoPaterno;
    private double salarioMensual;

    public Empleado(String nombre, String apellidoPaterno, double salarioMensual) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;

        if (salarioMensual >= 0) {
            this.salarioMensual = salarioMensual;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public void setSalarioMensual(double salarioMensual) {
        if (salarioMensual >= 0) {
            this.salarioMensual = salarioMensual;
        }
    }

    public double getSalarioAnual() {
        return salarioMensual * 12;
    }

    public void aumentar(double porcentajeAumento) {
        salarioMensual = salarioMensual * (porcentajeAumento + 1);
    }
}
