/*
5.33 (Crecimiento de la base de usuarios de Facebook) De acuerdo con CNNMoney.com, Facebook llegó a los
mil millones de usuarios en octubre de 2012. Use la técnica del cálculo del crecimiento compuesto que aprendió en la
figura 5.6 y, suponiendo que su base de usuarios crezca con una tasa del 4% mensual, ¿cuántos meses tardará
Facebook en aumentar su base de usuarios a mil quinientos millones? ¿Cuántos meses tardará Facebook en aumentar su base
de usuarios a dos mil millones?
 */

package ejercicios.capitulo5;

public class CrecimientoDeUsuariosFacebook {
    public static void main(String[] args) {
        long usuarios = 1000000000;
        long cantidadDeUsuarios;
        int cantidadDeMeses = 24;
        double tasaMensual = 0.04;
        boolean encontrado1 = false;
        boolean encontrado2 = false;
        int mes1 = 0;
        int mes2 = 0;

        System.out.printf("%s%50s%n", "Mes", "Crecimiento de la base de usuarios de Facebook");

        for (int i = 1; i <= cantidadDeMeses; i++) {
            cantidadDeUsuarios = (long) (usuarios * Math.pow(1.0 + tasaMensual, i));
            System.out.printf("%3d%,50d%n", i, cantidadDeUsuarios);

            if (cantidadDeUsuarios >= 1500000000 && !encontrado1) {
                mes1 = i;
                encontrado1 = true;
            }

            if (cantidadDeUsuarios >= 2000000000 && !encontrado2) {
                mes2 = i;
                encontrado2 = true;
            }
        }
        System.out.println();

        System.out.printf("Facebook tardará %d meses en aumentar su base de usuarios a 1,500,000,000.%n", mes1);
        System.out.printf("Facebook tardará %d meses en aumentar su base de usuarios a 2,000,000,000.", mes2);
    }
}
