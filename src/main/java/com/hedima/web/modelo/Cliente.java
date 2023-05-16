package com.hedima.web.modelo;

public class Cliente {

    //1. Atributos
    private int idCliente;
    private String nombre;

    private String domicilio;

    private String pais;
    //2. Métodos

    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente=" + idCliente +
                ", nombre='" + nombre + '\'' +
                ", domicilio='" + domicilio + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }

    //3. Constructores
    public Cliente() {}

    public Cliente(int idCliente, String nombre, String domicilio, String pais) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.pais = pais;
    }

    //4. Setters y getters


    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
