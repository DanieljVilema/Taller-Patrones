/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrones;

/**
 *
 * @author danie
 */
public class NotificacionDecorator implements Notificacion {

    private Notificacion wrappee;

    public NotificacionDecorator(Notificacion notificacion) {
        this.wrappee = notificacion;
    }
    
    
    @Override
    public void enviarNotificacion() {
        wrappee.enviarNotificacion();
    }
    
    
    
}
