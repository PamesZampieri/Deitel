package Unidad5;

public class PruebaPolizaAuto {
    public static void main(String[] args) {

        PolizaAuto polizaAuto1 = new PolizaAuto(11111111, "Toyota Camry", "NJ");
        PolizaAuto polizaAuto2 = new PolizaAuto(22222222, "Ford Fusion", "ME");

        polizaEnEstadoSinCulpa(polizaAuto1);
        polizaEnEstadoSinCulpa(polizaAuto2);
    }

    public static void polizaEnEstadoSinCulpa(PolizaAuto poliza) {
        System.out.println("La poliza de auto: ");
        System.out.printf("Cuenta #: %d; Auto %s;%nEstado %s %s un estado sin culpa%n%n", poliza.getNumeroCuenta(),
                poliza.getMarcaYmodelo(), poliza.getEstado(), (poliza.esEstadoSinCulpa() ? "esta en" : "no esta en"));
    }
}
