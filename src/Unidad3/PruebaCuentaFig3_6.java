package Unidad3;

public class PruebaCuentaFig3_6 {
    public static void main(String[] args){
        CuentaFig3_5 cuenta1 = new CuentaFig3_5("Jane Green");
        CuentaFig3_5 cuenta2 = new CuentaFig3_5("John Blue");

        System.out.printf("El nombre de cuenta1 es: %s%n", cuenta1.getNombre());
        System.out.printf("El nombre de cuenta2 es: %s%n", cuenta2.getNombre());
    }
}