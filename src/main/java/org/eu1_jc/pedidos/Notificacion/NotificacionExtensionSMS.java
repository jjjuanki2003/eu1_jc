package org.eu1_jc.pedidos.Notificacion;

import org.eu1_jc.pedidos.Pedido;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped 
public class NotificacionExtensionSMS implements NotificacionExtension{

    
    @Override
    public void notificar(String codigo, Pedido pedido) {
        
        System.out.println("NOTIFICACION: " + pedido.getCodigo() + "|OK");
    }

    
}
