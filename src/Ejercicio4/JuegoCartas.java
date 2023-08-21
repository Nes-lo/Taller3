package Ejercicio4;

import javax.swing.*;

public class JuegoCartas {
    private static Baraja baraja;
    public static void jugarPoker(){
         baraja = new BarajaPoker();
         jugar();

    }
    public static void jugarNaipe(){
        baraja = new BarajaNaipe();
        jugar();
    }
    public static void jugar(){
        baraja.barajar();
        ICarta cartaRepartida = baraja.repartirCarta();
        if (cartaRepartida != null) {
            cartaRepartida.mostrarCarta();
        } else {
            JOptionPane.showMessageDialog(null,"No quedan cartas en la baraja.");
       }
    }
}
