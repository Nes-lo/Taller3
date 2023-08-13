package Ejercicio2;

import javax.swing.*;

public class CorreoElectronico extends NotificacionBase {
    private String destinatario;

    public CorreoElectronico(String destinatario, String mensaje) {
        super(mensaje);
        this.destinatario = destinatario;
    }

    @Override
    public void enviar() {
        JOptionPane.showMessageDialog(null,"Enviando correo a " + destinatario + ": " + mensaje);
    }
}