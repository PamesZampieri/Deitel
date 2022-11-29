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
