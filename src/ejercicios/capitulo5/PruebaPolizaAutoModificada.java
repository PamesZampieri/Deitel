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

public class PruebaPolizaAutoModificada {
    public static void main(String[] args) {
        PolizaAutoModificada polizaAuto = new PolizaAutoModificada(11111111, "Toyota Camry",
                "NJ");

        imprimirPoliza(polizaAuto);

        polizaAuto.setEstado("Argentina");

        imprimirPoliza(polizaAuto);
    }

    public static void imprimirPoliza(PolizaAutoModificada poliza) {
        System.out.println("La poliza de auto: ");
        System.out.printf("Cuenta #: %d;%nAuto %s;%nEstado %s %s un estado sin culpa%n%n", poliza.getNumeroCuenta(),
                poliza.getMarcaYmodelo(), poliza.getEstado(),
                poliza.esEstadoSinCulpa() ? "esta en" : "no esta en");
    }
}