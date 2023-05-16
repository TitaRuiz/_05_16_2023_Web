package com.hedima.web.modelo;

public class Pedido {

    private int idPedido;
    private int idCliente;
    private String fPago;
    private String dEntrega;

    @Override
    public String toString() {
        return "Pedido{" +
                "idPedido=" + idPedido +
                ", idCliente=" + idCliente +
                ", fPago='" + fPago + '\'' +
                ", dEntrega='" + dEntrega + '\'' +
                '}';
    }

    public Pedido(){}

    public Pedido(int idPedido, int idCliente, String fPago, String dEntrega) {
        this.idPedido = idPedido;
        this.idCliente = idCliente;
        this.fPago = fPago;
        this.dEntrega = dEntrega;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getfPago() {
        return fPago;
    }

    public void setfPago(String fPago) {
        this.fPago = fPago;
    }

    public String getdEntrega() {
        return dEntrega;
    }

    public void setdEntrega(String dEntrega) {
        this.dEntrega = dEntrega;
    }
}
