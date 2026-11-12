package org.eu1_jc.pedidos.Notificacion;

import org.eu1_jc.pedidos.Pedido;

public interface NotificacionExtension {

    void notificar(String codigo, Pedido pedido);
}
