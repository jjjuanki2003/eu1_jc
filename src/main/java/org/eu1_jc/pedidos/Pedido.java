package org.eu1_jc.pedidos;

public class Pedido {

    private String codigo;
    private String producto;
    private double valorOriginal;
    private ClienteEnum cliente;

    
    public Pedido(String codigo, String producto, double valorOriginal, ClienteEnum cliente) {
    
        this.codigo = codigo;
        this.producto = producto;
        this.valorOriginal = valorOriginal;
        this.cliente = cliente;

    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getProducto() {
        return producto;
    }
    public void setProducto(String producto) {
        this.producto = producto;
    }
    public double getValorOriginal() {
        return valorOriginal;
    }
    public void setValorOriginal(double valorOriginal) {
        this.valorOriginal = valorOriginal;
    }
    public ClienteEnum getCliente() {
        return cliente;
    }
    public void setCliente(ClienteEnum cliente) {
        this.cliente = cliente;
    }

    

    

}
