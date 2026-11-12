package org.eu1_jc.pedidos.Descuentos;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped 
public class DescuentoExtensionVIP implements DescuentosInterface{

    @Override
    public double realizar(double total) {
       
        return total*0.8;
    }
    

    

}
