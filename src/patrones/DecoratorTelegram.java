/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrones;

/**
 *
 * @author danie
 */
public class DecoratorTelegram extends NotificacionDecorator{
    
    public DecoratorTelegram(Notificacion notificacion) {
        super(notificacion);
    }

    @Override
    public void enviarNotificacion() {
        super.enviarNotificacion();
        System.out.println("Enviada por Telegram");
    }
    
    
    
}
