package Ejercicio4;

import java.util.Arrays;
import java.util.List;


public class BarajaPoker extends Baraja{
    private List<ICarta> cartas;

    public BarajaPoker(List<String> palos, List<String> numeros,int inicial) {
        super(palos, numeros,inicial);
    }

    public BarajaPoker() {
        this(Arrays.asList("Corazones", "Diamantes", "Treboles", "Picas"),
                Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"),2);
    }
}
