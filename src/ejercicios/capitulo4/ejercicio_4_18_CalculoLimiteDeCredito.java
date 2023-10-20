/*
4.18 (Calculadora de límite de crédito) Desarrolle una aplicación en Java que determine si alguno de los clientes
de una tienda de departamentos se ha excedido del límite de crédito en una cuenta. Para cada cliente se tienen los
siguientes datos:
a) el número de cuenta.
b) el saldo al inicio del mes.
c) el total de todos los artículos cargados por el cliente en el mes.
d) el total de todos los créditos aplicados a la cuenta del cliente en el mes.
e) el límite de crédito permitido.
El programa debe recibir como entrada cada uno de estos datos en forma de números enteros, debe calcular el nuevo
saldo (= saldo inicial + cargos – créditos), mostrar el nuevo saldo y determinar si éste excede el límite de crédito del
cliente. Para los clientes cuyo límite de crédito sea excedido, el programa debe mostrar el mensaje “Se excedio el
limite de su credito”.
 */

package ejercicios.capitulo4;

import java.util.Scanner;

public class ejercicio_4_18_CalculoLimiteDeCredito {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escriba su Número de Cuenta o (-1) para terminar: ");
        int numeroCuenta = entrada.nextInt();

        if (numeroCuenta != -1) {
            System.out.print("Escriba su Saldo Inicial: ");
            int saldoInicial = entrada.nextInt();
            System.out.print("Escriba el Total de sus artículos cargados en el mes actual: ");
            int cargos = entrada.nextInt();
            System.out.print("Escriba el Total de todos los créditos aplicados a su cuenta: ");
            int creditos = entrada.nextInt();

            int saldoFinal;

            while (numeroCuenta != -1) {
                saldoFinal = saldoInicial + cargos - creditos;
                System.out.printf("El Saldo final de su cuenta número %d es: %d%n", numeroCuenta, saldoFinal);

                if (saldoFinal > 100000) {
                    System.out.printf("Excedió el límite de crédito para su cuenta número %d.%n", numeroCuenta);
                }

                System.out.println();
                System.out.print("Escriba su Número de Cuenta o (-1) para terminar: ");
                numeroCuenta = entrada.nextInt();

                if (numeroCuenta != -1) {
                    System.out.print("Escriba su Saldo Inicial: ");
                    saldoInicial = entrada.nextInt();
                    System.out.print("Escriba el Total de sus artículos cargados en el mes actual: ");
                    cargos = entrada.nextInt();
                    System.out.print("Escriba el Total de todos los créditos aplicados a su cuenta: ");
                    creditos = entrada.nextInt();
                }
            }
        }
    }
}