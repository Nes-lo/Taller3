package Ejercicio3;

import javax.swing.*;

public class GestionCuentas {
    private static CuentaCorriente cuentaCorriente;
    private static CuentaAhorro cuentaAhorro;
    public static void gestionarCuentaCorriente(){

       String opcionGestion="";
       do{
           opcionGestion= JOptionPane.showInputDialog("Ingrese la opcion deseada o terminar\n" +
                   "1. Crear Cuenta Ahorros\n" +
                   "2. Depositar\n" +
                   "3. Retirar\n" +
                   "4. Ver Saldo");
           switch (opcionGestion){
               case "1":
                   int saldoInicial=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el saldo de apertura de la cuenta"));
                   int sobreGiro=Integer.parseInt("Ingrese el sobre giro");
                   cuentaCorriente = new CuentaCorriente(saldoInicial, sobreGiro);
                   JOptionPane.showMessageDialog(null,"Cuenta Creada");
                   break;
               case "2":
                   cuentaCorriente.depositar(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del deposito")));
                   break;
               case "3":
                   cuentaCorriente.retirar(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del retiro")));
                   break;
               case "4":
                   JOptionPane.showMessageDialog(null,"Saldo Cuenta Corriente: "+cuentaCorriente.obtenerSaldo());
                   break;

           }
       }while (opcionGestion.equalsIgnoreCase("terminar"));





    }

    public static void gestionarCuentaAhorros(){

    }

}
