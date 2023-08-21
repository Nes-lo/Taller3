package Ejercicio4;

import java.util.List;

public class CartaNaipe extends CartaBase{

    public CartaNaipe(String palo,String numero, int valor) {
        super(palo,numero, valor);
    }
    public int valorNumerico() {
        return this.valor;
    }
}
