/*
3.11 (Clase Cuenta modificada) Modifique la clase Cuenta (figura 3.8) para proporcionar un método llamado
retirar, que retire dinero de un objeto Cuenta. Asegúrese de que el monto a retirar no exceda el saldo de Cuenta. Si
lo hace, el saldo debe permanecer sin cambio y el método debe imprimir un mensaje que indique “El monto a retirar excede
el saldo de la cuenta”. Modifique la clase PruebaCuenta (figura 3.9) para probar el método retirar.
 */

package Unidad3;

public class CuentaFig3_8 {
    private String nombre;
    private double saldo;

    public CuentaFig3_8(String nombre, double saldo) {
        this.nombre = nombre;

        if (saldo > 0.0) {
            this.saldo = saldo;
        }
    }

    public void depositar(double montoDeposito) {
        if (montoDeposito > 0.0) {
            saldo = saldo + montoDeposito;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void retirar(double montoRetiro) {
        if (montoRetiro > saldo) {
            System.out.println("El monto a retirar excede el saldo de la cuenta");
        }
        if (montoRetiro <= saldo) {
            saldo = saldo - montoRetiro;
        }
    }
}