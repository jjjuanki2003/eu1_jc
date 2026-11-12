package org.eu1_jc.pedidos.Descuentos;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped 
public class DescuentoExtensionNormal implements DescuentosInterface{

    @Override
    public double realizar(double total) {
        
        return total;

    }

}
