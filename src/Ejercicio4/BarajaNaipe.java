package Ejercicio4;

import java.util.Arrays;
import java.util.List;

public class BarajaNaipe extends Baraja{

    private List<ICarta> cartas;

    public BarajaNaipe(List<String> palos, List<String> numeros,int inicial) {
        super(palos, numeros,inicial);
    }

    public BarajaNaipe() {
        this(Arrays.asList("Oros", "Copas", "Espadas", "Bastos"),
                Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"),1);
    }
}
