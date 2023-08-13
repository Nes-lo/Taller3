package Ejercicio3;

public abstract class CuentaBase implements CuentaBancaria {
    protected double saldo;

    public CuentaBase(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    @Override
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito de " + cantidad + " realizado. Saldo actual: " + saldo);
        } else {
            System.out.println("No se puede depositar una cantidad negativa.");
        }
    }

    @Override
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro de " + cantidad + " realizado. Saldo actual: " + saldo);
        } else {
            System.out.println("No se puede retirar una cantidad negativa o superior al saldo.");
        }
    }

    @Override
    public double obtenerSaldo() {
        return saldo;
    }

}