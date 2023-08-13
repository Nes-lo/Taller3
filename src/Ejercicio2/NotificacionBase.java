package Ejercicio2;

public abstract class NotificacionBase implements Notificacion {
    protected String mensaje;

    public NotificacionBase(String mensaje) {
        this.mensaje = mensaje;
    }
}