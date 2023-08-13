package Ejercicio3;

public class CuentaCorriente extends CuentaBase {
    private double limiteSobregiro;

    public CuentaCorriente(double saldoInicial, double limiteSobregiro) {
        super(saldoInicial);
        this.limiteSobregiro = limiteSobregiro;
    }

    @Override
    public void retirar(double cantidad) {
        if (cantidad > 0 && (saldo + limiteSobregiro) >= cantidad) {
            saldo -= cantidad;
            System.out.println("Retiro de " + cantidad + " realizado. Saldo actual: " + saldo);
        } else {
            System.out.println("No se puede retirar una cantidad negativa o superior al saldo disponible (incluyendo el límite de sobregiro).");
        }
    }
}