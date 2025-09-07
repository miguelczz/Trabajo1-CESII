package com.trabajo1.trabajo1.repositories;

import com.trabajo1.trabajo1.models.Pedido;

import java.util.Arrays;
import java.util.List;

public class Pedidos {
    public final static List<Pedido> lista = Arrays.asList(
            new Pedido("0", "Celular", 2000000),
            new Pedido("1", "Computador", 3500000),
            new Pedido("2", "Pintura", 230000),
            new Pedido("3", "Mesa", 400000),
            new Pedido("4", "Camiseta", 80000),
            new Pedido("5", "Medicamentos", 120000)
    );
}
