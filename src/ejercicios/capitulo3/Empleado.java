/*
3.13 (La clase Empleado) Cree una clase llamada Empleado, que incluya tres variables de instancia: un primer
nombre (tipo String), un apellido paterno (tipo String) y un salario mensual (double). Su clase debe tener un constructor
que inicialice las tres variables de instancia. Proporcione un método establecer y un método obtener para cada
variable de instancia. Si el salario mensual no es positivo, no establezca su valor. Escriba una aplicación de prueba
llamada PruebaEmpleado, que demuestre las capacidades de la clase Empleado. Cree dos objetos Empleado y muestre el
salario anual de cada objeto. Después, proporcione a cada Empleado un aumento del 10% y muestre el salario anual
de cada Empleado otra vez.
 */

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