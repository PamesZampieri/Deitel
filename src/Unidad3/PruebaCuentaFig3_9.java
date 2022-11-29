package Unidad3;

import java.util.Scanner;

public class PruebaCuentaFig3_9 {
    public static void main(String[] args) {
        CuentaFig3_8 cuenta1 = new CuentaFig3_8("Jane Green", 50.00);
        CuentaFig3_8 cuenta2 = new CuentaFig3_8("John Blue", -7.53);

        mostrarCuenta(cuenta1);
        mostrarCuenta(cuenta2);

        Scanner entrada = new Scanner(System.in);
        System.out.print("Escriba el monto a depositar para cuenta1: ");
        double montoDeposito = entrada.nextDouble();

        System.out.printf("%nsumando %.2f al saldo de cuenta1%n%n", montoDeposito);
        cuenta1.depositar(montoDeposito);

        mostrarCuenta(cuenta1);
        mostrarCuenta(cuenta2);

        System.out.print("Escriba el monto a depositar para cuenta2: ");
        montoDeposito = entrada.nextDouble();

        System.out.printf("%nsumando %.2f al saldo de cuenta2%n%n", montoDeposito);
        cuenta2.depositar(montoDeposito);

        mostrarCuenta(cuenta1);
        mostrarCuenta(cuenta2);

        System.out.print("Escriba el monto a retirar para cuenta1: ");
        double montoRetiro = entrada.nextDouble();

        System.out.printf("%nrestando %.2f al saldo de cuenta1%n%n", montoRetiro);
        cuenta1.retirar(montoRetiro);

        mostrarCuenta(cuenta1);
        mostrarCuenta(cuenta2);

        System.out.print("Escriba el monto a retirar para cuenta2: ");
        montoRetiro = entrada.nextDouble();

        System.out.printf("%nrestando %.2f al saldo de cuenta2%n%n", montoRetiro);
        cuenta2.retirar(montoRetiro);

        mostrarCuenta(cuenta1);
        mostrarCuenta(cuenta2);
    }

    public static void mostrarCuenta(CuentaFig3_8 cuentaAMostrar) {
        System.out.printf("Saldo de %s: $%.2f%n%n", cuentaAMostrar.getNombre(), cuentaAMostrar.getSaldo());
    }
}
