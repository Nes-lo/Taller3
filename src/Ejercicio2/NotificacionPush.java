package Ejercicio2;

import javax.swing.*;

public class NotificacionPush extends NotificacionBase {
    private String aplicacion;

    public NotificacionPush(String aplicacion, String mensaje) {
        super(mensaje);
        this.aplicacion = aplicacion;
    }

    @Override
    public void enviar() {

        JOptionPane.showMessageDialog(null,"Enviando notificación push a la aplicación " + aplicacion + ": " + mensaje);
    }
}
