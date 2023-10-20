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

public class PruebaEmpleado {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Pamela", "Zampieri", 50000);
        Empleado empleado2 = new Empleado("Mauro", "Bastasini", 60000);

        System.out.printf("El salario anual para el siguiente empleado%n%s %s%nes: $%.2f", empleado1.getApellidoPaterno(),
                empleado1.getNombre(), empleado1.getSalarioAnual());
        System.out.println();

        System.out.printf("%nEl salario anual para el siguiente empleado%n%s %s%nes: $%.2f", empleado2.getApellidoPaterno(),
                empleado2.getNombre(), empleado2.getSalarioAnual());
        System.out.println();

        empleado1.aumentar(0.1);
        empleado2.aumentar(0.1);

        System.out.printf("%nEl salario anual para el siguiente empleado%n%s %s%ncon el aumento es de: %n$%.2f%n",
                empleado1.getApellidoPaterno(), empleado1.getNombre(),empleado1.getSalarioAnual());
        System.out.println();

        System.out.printf("%nEl salario anual para el siguiente empleado%n%s %s%ncon el aumento es de: %n$%.2f%n",
                empleado2.getApellidoPaterno(), empleado2.getNombre(), empleado2.getSalarioAnual());
        System.out.println();
    }
}