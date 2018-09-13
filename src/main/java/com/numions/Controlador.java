package com.numions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controlador {
    //Checkout,  add shipping address, select delivery time, perfom payment creditcard ,Summit order,

    //com.example.Order Pedido = new com.example.Order(10,false);
    public ListadoPedidos listado = new ListadoPedidos();

    @PostMapping("SummitOrder/{idpedido}/{nombre}/{apellido}/{calle}")
    public ResponseEntity<String> LanzarPedido(@PathVariable int idpedido,@PathVariable String nombre, @PathVariable String apellido, @PathVariable String calle){

        Order nuevopedido = new Order(idpedido,true,nombre,apellido,calle,0,"", "");

        listado.addOrder(nuevopedido);

        return new ResponseEntity<String>("Se ha aniadido correctamente",HttpStatus.OK);

        //listado.addOrder(Pedido);

    }
    @PostMapping("deliveryTime/{idpedido}/{dia}/{horario}")
    public ResponseEntity<String> LanzarPedido(@PathVariable int idpedido, @PathVariable int dia ,@PathVariable String horario){

        for (Order r : listado.listadoPedidos){
            if(r.nPedido==idpedido){
                r.setDia(dia);
                r.setHorario(horario);
            }
        }


        return new ResponseEntity<String>("Se ha actualizado la fecha de entrega",HttpStatus.OK);

        //listado.addOrder(Pedido);

    }

    @PostMapping("payMethod/{idpedido}/{metodo}")
    public ResponseEntity<String> LanzarPedido(@PathVariable int idpedido, @PathVariable String metodo){

        for (Order r : listado.listadoPedidos){
            if(r.nPedido==idpedido){
                r.setPago(metodo);
            }
        }


        return new ResponseEntity<String>("Se ha actualizado el metodo de pago",HttpStatus.OK);

        //listado.addOrder(Pedido);

    }

    @GetMapping("Pedidos")
    public ResponseEntity<String> pedidos(){
        String pedidos = "";

        if(listado.listadoPedidos.size() ==0){
            pedidos = "no hay pedidos";
        }
        else {
            for (Order r : listado.listadoPedidos){
                pedidos += r.toString()+"\n";
            }
        }


        return new ResponseEntity<String>(pedidos,HttpStatus.OK);

    }




        @PostMapping("SummitOrder/{idPedido}")
    public ResponseEntity<Order> LanzarPedido(@PathVariable int idPedido ){

        if (listado.listadoPedidos.size() ==0){
            String devoler = "No hay pedidos pendientes";
        }
        else{

        }

        //listado.addOrder(Pedido);
            return null;

    }


}
