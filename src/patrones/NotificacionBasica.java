/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrones;

/**
 *
 * @author danie
 */
public class NotificacionBasica implements Notificacion {

    public NotificacionBasica() {
    }

    @Override
    public void enviarNotificacion() {
        System.out.println("Notificacion enviada por SMS y  correo.");
    }
    
}
