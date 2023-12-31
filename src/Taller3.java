import Ejercicio1.Figura;
import Ejercicio2.CorreoElectronico;
import Ejercicio2.MensajeTexto;
import Ejercicio2.Notificacion;
import Ejercicio2.NotificacionPush;
import Ejercicio3.CuentaAhorro;
import Ejercicio3.CuentaCorriente;
import Ejercicio3.GestionCuentas;
import Ejercicio4.JuegoCartas;

import javax.swing.*;
import java.util.Optional;

public class Taller3 {


    public static void main(String[] args) {
        String opcion="";
        do{

            opcion= JOptionPane.showInputDialog("Ingrese la opcion deseada o 0 para terminar"+listaMenu());
            menuPrincipal(opcion);


        }while (!opcion.equals("0"));
    }

    private static void menuPrincipal(String opcion){

        switch (opcion){
            case "1":
                Figura.SelectorFigura();
             break;
            case "2":
                Notificacion correo = new CorreoElectronico("destinatario@correo.com", "Hola desde el sistema de notificaciones email");
                correo.enviar();

                Notificacion mensaje = new MensajeTexto("+5734567890", "Hola desde el sistema de notificaciones Mensajes");
                mensaje.enviar();

                Notificacion push = new NotificacionPush("Aplicacion", "Hola desde el sistema de notificaciones Push");
                push.enviar();

              break;

            case "3":
                String opcionC="";


                do{
                    opcionC=JOptionPane.showInputDialog("Ingrese la opcion del tipo de cuenta a gestionar\n" +
                            "1. Cuenta de Cuenta Corriente.\n" +
                            "2. Cuenta de Ahorros.");
                    switch (opcionC){
                        case "1":
                            GestionCuentas.gestionarCuentaCorriente();
                            break;
                        case "2":
                            GestionCuentas.gestionarCuentaAhorros();
                            break;

                    }

                }while (!opcionC.equals("terminar"));

                break;
            case "4":
                String opcionJ="";
                do{
                    opcionJ=JOptionPane.showInputDialog("Ingrese la opcion del tipo de juego de cartas\n" +
                            "1. Poker.\n" +
                            "2. Naipe Español.");
                    switch (opcionJ){
                        case "1":
                            JuegoCartas.jugarPoker();
                            break;
                        case "2":
                            JuegoCartas.jugarNaipe();
                            break;
                    }
                }while (!opcionJ.equals("terminar"));

                break;


            default:

        }
    }

    private static String listaMenu(){
        return "\n1. Figuras Geometricas" +
               "\n2. Sistema de Notificaciones" +
               "\n3. Cuentas de Bancos"+
               "\n4. Juego de Cartas";
    }

}
