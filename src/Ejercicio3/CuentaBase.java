package Ejercicio3;

import javax.swing.*;

public abstract class CuentaBase implements CuentaBancaria {
    protected double saldo;

    public CuentaBase(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    @Override
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            JOptionPane.showMessageDialog(null,"Depósito de " + cantidad + " realizado. Saldo actual: " + saldo);

        } else {
            JOptionPane.showMessageDialog(null,"No se puede depositar una cantidad negativa.");

        }
    }

    @Override
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            JOptionPane.showMessageDialog(null,"Retiro de " + cantidad + " realizado. Saldo actual: " + saldo);
                    } else {
            JOptionPane.showMessageDialog(null,"No se puede retirar una cantidad negativa o superior al saldo.");

        }
    }

    @Override
    public double obtenerSaldo() {
        return saldo;
    }

}