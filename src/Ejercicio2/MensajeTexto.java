package Ejercicio2;

import javax.swing.*;

public class MensajeTexto extends NotificacionBase {
    private String numeroDestino;

    public MensajeTexto(String numeroDestino, String mensaje) {
        super(mensaje);
        this.numeroDestino = numeroDestino;
    }

    @Override
    public void enviar() {

        JOptionPane.showMessageDialog(null,"Enviando mensaje de texto a " + numeroDestino + ": " + mensaje);
    }
}
