package org.eu1_jc.pedidos;

import org.eu1_jc.pedidos.Descuentos.DescuentoExtensionInternalWorker;
import org.eu1_jc.pedidos.Descuentos.DescuentoExtensionNormal;
import org.eu1_jc.pedidos.Descuentos.DescuentoExtensionVIP;
import org.eu1_jc.pedidos.Notificacion.NotificacionExtensionSMS;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain 
public class Main implements QuarkusApplication{


    @Inject 
    PedidoService pedidoService;

    @Inject 
    NotificacionExtensionSMS extensionSMS;

    @Inject 
    DescuentoExtensionInternalWorker descInternalWorker;

    @Inject 
    DescuentoExtensionNormal descNormal;

    @Inject 
    DescuentoExtensionVIP descVIP;
    public static void main(String[] args) {
        
        Quarkus.run(Main.class, args);
    }    

    @Override
    public int run(String... args) throws Exception {
       

        Pedido pedido = new Pedido("P001", "Laptop", 1000.00, ClienteEnum.INTERNAL_WORKER);
        pedidoService.realizar(pedido, this.extensionSMS, this.descInternalWorker);
        

        Pedido pedido2 = new Pedido("P002", "Mouse",  100.00, ClienteEnum.NORMAL);
        pedidoService.realizar(pedido2, extensionSMS, this.descNormal);

        Pedido pedido3 = new Pedido("POO3","Teclado", 200.00, ClienteEnum.VIP);
        pedidoService.realizar(pedido3, extensionSMS, this.descVIP);

        System.out.println("17221-jc");

        return 0;
    }

    
}
