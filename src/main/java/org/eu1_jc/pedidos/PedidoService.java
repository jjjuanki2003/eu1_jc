package org.eu1_jc.pedidos;

import org.eu1_jc.pedidos.Descuentos.DescuentosInterface;
import org.eu1_jc.pedidos.Notificacion.NotificacionExtension;
import org.eu1_jc.pedidos.interceptors.Timer;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped 
public class PedidoService {


    @Timer 
    public void realizar(Pedido pedido, NotificacionExtension notificacionExtension, DescuentosInterface descuentosInterface ) {

        System.out.println("PEDIDO: " + pedido.getCodigo() + "|TOTAL: " + descuentosInterface.realizar(pedido.getValorOriginal()));
    
        notificacionExtension.notificar(pedido.getCodigo(), pedido);
    }
}
