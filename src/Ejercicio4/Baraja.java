package Ejercicio4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Baraja {

    private List<ICarta> cartas;

    public Baraja(List<String> palos, List<String> numeros,int inicial) {
        cartas = new ArrayList<>();
        inicializarBaraja(palos,numeros,inicial);
    }

    private void inicializarBaraja(List<String> palos, List<String> numeros,int inicial) {
        palos.forEach(palo -> {
            AtomicInteger counter = new AtomicInteger(inicial);
            numeros.forEach(numero -> cartas.add(new Carta(palo, numero, counter.getAndIncrement())));
        });
    }

    public void mostrarBaraja() {
        cartas.forEach(ICarta::mostrarCarta);
    }

    public void barajar() {
        Collections.shuffle(cartas);
    }

    public ICarta repartirCarta() {
        if (!cartas.isEmpty()) {
            return cartas.remove(0);
        }
        return null;
    }
}
