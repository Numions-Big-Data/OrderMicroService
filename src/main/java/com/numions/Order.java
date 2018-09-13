package com.numions;

public class Order {
    int nPedido;
    boolean estado;
    String nombre;
    String apellido;
    String calle;
    int dia;
    String horario;
    String pago;

    public Order(int nPedido, boolean estado, String nombre, String apellido, String calle, int dia, String horario, String pago) {
        this.nPedido = nPedido;
        this.estado = estado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.calle = calle;
        this.dia = dia;
        this.horario = horario;
        this.pago = pago;
    }


    public int getnPedido() {
        return nPedido;
    }

    public void setnPedido(int nPedido) {
        this.nPedido = nPedido;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Order{" +
                "nPedido=" + nPedido +
                ", estado=" + estado +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", calle='" + calle + '\'' +
                ", dia=" + dia +
                ", horario='" + horario + '\'' +
                ", pago='" + pago + '\'' +
                '}';
    }

    public void setPago(String pago) {
        this.pago = pago;
    }
}
