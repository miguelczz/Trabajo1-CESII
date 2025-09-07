package com.trabajo1.trabajo1.models;

import java.util.List;

public class Cliente {
    private final String nombre;
    private final String telefono;
    private final List<Pedido> pedidos;

    public Cliente(String nombre, String telefono, List<Pedido> pedidos) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.pedidos = pedidos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }
}
