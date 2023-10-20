/*
3.11 (Clase Cuenta modificada) Modifique la clase Cuenta (figura 3.8) para proporcionar un método llamado
retirar, que retire dinero de un objeto Cuenta. Asegúrese de que el monto a retirar no exceda el saldo de Cuenta. Si
lo hace, el saldo debe permanecer sin cambio y el método debe imprimir un mensaje que indique “El monto a retirar excede
el saldo de la cuenta”. Modifique la clase PruebaCuenta (figura 3.9) para probar el método retirar.

3.15 (Eliminar código duplicado en el método main) En la clase PruebaCuenta de la figura 3.9, el método main
contiene seis instrucciones (líneas 13-14, 15-16, 28-29, 30-31, 40-41 y 42-43), cada una de las cuales muestra en
pantalla el nombre y saldo de un objeto Cuenta. Estudie estas instrucciones y notará que difieren sólo en el objeto
Cuenta que se está manipulando: cuenta1 o cuenta2. En este ejercicio definirá un nuevo método mostrarCuenta que
contiene una copia de esa instrucción de salida. El parámetro del método será un objeto Cuenta y el método imprimirá en
pantalla el nombre y saldo de ese objeto. Después usted sustituirá las seis instrucciones duplicadas en main con
llamadas a mostrarCuenta, pasando como argumento el objeto Cuenta específico a mostrar en pantalla.
Modifique la clase PruebaCuenta de la figura 3.9 para declarar el siguiente método mostrarCuenta después de
la llave derecha de cierre de main y antes de la llave derecha de cierre de la clase PruebaCuenta:
public static void mostrarCuenta(Cuenta cuentaAMostrar)
{
// coloque aquí la instrucción que muestra en pantalla
 // el nombre y el saldo de cuentaAMostrar
}
Sustituya el comentario en el cuerpo del método con una instrucción que muestre el nombre y el saldo de
cuentaAMostrar.
Recuerde que main es un método static, por lo que puede llamarse sin tener que crear primero un objeto de
la clase en la que se declara main. También declaramos el método mostrarCuenta como un método static. Cuando
main necesita llamar a otro método en la misma clase sin tener que crear primero un objeto de esa clase, el otro método
también debe declararse como static.
Una vez que complete la declaración de mostrarCuenta, modifique main para reemplazar las instrucciones que
muestran el nombre y saldo de cada Cuenta con llamadas a mostrarCuenta; cada una debe recibir como argumento el
objeto cuenta1 o cuenta2, según sea apropiado. Luego, pruebe la clase PruebaCuenta actualizada para asegurarse de
que produzca la misma salida que se muestra en la figura 3.9.
 */

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