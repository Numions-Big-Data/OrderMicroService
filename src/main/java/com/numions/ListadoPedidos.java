package com.numions;

import java.util.ArrayList;

public class ListadoPedidos {

   ArrayList<Order> listadoPedidos;

    public ListadoPedidos() {
        listadoPedidos = new ArrayList<Order>();
    }

    public void addOrder(Order pedido){
        listadoPedidos.add(pedido);

    }

    public ArrayList<Order> getListadoPedidos() {
        return listadoPedidos;
    }

    public void setListadoPedidos(ArrayList<Order> listadoPedidos) {
        this.listadoPedidos = listadoPedidos;
    }

    public Order getOrder(int idpedido){
        return listadoPedidos.get(idpedido);
    }
}
