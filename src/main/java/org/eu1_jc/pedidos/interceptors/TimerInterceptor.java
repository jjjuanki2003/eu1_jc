package org.eu1_jc.pedidos.interceptors;

import org.eu1_jc.pedidos.Pedido;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Interceptor 
@Timer 
@Priority(Interceptor.Priority.APPLICATION)
public class TimerInterceptor {

    @AroundInvoke 
    public Object intercept(InvocationContext context) throws Exception {
        long tiempoInicio = System.currentTimeMillis();
        
        Object resultado =  context.proceed();
        
        long tiempoFinal = System.currentTimeMillis();

        Object[] values = context.getParameters();

        Pedido pedido = (Pedido) values[0];

        System.out.println("DURACION: " + pedido.getCodigo() + "|MS: " + (tiempoFinal - tiempoInicio));
        System.out.println("TIEMPO: " + pedido.getCodigo()+"|OK");

        return resultado;
        
    }
}
