package Ejercicio4;


import java.util.List;


public class Carta extends CartaBase{
    private List<ICarta> cartas;
    public Carta(String palo, String numero, int valor) {
        super(palo,numero, valor);
    }
    public int valorNumerico() {
        return this.valor;
    }

}
