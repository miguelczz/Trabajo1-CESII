package com.trabajo1.trabajo1.repositories;

import com.trabajo1.trabajo1.models.Cliente;

import java.util.Arrays;
import java.util.List;

public class Clientes {

    public final static List<Cliente> lista = Arrays.asList(

            new Cliente("Jorge", "3114325043", Arrays.asList(
                    Pedidos.lista.get(0),
                    Pedidos.lista.get(3)
            )),
            new Cliente("Carlos", "3124563062", List.of()),
            new Cliente("Jhon", "3104320123", Arrays.asList(
                    Pedidos.lista.get(1)
            )),
            new Cliente("Rodrigo", "320194312", Arrays.asList(
                    Pedidos.lista.get(2)
            )),
            new Cliente("Bertulfo", "3145809318", List.of()),
            new Cliente("Ernesto", "3112939462", Arrays.asList(
                    Pedidos.lista.get(5)
            )),
            new Cliente("Jose", "3108732718", Arrays.asList(
                    Pedidos.lista.get(4),
                    Pedidos.lista.get(3),
                    Pedidos.lista.get(2),
                    Pedidos.lista.get(0)
            )),
            new Cliente("Mariana", "3174520938", Arrays.asList(
                    Pedidos.lista.get(0),
                    Pedidos.lista.get(1)
            )),
            new Cliente("Luisa", "3139082714", List.of()),
            new Cliente("Andres", "3140982345", Arrays.asList(
                    Pedidos.lista.get(2),
                    Pedidos.lista.get(5)
            )),
            new Cliente("Camila", "3128734650", Arrays.asList(
                    Pedidos.lista.get(4)
            )),
            new Cliente("Felipe", "3167450938", List.of()),
            new Cliente("Daniela", "3109283746", Arrays.asList(
                    Pedidos.lista.get(1),
                    Pedidos.lista.get(3)
            )),
            new Cliente("Mateo", "3156789032", Arrays.asList(
                    Pedidos.lista.get(0)
            )),
            new Cliente("Sofia", "3115678390", List.of()),
            new Cliente("Valentina", "3192837465", Arrays.asList(
                    Pedidos.lista.get(2),
                    Pedidos.lista.get(4),
                    Pedidos.lista.get(5)
            )),
            new Cliente("Manuel", "3139082736", List.of()),
            new Cliente("Isabella", "3104567389", Arrays.asList(
                    Pedidos.lista.get(1)
            )),
            new Cliente("Sebastian", "3129083746", Arrays.asList(
                    Pedidos.lista.get(3),
                    Pedidos.lista.get(0)
            )),
            new Cliente("Natalia", "3140982736", List.of())
    );
}