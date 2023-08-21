package Ejercicio4;

import javax.swing.*;

public abstract class CartaBase implements ICarta {

    protected String palo;
    protected String numero;
    protected int valor;

    public CartaBase(String palo,String numero, int valor) {
        this.palo = palo;
        this.valor = valor;
        this.numero=numero;
    }

    public void mostrarCarta() {
        JOptionPane.showMessageDialog(null,numero + " de " + palo);
    }

    public int valorNumerico(){
        return valor;
    }
}
